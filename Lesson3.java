// �������ɒu����Ă���1�`100���̃J�[�h��n�Ԗڂ̃J�[�h����n-1�������ɃJ�[�h�𗠕Ԃ�������A�ǂ̃J�[�h�̌������ς��Ȃ��Ȃ�܂ő�����
// ���̂Ƃ��������ɂȂ��Ă���J�[�h�̔ԍ���S�ċ��߂�B�����������2�Ԗڂ̃J�[�h����s���B
import java.util.Arrays;

public class Lesson3{
	public static void main(String[]args){

		// 1�`100���̃J�[�h��������
		boolean[] cardArray = new boolean[101]; // ����false
		Arrays.fill(cardArray,false);

		for (int i = 2; i < cardArray.length ; i++ ){
			int j = i;
			while( j  < cardArray.length ){
				// �J�[�h�𔽓]������
				if( !cardArray[j]){
					cardArray[j] = true;
				} else {
					cardArray[j] = false;
				}
				// n-1�������ɗ��Ԃ�
				j += i;
			}
		}

		// �������ɂȂ��Ă���J�[�h�����߂�
		for (int k = 1; k < cardArray.length ; k++ ){
			if( !cardArray[k] ){
				// �𓚂�\��
				System.out.println("Answer is " + k + ".");
			}
		}

	}
}