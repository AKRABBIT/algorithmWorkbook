import java.util.ArrayList;
import java.util.List;
// �O�㍶�E�ɂ݈̂ړ��ł��A��x�ʂ����o�H��ʂ�Ȃ��|�����{�b�g������B
// ���̃��{�b�g��12��ړ�����Ƃ��A�l������ړ��o�H�̃p�^�[���͉��ʂ肩���߂�B
public class Lesson8{
	    private static final int maxCount = 12 + 1;
        private static int count = 0;

    public static void main(String[] args) {

        // �ċN���������邽�߃C���i�[�N���X��錾
        // �����𖞂����ړ��o�H�̐���Ԃ�
        class Check{
            int move( int[][] argArray ) {

                // �I������
                if ( argArray.length == maxCount ){
                	count += 1;
                	return count;
                }
                //if ( argArray.length == maxCount + 1 )return 1;

            	int movePattern[][] = {{0,1}, {0,-1}, {1,0}, {-1,0}};
            	for( int i=0; i < movePattern.length; i++ ){

            		// �ړ��ς݂̍��W�����X�g�ɕێ�
            		List<String> pastRoadList = new ArrayList<>();

            		for( int j=0; j < argArray.length; j++ ){
                		String strX = String.valueOf(argArray[j][0]);
                		String strY = String.valueOf(argArray[j][1]);
                		String strPastRoad = strX + strY;
                		pastRoadList.add(strPastRoad);
            		}

            		// �ړ���̍��W���擾
            		String strAfterMoveX = String.valueOf( argArray[ argArray.length -1 ][0] + movePattern[i][0]);
            		String strAfterMoveY = String.valueOf( argArray[ argArray.length -1 ][1] + movePattern[i][1]);

            		String strAfterMove = strAfterMoveX + strAfterMoveY;

            		// �ړ��ς݂łȂ���Έړ�
                	if( !pastRoadList.contains(strAfterMove) ){

                		// �ړ��ςݍ��W���܂߂��V�����z��𐶐�
                		int[][] argArray2 = new int[argArray.length + 1][2];
                		for(int index=0; index < argArray.length; index++){
                			argArray2[index][0] = argArray[index][0];
                			argArray2[index][1] = argArray[index][1];
                		}
                		argArray2[argArray.length][0] = argArray[ argArray.length -1 ][0] + movePattern[i][0];
                		argArray2[argArray.length][1] = argArray[ argArray.length -1 ][1] + movePattern[i][1];

                		// �ċA����
//                		count += move(argArray2);
                		move(argArray2);
                	}
            	}
            // �I�������𖞂����Ȃ��ꍇ�A���[�v���I�������0��Ԃ��ďI��
            return 0;
            }
        }

    	// �X�^�[�g�ʒu�̍��W
        int[][] argArray = {{0,0}};

    	Check moveCheck = new Check();
    	moveCheck.move( argArray );
        System.out.println( String.format("�S����%d�ʂ�", count) );

    }

}