// 1000‰~ŽD‚ð“ü‚ê‚½‚Æ‚«‚Éo‚Ä‚­‚éŒø‰Ê‚Ì‘g‚Ý‡‚í‚¹‚ª‰½’Ê‚è‚ ‚é‚©‹‚ß‚é
// d‰Ý‚Ì‡”Ô‚Í‹æ•Ê‚µ‚È‚¢
// d‰Ý‚ÍÅ‘å15–‡‚Æ‚·‚é
// Žg—p‚Å‚«‚éd‰Ý‚Í10‰~‹ÊA50‰~‹ÊA100‰~‹ÊA500‰~‹Ê‚Æ‚·‚é
public class Lesson5{
    public static void main(String[] args) {
	int coins_500 = 500;
	int coins_100 = 100;
	int coins_50 = 50;
	int coins_10 = 10;
	int target = 1000;
	int answer = 0;    // ‰ð“š

	int i2 = (target / coins_500) > 15 ? 15 : (target / coins_500);
	int j2 = (target / coins_100) > 15 ? 15 : (target / coins_100);
	int k2 = (target / coins_50 ) > 15 ? 15 : (target / coins_50);
	int l2 = (target / coins_10 ) > 15 ? 15 : (target / coins_10);

	for( int i = 0; i <= i2; i++ ){

		for( int j = 0; j <= j2; j++ ){

			for( int k = 0; k <= k2; k++ ){

				for( int l = 0; l <= l2; l++ ){

					// ðŒ‚ð–ž‚½‚·‘g‚Ý‡‚í‚¹‚Ì‚ÝƒJƒEƒ“ƒg
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