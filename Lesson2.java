// 1000�`9999�̂����u����ł��鐔�̊e���̊ԂɎl�����Z����ꂽ�v�Z���ʁv���u���̐����t������ׂ����v�ƂȂ鐔�����߂�
// �Œ�ł���͉��Z�q������
public class Lesson2{
	public static void main(String[]args) throws Exception{
		int intCreateNumber1, intCreateNumber2, intCreateNumber3,
			intCreateNumber4, intCreateNumber5, intCreateNumber6;
		int number = 1000;

		// �T���͈͂�1000�`9999
		while ( number < 10000 ){

			// ���̐����t������ׂ�
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

			int int1 = Integer.parseInt(s1); // ��̈�
			int int1to2 = Integer.parseInt(s1to2); // ��2��
			int int1to3 = Integer.parseInt(s1to3); // ��3��
			int int2 = Integer.parseInt(s2); // �S�̈�
			int int2to4 = Integer.parseInt(s2to4); // ��3��
			int int3 = Integer.parseInt(s3); // �\�̈�
			int int3to4 = Integer.parseInt(s3to4); // ��2��
			int int4 = Integer.parseInt(s4); // ��̈�

			// ��@�ȊO�̉��Z�q�͏����𖞂����Ȃ����ߏ��O����
			// �p�^�[����ԗ�
			intCreateNumber1 = int1 * int2to4;
			intCreateNumber2 = int1to2 * int3to4;
			intCreateNumber3 = int1to3 * int4;
			intCreateNumber4 = int1 * int2 * int3 * int4;
			intCreateNumber5 = int1 * int2 * int3to4;
			intCreateNumber6 = int1to2 * int3 * int4;

			// �����𖞂���������
			if( intReverseNumber == intCreateNumber1 || intReverseNumber == intCreateNumber2 ||
				intReverseNumber == intCreateNumber3 || intReverseNumber == intCreateNumber4 ||
				intReverseNumber == intCreateNumber5 || intReverseNumber == intCreateNumber6
					){
				System.out.println("Answer is " + number + ".");
			}

			// ���̐���T��
			number = number + 1;

		}
	}
}