import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

// 年月日をYYYYMMDDの8ケタの整数で表したとき、
// 2進数に変換して逆から並べ、さらに10進数に戻し、元の日付と同じ日付になるものを探す
// 期間は1964年10月10日～2020年7月24日とする
public class Lesson7 {
	public static void main(String[]args){

		// 答えを保持するリスト
		ArrayList arrAnswer = new ArrayList();
		// エラーを保持するリスト
		ArrayList errorList = new ArrayList();

		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		format.setLenient(false);

		for( int day = 19641010; day <= 20200724; day++ ){

			try{
				String strDay1 = String.valueOf(day);
				String strDay2 = format.format (format.parse(strDay1) );

				if ( !strDay1.equals(strDay2) ) {
					continue;
				}
			} catch( ParseException p ) {
				errorList.add(day);
				continue;
			}

			// 日付を2進数へ変換
			String strBinaryDay = Integer.toBinaryString(day);
			StringBuffer sbReverseBinaryDay = new StringBuffer(strBinaryDay);

			// 逆から並べる
			sbReverseBinaryDay.reverse();
			String strReverseBinaryDay = sbReverseBinaryDay.toString();
			//int intReverseBinaryDay = Integer.parseInt(strReverseBinaryDay);

			// 再び10進数へ戻す
			int intDecimalDay = Integer.parseInt(strReverseBinaryDay, 2);
			//String strDecimalDay = Integer.toBinaryString(intReverseBinaryDay);
			//int intDecimalDay = Integer.parseInt(strDecimalDay);
			//int intDecimalDay = Integer.parseInt(strDecimalDay, 2);

			// 元の数と同じか判定
			if( intDecimalDay == day ){
				arrAnswer.add(day);
			}

		}

		// 答えを表示
		Iterator itrAnswer = arrAnswer.iterator();
		while( itrAnswer.hasNext() ){
			System.out.println( "Answer :" +  itrAnswer.next() );
		}

	}
}
