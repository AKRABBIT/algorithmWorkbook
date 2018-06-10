public class Lesson9
{
    public static void main(String[] args) {

        // �v�Z���������邽�߃C���i�[�N���X��錾
        class CalcuForLesson9{
            int calcu( int intMale, int intFemale ) {
                
                // 0�l�̏ꍇ���J�E���g���邽��+1
                intMale   += 1;
                intFemale += 1;
                
                // �������z����쐬��0�ŏ�����
            	  int[][] peopleAry = new int[intFemale][intMale];
            	  for( int i=0; i < intFemale; i++ ){
            		    for( int j=0; j < intMale; j++ ){
            		        peopleAry[i][j] = 0;
            		    }
            	  }
            	
            	  // �J�n���͒j���Ƃ���0�l�ƂȂ�1�ʂ�
            	  peopleAry[0][0] = 1;
            	
            	  for( int k=0; k < intFemale; k++ ){
            	      for( int l=0; l < intMale; l++ ){
            	        
            	          // �����łȂ��Ƃ�
            	          if( k != l && intMale-l != intFemale-k ){
            	              if( l>0 ){
            	                  // �ړ����̐����ړ���։��Z_��ړ�
            	                  peopleAry[k][l] += peopleAry[k][l-1];
            	              }
            	              if( k>0 ){
            	                  // �ړ����̐����ړ���։��Z_�E�ړ�
            	                  peopleAry[k][l] += peopleAry[k-1][l];
            	              }
            	          }
            	      }
            	  }
            	
            int count = 0;
            count += peopleAry[intFemale-2][intMale-1] + peopleAry[intFemale-1][intMale-2];
            
            return count;
            }
        }

        // �j���̐���ݒ�
    	  int male   = 20;
    	  int female = 10;
    	
    	  // �֐��Ăяo��
    	  CalcuForLesson9 calculation = new CalcuForLesson9();
    	  int answer = calculation.calcu( male,female );
        System.out.println( String.format("Total: %d", answer) );
    }
}
