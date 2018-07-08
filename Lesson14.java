import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// W�t�o�ꍑ���ł���Ƃ���s��
// �ǂ̍�������x�����g���Ȃ��Ƃ��A�ł������������ԂƎg�p���������̐������߂�L
public class Lesson14{
    public static void main(String[] args) {

    	// �������X�g�̎擾
    	String[] countryName = { "Brazil", "Croatia", "Mexico", "Cameroon", "Spain", "Netherlands",
    							   "Chile", "Australia", "Colombia", "Greece", "Cote d'lvoire", "Japan",
    							   "Uruguay", "Costa Rica", "England", "Italy", "Switzerland", "Ecuador",
    							   "France", "Honduras", "Argentina", "Bosnia and Herzegovina", "Iran", "Nigeria",
    							   "Germany", "Portugal", "Ghana", "USA", "Belgium", "Algeria", "Russia", "Korea Republic"};

    	// ������S�đ啶���ɕϊ�
    	ArrayList<String> arrCountryName = new ArrayList<>();

    	for(int i=0; i < countryName.length; i++){
    		String tmp = countryName[i];
    		String tmpUpper = tmp.toUpperCase();

    		arrCountryName.add(tmpUpper);
    	}

        System.out.println( "�����v1: "+ countryName.length );
        System.out.println( "�����v2: "+ arrCountryName.size() );

        // �����֐�
        class SearchCountry{

            ArrayList search( String start, int count, HashSet hs_usedCountry, ArrayList arrUsedCountry, ArrayList arrCountryName ) {

            	// �O�̕��������擾
            	String beforeCountryName = start;
            	int endIndex = start.length() - 1;
            	char beforeChar = start.charAt(endIndex);
        		// debug
        		System.out.println( "�K�����f�o�b�O: "+ beforeChar );

            	Iterator itr_arrCountryName = arrCountryName.iterator();
            	while( itr_arrCountryName.hasNext() ){

            		// ���̕��������擾
                	String nextCountryName = itr_arrCountryName.next().toString();
                	if( hs_usedCountry.contains(nextCountryName) )continue; // �g�p�ς݂̏ꍇ�͂ʂ���
            		char nextChar = nextCountryName.charAt(0);
            		// debug
            		System.out.println( "�������f�o�b�O: "+ nextChar );

            		// �������r
            		if( beforeChar == nextChar ){
            			hs_usedCountry.add(nextCountryName);
            			arrUsedCountry.add(nextCountryName);
            			count++;
            			return search( nextCountryName, count, hs_usedCountry, arrUsedCountry, arrCountryName );
            		}
            		continue;
            	}

            	// �������I��������Ăяo�����ɖ߂�
            	return arrUsedCountry;
            }
        }

        // ���C������
        int resultMax = 1;
        Collection clct_Answer = new ArrayList();

        Iterator itr_arrCountryName1 = arrCountryName.iterator();
        while( itr_arrCountryName1.hasNext() ){

        	String startCountryName = itr_arrCountryName1.next().toString();

        	// �g�p�ς݂̍�����ێ�
        	 HashSet<String> hs_usedCountry = new HashSet<>();
        	 // �g�p�ς݂̍�������я�����ێ�
        	 ArrayList<String> arrUsedCountry = new ArrayList<>();

        	 hs_usedCountry.add(startCountryName);
        	 arrUsedCountry.add(startCountryName);

        	SearchCountry countrySearching = new SearchCountry();
        	ArrayList arrResult = countrySearching.search( startCountryName, 0, hs_usedCountry, arrUsedCountry, arrCountryName );

        	// �������ő�̉𓚂�ێ��A2���ȏオ�O��
        	if( resultMax < arrResult.size() ){
        		// �ێ����Ă����𓚂�S�č폜
        		clct_Answer.clear();
        		resultMax = arrResult.size();

        		// �V�����ǉ�������
        		clct_Answer.add( arrResult );

        	// �ő�l�Ɠ��������̉𓚂�ێ�
        	} else if( resultMax == arrResult.size() ){
        		clct_Answer.add( arrResult );
        	}

        }

    	// �𓚂�\��
        System.out.println( "Answers: " );

        int count = 1;
        Iterator itr_clct_Answer = clct_Answer.iterator();
        while( itr_clct_Answer.hasNext() ){

//        	ArrayList arrTmp = new ArrayList();
//        	arrTmp.add( itr_clct_Answer.next() );

        	ArrayList arrTmp = (ArrayList) itr_clct_Answer.next();


            System.out.println( "Answer" + count + ":" );

            int sumCount = 0;
            for(int q = 0;  q < arrTmp.size(); q++ ){
            	if( q == 0){

            		System.out.print( "Start: " + arrTmp.get(q) );
            		continue;
            	}
            	System.out.println( " �� "+ arrTmp.get(q) );
            	sumCount++;
            }
            System.out.println( "Sum: " + arrTmp.size() );
            count++;
        }

    }

}