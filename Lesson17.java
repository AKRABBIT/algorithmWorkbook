package algorithmWorkbook;

// 30�l��1��ɕ��ׂ�Ƃ��̒j���̕��ו������ʂ肠�邩�l����B
// �������������ׂ荇�����Ƃ͂Ȃ��A�j���͉��l����ł��悢���̂Ƃ���B

public class Lesson17{

    public static void main(String[] args) {

    	int maxCount = 30; // �l����ς���Ƃ��͂��̐���ύX
    	int lngMan = 1;
    	int lngWoman = 0;
    	int lngPreMan = lngMan;
    	int lngPreWoman = lngWoman;
	int loopCount = 0;

	// �l�������[�v
    	while( loopCount < maxCount ){

		lngPreMan = lngMan;
    		lngPreWoman = lngWoman;
		
		// n-1�l�܂ŕ���ł����Ԃ���X�^�[�g
		// ���ɒj�������Ԃ̂́A�O���j���̏ꍇ+�O�������̏ꍇ
    		lngMan = lngPreMan + lngPreWoman;
		// ���ɏ��������Ԃ̂́A�O���j���̏ꍇ�̂�
    		lngWoman = lngPreMan;

    		loopCount++;
    	}

    	// �𓚂�\��
	int answer = lngMan + lngWoman;
    	System.out.println( "Answers: " + answer );

    }

}