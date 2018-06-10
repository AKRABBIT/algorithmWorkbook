// ���[���s�A���X�^�C���ƃA�����J���X�^�C���̃��[���b�g������B
// 2<=n<=36�̂��ꂼ���n�ɂ��āA�A������n�̐��̘a���ő�ɂȂ�ꍇ�����߁A
// ���[���s�A���X�^�C���̘a���A�����J���X�^�C���̘a�����������Ȃ�n���������邩�\������B
public class Lesson10{

	// �A�����J���X�^�C�� 38��
	private static final int[] americanArr = {0,28,9,26,30,11,7,20,32,17,
	    										   5,22,34,15,3,24,36,13,1,0, // 00
	    										   27,10,25,29,12,8,19,31,18,6,
	    										   21,33,16,4,23,35,14,2
	    										   };
	// �����[�s�A���X�^�C�� 37��
	private static final int[] europeanArr = {0,32,15,19,4,21,2,25,17,34,
	    										   6,27,13,36,11,30,8,23,10,5,
	    										   24,16,33,1,20,14,31,9,22,18,
	    										   29,7,28,12,35,3,26
	    										   };

    public static void main(String[] args) {

        // �v�Z���������邽�߂̃C���i�[�N���X��錾
        class CalcuForLesson10{
            int calcu( int[] style, int targetRange ) {

            	int tmp = 0;
            	int max = 0;

            	// �z��̍�����A������n�̐��̘a�����߂�
            	for( int i = 0; i < targetRange; i++ ){
            		tmp += style[i];
            	}
            	max = tmp;

            	// ���Z�ʒu��1���E�ւ��炵�Ȃ���ő�l�����߂�
            	for( int j = 0; j < style.length; j++ ){
            		tmp += style[ ( j + targetRange ) % style.length ]; // �z��̖��[�ɒB������ŏ��֖߂�
            		tmp -= style[j]; // ���[�̐�������
            		
            		if( tmp > max ){
            			max = tmp;
            		}
            	}

            return max;
            }
        }
        // ���C������
        int count = 0;
        int start = 2; // �J�n�l
        int end   = 36;// �I���l
        
        CalcuForLesson10 calcu = new CalcuForLesson10();
        
        // ���[���s�A���X�^�C���̘a���A�����J���X�^�C���̘a�����������Ȃ�΃J�E���g+1
        for( int x = start; x <= end; x++ ){
        	if ( calcu.calcu(americanArr, x) > calcu.calcu(europeanArr, x) ){
        		count += 1;
        	}
        }
    	System.out.println("���[���s�A���X�^�C���̘a���A�����J���X�^�C���̘a�����������Ȃ�n��");
    	System.out.println( String.format("�S����%d��", count) );
    }

}