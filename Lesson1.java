// 10進数、2進数、8進数のいずれの場合でも回文数となる数字のうち、10進数の10以上で最小の数を求める
public class Lesson1 {
	public static void main(String[]args){
		int number = 11; // 探索開始

		while( true ){

			String strDecimal    = String.valueOf(number);
			String strBinary = Integer.toBinaryString(number);
			String strOctal  = Integer.toOctalString(number);

			StringBuffer sbReverseDecimal = new StringBuffer(strDecimal);
			sbReverseDecimal.reverse();
			String strReverseDecimal = sbReverseDecimal.toString();

			StringBuffer sbReverseBinary = new StringBuffer(strBinary);
			sbReverseBinary.reverse();
			String strReverseBinary = sbReverseBinary.toString();

			StringBuffer sbReverseOctal = new StringBuffer(strOctal);
			sbReverseOctal.reverse();
			String strReverseOctal = sbReverseOctal.toString();

			// 回文数か判定
			if( strDecimal.equals( strReverseDecimal )){
				if( strBinary.equals( strReverseBinary )){
					if (strOctal.equals( strReverseOctal )){

						// 最小の回文数を表示し、ループを抜ける
						System.out.println("Answer is "+number);
						break;
					}
				}
			}

		// 奇数のみを探索
		number += 2;

		}
	}
}
