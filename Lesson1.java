import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

// �N������YYYYMMDD��8�P�^�̐����ŕ\�����Ƃ��A
// 2�i���ɕϊ����ċt������ׁA�����10�i���ɖ߂��A���̓��t�Ɠ������t�ɂȂ���̂�T��
// ���Ԃ�1964�N10��10���`2020�N7��24���Ƃ���
public class Lesson7 {
	public static void main(String[]args){

		// ������ێ����郊�X�g
		ArrayList arrAnswer = new ArrayList();
		// �G���[��ێ����郊�X�g
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

			// ���t��2�i���֕ϊ�
			String strBinaryDay = Integer.toBinaryString(day);
			StringBuffer sbReverseBinaryDay = new StringBuffer(strBinaryDay);

			// �t������ׂ�
			sbReverseBinaryDay.reverse();
			String strReverseBinaryDay = sbReverseBinaryDay.toString();
			//int intReverseBinaryDay = Integer.parseInt(strReverseBinaryDay);

			// �Ă�10�i���֖߂�
			int intDecimalDay = Integer.parseInt(strReverseBinaryDay, 2);
			//String strDecimalDay = Integer.toBinaryString(intReverseBinaryDay);
			//int intDecimalDay = Integer.parseInt(strDecimalDay);
			//int intDecimalDay = Integer.parseInt(strDecimalDay, 2);

			// ���̐��Ɠ���������
			if( intDecimalDay == day ){
				arrAnswer.add(day);
			}

		}

		// ������\��
		Iterator itrAnswer = arrAnswer.iterator();
		while( itrAnswer.hasNext() ){
			System.out.println( "Answer :" +  itrAnswer.next() );
		}

	}
}
