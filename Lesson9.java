public class Lesson9
{
    public static void main(String[] args) {

        // 計算処理をするためインナークラスを宣言
        class CalcuForLesson9{
            int calcu( int intMale, int intFemale ) {
                
                // 0人の場合もカウントするため+1
                intMale   += 1;
                intFemale += 1;
                
                // 多次元配列を作成し0で初期化
            	  int[][] peopleAry = new int[intFemale][intMale];
            	  for( int i=0; i < intFemale; i++ ){
            		    for( int j=0; j < intMale; j++ ){
            		        peopleAry[i][j] = 0;
            		    }
            	  }
            	
            	  // 開始時は男女ともに0人となる1通り
            	  peopleAry[0][0] = 1;
            	
            	  for( int k=0; k < intFemale; k++ ){
            	      for( int l=0; l < intMale; l++ ){
            	        
            	          // 同数でないとき
            	          if( k != l && intMale-l != intFemale-k ){
            	              if( l>0 ){
            	                  // 移動元の数を移動先へ加算_上移動
            	                  peopleAry[k][l] += peopleAry[k][l-1];
            	              }
            	              if( k>0 ){
            	                  // 移動元の数を移動先へ加算_右移動
            	                  peopleAry[k][l] += peopleAry[k-1][l];
            	              }
            	          }
            	      }
            	  }
            	
            int count = 0;
            count += peopleAry[intFemale-2][intMale-1] + peopleAry[intFemale-1][intMale-2];
            
            return count;
            }
        }

        // 男女の数を設定
    	  int male   = 20;
    	  int female = 10;
    	
    	  // 関数呼び出し
    	  CalcuForLesson9 calculation = new CalcuForLesson9();
    	  int answer = calculation.calcu( male,female );
        System.out.println( String.format("Total: %d", answer) );
    }
}
