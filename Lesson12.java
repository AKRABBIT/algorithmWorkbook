import java.util.HashSet;

// �������������ŕ\�����Ƃ���0�`9�܂ł̐������ł������S�Č����ŏ��̐��������߂�
// ���̕������݂̂�ΏۂƂ��A���������܂ޏꍇ�Ə������݂̂̏ꍇ�����߂�
public class Lesson12{
    public static void main(String[] args) {

    	double squareRoot;
    	int squareRootIntegers;
    	double squareRootDecimals;
        HashSet hsSquareRoot = new HashSet();
        int answer1 = 0;
        int answer2 = 0;

        // ���������܂ޏꍇ_Loop1
        for( double i=1; hsSquareRoot.size() < 10; i++ ){
        	// ������
        	hsSquareRoot.clear();

        	// ���������擾
        	squareRoot = Math.sqrt(i);

        	// �������Ə��������擾
        	squareRootIntegers = (int) (squareRoot / 1);
        	squareRootDecimals = squareRoot % 1;

        	String strSquareRootIntegers = String.valueOf(squareRootIntegers);
        	String strSquareRootDecimals = String.valueOf(squareRootDecimals);
        	// �����_����я����_�O�̃[��������
        	String edit_strSquareRootDecimals = strSquareRootDecimals.substring( 2, strSquareRootDecimals.length() );

        	String[] arrSquareRootIntegers = strSquareRootIntegers.split("");
        	String[] arrstrSquareRootDecimals = edit_strSquareRootDecimals.split("");

        	// �z�����ɂ܂Ƃ߂�
        	int length = arrSquareRootIntegers.length +arrstrSquareRootDecimals.length;
        	String[] arrSquareRoot = new String[length];
        	System.arraycopy(arrSquareRootIntegers, 0, arrSquareRoot, 0, arrSquareRootIntegers.length);
        	System.arraycopy(arrstrSquareRootDecimals, 0, arrSquareRoot, arrSquareRootIntegers.length, arrstrSquareRootDecimals.length);

        	// ������10���擾
        	int forLength1;
        	if(arrSquareRoot.length > 10){
        		forLength1 = 10;
        	} else {
        		forLength1 = arrSquareRoot.length;
        	}

        	for(int j=0; j < forLength1; j++){
        		String strJ = arrSquareRoot[j];
        		hsSquareRoot.add(strJ);
        	}

        	// �𓚂�ێ�
        	answer1 = (int)i;
        }
        // ������
    	hsSquareRoot.clear();

        // �������݂̂̏ꍇ_Loop2
        for( double k=1; hsSquareRoot.size() < 10; k++ ){

        	// ������
        	hsSquareRoot.clear();

        	// ���������擾
        	squareRoot = Math.sqrt(k);

        	// ���������擾
        	squareRootDecimals = squareRoot % 1;

        	String strSquareRootDecimals2 = String.valueOf(squareRootDecimals);
        	// �����_����я����_�O�̃[��������
        	strSquareRootDecimals2 = strSquareRootDecimals2.substring( 2, strSquareRootDecimals2.length() );

        	String[] arrstrSquareRootDecimals2 = strSquareRootDecimals2.split("");

        	// ������10���擾
        	int forLength2;
        	if(arrstrSquareRootDecimals2.length > 10){
        		forLength2 = 10;
        	} else {
        		forLength2 = arrstrSquareRootDecimals2.length;
        	}
        	for(int l=0; l < forLength2 ; l++){
        		String strL = arrstrSquareRootDecimals2[l];
        		hsSquareRoot.add(strL);
        	}

        	// �𓚂�ێ�
        	answer2 = (int)k;
        }

        System.out.println( "Answer1:" + answer1);
        System.out.println( "Answer2:" + answer2);

    }

}