import java.util.ArrayList;
import java.util.List;
// 前後左右にのみ移動でき、一度通った経路を通らない掃除ロボットがある。
// このロボットが12回移動するとき、考えられる移動経路のパターンは何通りか求める。
public class Lesson8{
	    private static final int maxCount = 12 + 1;
        private static int count = 0;

    public static void main(String[] args) {

        // 再起処理をするためインナークラスを宣言
        // 条件を満たす移動経路の数を返す
        class Check{
            int move( int[][] argArray ) {

                // 終了条件
                if ( argArray.length == maxCount ){
                	count += 1;
                	return count;
                }

            	int movePattern[][] = {{0,1}, {0,-1}, {1,0}, {-1,0}};
            	for( int i=0; i < movePattern.length; i++ ){

            		// 移動済みの座標をリストに保持
            		List<String> pastRoadList = new ArrayList<>();

            		for( int j=0; j < argArray.length; j++ ){
                		String strX = String.valueOf(argArray[j][0]);
                		String strY = String.valueOf(argArray[j][1]);
                		String strPastRoad = strX + strY;
                		pastRoadList.add(strPastRoad);
            		}

            		// 移動後の座標を取得
            		String strAfterMoveX = String.valueOf( argArray[ argArray.length -1 ][0] + movePattern[i][0]);
            		String strAfterMoveY = String.valueOf( argArray[ argArray.length -1 ][1] + movePattern[i][1]);

            		String strAfterMove = strAfterMoveX + strAfterMoveY;

            		// 移動済みでなければ移動
                	if( !pastRoadList.contains(strAfterMove) ){

                		// 移動済み座標を含めた新しい配列を生成
                		int[][] argArray2 = new int[argArray.length + 1][2];
                		for(int index=0; index < argArray.length; index++){
                			argArray2[index][0] = argArray[index][0];
                			argArray2[index][1] = argArray[index][1];
                		}
                		argArray2[argArray.length][0] = argArray[ argArray.length -1 ][0] + movePattern[i][0];
                		argArray2[argArray.length][1] = argArray[ argArray.length -1 ][1] + movePattern[i][1];

                		// 再帰処理
                		move(argArray2);
                	}
            	}
            // 終了条件を満たさない場合、ループが終わったら0を返して終了
            return 0;
            }
        }

    	// スタート位置の座標
        int[][] argArray = {{0,0}};

    	Check moveCheck = new Check();
    	moveCheck.move( argArray );
        System.out.println( String.format("全部で%d通り", count) );

    }

}
