// 1000円札を入れたときに出てくる効果の組み合わせが何通りあるか求める
// 硬貨の順番は区別しない
// 硬貨は最大15枚とする
// 使用できる硬貨は10円玉、50円玉、100円玉、500円玉とする
public class Lesson5{
    public static void main(String[] args) {
	int coins_500 = 500;
	int coins_100 = 100;
	int coins_50 = 50;
	int coins_10 = 10;
	int target = 1000;
	int answer = 0;    // 解答

	int i2 = (target / coins_500) > 15 ? 15 : (target / coins_500);
	int j2 = (target / coins_100) > 15 ? 15 : (target / coins_100);
	int k2 = (target / coins_50 ) > 15 ? 15 : (target / coins_50);
	int l2 = (target / coins_10 ) > 15 ? 15 : (target / coins_10);

	for( int i = 0; i <= i2; i++ ){

		for( int j = 0; j <= j2; j++ ){

			for( int k = 0; k <= k2; k++ ){

				for( int l = 0; l <= l2; l++ ){

					// 条件を満たす組み合わせのみカウント
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