package algorithmWorkbook;
import java.util.Arrays;

import org.uncommons.maths.combinatorics.CombinationGenerator;
// ����K�i��������A���񂪏オ��A�����ɏォ��B���񂪉���Ă���B
// 10�i�̊K�i�ňړ�����ꍇ�A2�l�������i�Ɏ~�܂�͉̂��ʂ肠�邩���߂�B
// �������K�i�́A�ő��4�i�܂ň�C�ɐi�ނ��Ƃ��ł�����̂Ƃ���B
public class Lesson16{

	static int answerCount = 0;

    public static void main(String[] args) {

    	int maxNumber = 500;

    	for(int square = 1; square <= maxNumber/4; square++){

    		if(square - 1 <= 0){
    			continue;
    		}
    		int arr_size = square;

    		// �g�ݍ��킹�����߂������͈̔͂�z��Ɋi�[
    		Integer[] arr_Range = new Integer[arr_size];

    		for(Integer j = 1; j <= arr_Range.length; j++){
    			arr_Range[j-1] = j;
    		}

    		// �g�ݍ��킹�����߂�
    		CombinationGenerator<Integer> gen = new CombinationGenerator<>( Arrays.asList(arr_Range), 2 );

    		// �g�ݍ��킹�̎��o��
    		while(gen.hasMore()){
    			Object[] arr_gen = gen.nextCombinationAsArray();

    			// �����ł�2�ʂ�̐������o�����ߌŒ�l�ŃC���f�b�N�X�w��
    			int rectangle1 = (int) arr_gen[0];
    			int rectangle2 = (int) arr_gen[1];

    			// �s�^�S���X��������
    			if((rectangle1 * rectangle1) + (rectangle2 * rectangle2) == square * square ){

    				// �����`���m�̍ő���񐔂�1�Ȃ�΃J�E���g
    				int tmp;
    				while( (tmp = rectangle1 % rectangle2) != 0){
    					rectangle1 = rectangle2;
    					rectangle2 = tmp;
    				}
    				if(rectangle2 ==1){
    					answerCount++;
    				}
    			}
    		}
    		gen.reset();
    	}

    	// �𓚂�\��
    	System.out.println( "Answers: " + answerCount + " patterns." );

    }

}