// ����[n]cm��1�{�̖_��[m]�l��1[cm]�ɐ؂蕪����
// ������1�{�̖_����x�ɐ؂蕪���邱�Ƃ��ł���̂�1�l�Ƃ���
public class Lesson4{
    public static void main(String[] args) {
        int number, member, barCount; // �_�̒����A�l���A�_�̐�
        
        // �ċN���������邽�߃C���i�[�N���X��錾
        // �_��؂蕪�����񐔂�Ԃ�
        class Cut{
            int cutBar( int n, int m, int b ) {
            
            	// �_�̐��������ɒB���Ă��Ȃ��Ƃ��������s��
            	if ( b < n ) {
            	
            		// �_�̐����l���������Ȃ��Ƃ�
            		if ( b < m ) {
                		return 1 + cutBar( n, m, b*2 );
                	
                	// �_�̐����l���Ɠ������܂��͑傫���Ƃ�
            		} else {
            			return 1 + cutBar( n, m, b+m );
            		}
            	}
            	return 0; // �؂蕪�����_�̐� >= �����ł���΁A���������I��
            }
        }
        
        Cut cutting = new Cut();

        number = 20; // �_�̒���
        member = 3;  // �l��
        barCount = 1; // �_�̐�
        int answer = cutting.cutBar( number, member, barCount );
        System.out.println("mumber = " + number + ", member = " + member);
        System.out.println("Answer is " + answer + ".");

        number = 100; // �_�̒���
        member = 5;  // �l��
        barCount = 1; // �_�̐�
        answer = cutting.cutBar( number, member, barCount );
        System.out.println("mumber = " + number + ", member = " + member);
        System.out.println("Answer is " + answer + ".");
        
    }
}