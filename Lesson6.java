// 10000�ȉ��̋����̂����A�ȉ��̑�����s�����Ƃ��Ɂu�ŏ��̐��ɖ߂鐔�v�̌������߂�
// n�������̂Ƃ��A����̂�n��3��������1�𑫂��A����ȊO�̂Ƃ���n��2�Ŋ���
// n����̂Ƃ��An��3��������1�𑫂�
public class Lesson6{
    public static void main(String[] args) {
        int number;
	int count = 0;

	for( int i = 2; i <= 10000; i = i+2 ){
	// ����̏����̂ݕʂɏ���
	number = 0;
	number = (i * 3) + 1;

		while( number != i && number != 1 ){

			if( number % 2 == 0 ){ // �����̂Ƃ�
				number = number / 2;

			} else { // ��̂Ƃ�
				number = (number * 3) + 1;

			}
		}

		if( number == i ) count += 1;

        }
	// ������\��
	System.out.println("Answer is " + count + ".");
    }
}