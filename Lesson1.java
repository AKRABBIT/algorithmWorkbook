// 10�i���A2�i���A8�i���̂�����̏ꍇ�ł��񕶐��ƂȂ鐔���̂����A10�i����10�ȏ�ōŏ��̐������߂�
public class Lesson1 {
	public static void main(String[]args){
		int number = 11; // �T���J�n

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

			// �񕶐�������
			if( strDecimal.equals( strReverseDecimal )){
				if( strBinary.equals( strReverseBinary )){
					if (strOctal.equals( strReverseOctal )){

						// �ŏ��̉񕶐���\�����A���[�v�𔲂���
						System.out.println("Answer is "+number);
						break;
					}
				}
			}

		// ��݂̂�T��
		number += 2;

		}
	}
}
