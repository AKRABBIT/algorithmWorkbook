import java.util.ArrayList;
import java.util.Iterator;

// �t�B�{�i�b�`����̂����A�e���̐��𑫂������Ŋ���؂�鐔������������11���߂�B
public class Lesson11{
    public static void main(String[] args) {

        // ���߂����𓚂̌���ݒ�
    	int targetRange = 11;
        int count = 0;

        // �t�B�{�i�b�`����p�̕ϐ��͌����������Ȃ邽��long�^���g�p����
        long tmp1 = 1;
        long tmp2 = 1;
        long tmp3;
        long tmp3_edit;
        int sum;

        // ������ێ����郊�X�g
        ArrayList answerList = new ArrayList();

        while( count < targetRange ){
        	tmp3 = tmp1 + tmp2;
        	sum = 0; // ������
        	
        	// 1�̈ʂ̐����珇�ɉ��Z
        	tmp3_edit = tmp3;
        	
        	do{
        		sum += tmp3_edit  % 10;
        		tmp3_edit = tmp3_edit / 10;
        	}
        	while( tmp3_edit != 0 );

        	// ����؂��ꍇ�̂݃��X�g�֒ǉ�
        	if( tmp3 % sum == 0 ){
        		answerList.add(tmp3);
        		count += 1;
        	}
        	
        	tmp1 = tmp2;
        	tmp2 = tmp3;
        }

        System.out.println( "Answer:" );

        // ���X�g��\��
        Iterator itr_answerList = answerList.iterator();
        while( itr_answerList.hasNext() ){
        	String str = itr_answerList.next().toString();
        	System.out.println( str );
        }
    }

}