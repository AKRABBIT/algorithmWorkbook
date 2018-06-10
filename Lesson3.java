// 裏向きに置かれている1～100枚のカードをn番目のカードからn-1枚おきにカードを裏返す操作を、どのカードの向きも変わらなくなるまで続ける
// このとき裏向きになっているカードの番号を全て求める。ただし操作は2番目のカードから行う。
import java.util.Arrays;

public class Lesson3{
	public static void main(String[]args){

		// 1～100枚のカードを初期化
		boolean[] cardArray = new boolean[101]; // 裏がfalse
		Arrays.fill(cardArray,false);

		for (int i = 2; i < cardArray.length ; i++ ){
			int j = i;
			while( j  < cardArray.length ){
				// カードを反転させる
				if( !cardArray[j]){
					cardArray[j] = true;
				} else {
					cardArray[j] = false;
				}
				// n-1枚おきに裏返す
				j += i;
			}
		}

		// 裏向きになっているカードを求める
		for (int k = 1; k < cardArray.length ; k++ ){
			if( !cardArray[k] ){
				// 解答を表示
				System.out.println("Answer is " + k + ".");
			}
		}

	}
}