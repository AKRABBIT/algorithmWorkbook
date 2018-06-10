// ヨーロピアンスタイルとアメリカンスタイルのルーレットがある。
// 2<=n<=36のそれぞれのnについて、連続するn個の数の和が最大になる場合を求め、
// ヨーロピアンスタイルの和がアメリカンスタイルの和よりも小さくなるnがいくつあるか表示する。
public class Lesson10{

	// アメリカンスタイル 38個
	private static final int[] americanArr = {0,28,9,26,30,11,7,20,32,17,
	    										   5,22,34,15,3,24,36,13,1,0, // 00
	    										   27,10,25,29,12,8,19,31,18,6,
	    										   21,33,16,4,23,35,14,2
	    										   };
	// ヨローピアンスタイル 37個
	private static final int[] europeanArr = {0,32,15,19,4,21,2,25,17,34,
	    										   6,27,13,36,11,30,8,23,10,5,
	    										   24,16,33,1,20,14,31,9,22,18,
	    										   29,7,28,12,35,3,26
	    										   };

    public static void main(String[] args) {

        // 計算処理をするためのインナークラスを宣言
        class CalcuForLesson10{
            int calcu( int[] style, int targetRange ) {

            	int tmp = 0;
            	int max = 0;

            	// 配列の左から連続するn個の数の和を求める
            	for( int i = 0; i < targetRange; i++ ){
            		tmp += style[i];
            	}
            	max = tmp;

            	// 加算位置を1つずつ右へずらしながら最大値を求める
            	for( int j = 0; j < style.length; j++ ){
            		tmp += style[ ( j + targetRange ) % style.length ]; // 配列の末端に達したら最初へ戻る
            		tmp -= style[j]; // 左端の数を引く
            		
            		if( tmp > max ){
            			max = tmp;
            		}
            	}

            return max;
            }
        }
        // メイン処理
        int count = 0;
        int start = 2; // 開始値
        int end   = 36;// 終了値
        
        CalcuForLesson10 calcu = new CalcuForLesson10();
        
        // ヨーロピアンスタイルの和がアメリカンスタイルの和よりも小さいならばカウント+1
        for( int x = start; x <= end; x++ ){
        	if ( calcu.calcu(americanArr, x) > calcu.calcu(europeanArr, x) ){
        		count += 1;
        	}
        }
    	System.out.println("ヨーロピアンスタイルの和がアメリカンスタイルの和よりも小さくなるnは");
    	System.out.println( String.format("全部で%d個", count) );
    }

}