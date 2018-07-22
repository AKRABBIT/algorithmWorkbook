package algorithmWorkbook;

// ある階段を下からAさんが上がり、同時に上からBさんが下りてくる。
// 10段の階段で移動する場合、2人が同じ段に止まるのは何通りあるか求める。
// ただし階段は、最大で4段まで一気に進むことができるものとする。
public class Lesson15{

	static int answerCount = 0;

    public static void main(String[] args) {

    	int stepNumber = 10;
    	int maxStepByOneMove = 4;

        // 検索関数
        class MoveStep{

            int move( int a, int b ) {

            	if( a > b ){
            		return 0;
            	}

            	if( a == b ){
            		answerCount += 1;
            		return 0;
            	}

            	for( int i = 1; i <= maxStepByOneMove; i++ ){
                	for( int j = 1; j <= maxStepByOneMove; j++ ){

                		move(a+i, b-j);

                	}
            	}
            	return 0;
            }
            
        }

	// メイン処理
	MoveStep moveStep = new MoveStep();
	moveStep.move( 0, stepNumber );
	// 解答を表示
	System.out.println( "Answers: " + answerCount + " patterns." );

    }

}