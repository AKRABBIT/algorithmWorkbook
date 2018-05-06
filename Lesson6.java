// 10000以下の偶数のうち、以下の操作を行ったときに「最初の数に戻る数」の個数を求める
// nが偶数のとき、初回のみnに3をかけて1を足し、それ以外のときはnを2で割る
// nが奇数のとき、nに3をかけて1を足す
public class Lesson6{
    public static void main(String[] args) {
        int number;
	int count = 0;

	for( int i = 2; i <= 10000; i = i+2 ){
	// 初回の処理のみ別に書く
	number = 0;
	number = (i * 3) + 1;

		while( number != i && number != 1 ){

			if( number % 2 == 0 ){ // 偶数のとき
				number = number / 2;

			} else { // 奇数のとき
				number = (number * 3) + 1;

			}
		}

		if( number == i ) count += 1;

        }
	// 答えを表示
	System.out.println("Answer is " + count + ".");
    }
}