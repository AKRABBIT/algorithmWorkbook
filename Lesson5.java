// 1000�~�D����ꂽ�Ƃ��ɏo�Ă�����ʂ̑g�ݍ��킹�����ʂ肠�邩���߂�
// �d�݂̏��Ԃ͋�ʂ��Ȃ�
// �d�݂͍ő�15���Ƃ���
// �g�p�ł���d�݂�10�~�ʁA50�~�ʁA100�~�ʁA500�~�ʂƂ���
public class Lesson5{
    public static void main(String[] args) {
	int coins_500 = 500;
	int coins_100 = 100;
	int coins_50 = 50;
	int coins_10 = 10;
	int target = 1000;
	int answer = 0;    // ��

	int i2 = (target / coins_500) > 15 ? 15 : (target / coins_500);
	int j2 = (target / coins_100) > 15 ? 15 : (target / coins_100);
	int k2 = (target / coins_50 ) > 15 ? 15 : (target / coins_50);
	int l2 = (target / coins_10 ) > 15 ? 15 : (target / coins_10);

	for( int i = 0; i <= i2; i++ ){

		for( int j = 0; j <= j2; j++ ){

			for( int k = 0; k <= k2; k++ ){

				for( int l = 0; l <= l2; l++ ){

					// �����𖞂����g�ݍ��킹�̂݃J�E���g
					if( i + j + k + l <= 15 ){
						if( (coins_500 * i) + (coins_100 * j) + (coins_50 * k) + (coins_10 * l) == 1000 ) {
							answer += 1;
						}
					}
				}
			}
		}
	}
        
        System.out.println("Answer is " + answer + ".");
        
    }
}