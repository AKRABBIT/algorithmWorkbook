package algorithmWorkbook;

// ����K�i��������A���񂪏オ��A�����ɏォ��B���񂪉���Ă���B
// 10�i�̊K�i�ňړ�����ꍇ�A2�l�������i�Ɏ~�܂�͉̂��ʂ肠�邩���߂�B
// �������K�i�́A�ő��4�i�܂ň�C�ɐi�ނ��Ƃ��ł�����̂Ƃ���B
public class Lesson15{

	static int answerCount = 0;

    public static void main(String[] args) {

    	int stepNumber = 10;
    	int maxStepByOneMove = 4;

        // �����֐�
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

	// ���C������
	MoveStep moveStep = new MoveStep();
	moveStep.move( 0, stepNumber );
	// �𓚂�\��
	System.out.println( "Answers: " + answerCount + " patterns." );

    }

}