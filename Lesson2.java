// 1000～9999のうち「並んでいる数の各桁の間に四則演算を入れた計算結果」＝「元の数を逆から並べた数」となる数を求める
// 最低でも一つは演算子を入れる
public class Lesson2{
	public static void main(String[]args) throws Exception{
		int intCreateNumber1, intCreateNumber2, intCreateNumber3,
			intCreateNumber4, intCreateNumber5, intCreateNumber6;
		int number = 1000;

		// 探索範囲は1000～9999
		while ( number < 10000 ){

			// 元の数を逆から並べる
			String strNumber    = String.valueOf(number);
			StringBuffer sbReverseNumber = new StringBuffer(strNumber);
			sbReverseNumber.reverse();
			String strReverseNumber = sbReverseNumber.toString();
			int intReverseNumber = Integer.parseInt(strReverseNumber);

			String strDecimal = String.valueOf(number);
			String s1 = strDecimal.substring(0,1);
			String s1to2 = strDecimal.substring(0,2);
			String s1to3 = strDecimal.substring(0,3);
			String s2 = strDecimal.substring(1,2);
			String s2to4 = strDecimal.substring(1,4);
			String s3 = strDecimal.substring(2,3);
			String s3to4 = strDecimal.substring(2,4);
			String s4 = strDecimal.substring(3,4);

			int int1 = Integer.parseInt(s1); // 千の位
			int int1to2 = Integer.parseInt(s1to2); // 上2桁
			int int1to3 = Integer.parseInt(s1to3); // 上3桁
			int int2 = Integer.parseInt(s2); // 百の位
			int int2to4 = Integer.parseInt(s2to4); // 下3桁
			int int3 = Integer.parseInt(s3); // 十の位
			int int3to4 = Integer.parseInt(s3to4); // 下2桁
			int int4 = Integer.parseInt(s4); // 一の位

			// 乗法以外の演算子は条件を満たさないため除外する
			// パターンを網羅
			intCreateNumber1 = int1 * int2to4;
			intCreateNumber2 = int1to2 * int3to4;
			intCreateNumber3 = int1to3 * int4;
			intCreateNumber4 = int1 * int2 * int3 * int4;
			intCreateNumber5 = int1 * int2 * int3to4;
			intCreateNumber6 = int1to2 * int3 * int4;

			// 条件を満たすか判定
			if( intReverseNumber == intCreateNumber1 || intReverseNumber == intCreateNumber2 ||
				intReverseNumber == intCreateNumber3 || intReverseNumber == intCreateNumber4 ||
				intReverseNumber == intCreateNumber5 || intReverseNumber == intCreateNumber6
					){
				System.out.println("Answer is " + number + ".");
			}

			// 次の数を探索
			number = number + 1;

		}
	}
}