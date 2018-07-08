import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// W杯出場国名でしりとりを行う
// どの国名も一度しか使えないとき、最も長く続く順番と使用した国名の数を求めるL
public class Lesson14{
    public static void main(String[] args) {

    	// 国名リストの取得
    	String[] countryName = { "Brazil", "Croatia", "Mexico", "Cameroon", "Spain", "Netherlands",
    							   "Chile", "Australia", "Colombia", "Greece", "Cote d'lvoire", "Japan",
    							   "Uruguay", "Costa Rica", "England", "Italy", "Switzerland", "Ecuador",
    							   "France", "Honduras", "Argentina", "Bosnia and Herzegovina", "Iran", "Nigeria",
    							   "Germany", "Portugal", "Ghana", "USA", "Belgium", "Algeria", "Russia", "Korea Republic"};

    	// 国名を全て大文字に変換
    	ArrayList<String> arrCountryName = new ArrayList<>();

    	for(int i=0; i < countryName.length; i++){
    		String tmp = countryName[i];
    		String tmpUpper = tmp.toUpperCase();

    		arrCountryName.add(tmpUpper);
    	}

        System.out.println( "国合計1: "+ countryName.length );
        System.out.println( "国合計2: "+ arrCountryName.size() );

        // 検索関数
        class SearchCountry{

            ArrayList search( String start, int count, HashSet hs_usedCountry, ArrayList arrUsedCountry, ArrayList arrCountryName ) {

            	// 前の文字情報を取得
            	String beforeCountryName = start;
            	int endIndex = start.length() - 1;
            	char beforeChar = start.charAt(endIndex);
        		// debug
        		System.out.println( "尻文字デバッグ: "+ beforeChar );

            	Iterator itr_arrCountryName = arrCountryName.iterator();
            	while( itr_arrCountryName.hasNext() ){

            		// 次の文字情報を取得
                	String nextCountryName = itr_arrCountryName.next().toString();
                	if( hs_usedCountry.contains(nextCountryName) )continue; // 使用済みの場合はぬかす
            		char nextChar = nextCountryName.charAt(0);
            		// debug
            		System.out.println( "頭文字デバッグ: "+ nextChar );

            		// 文字を比較
            		if( beforeChar == nextChar ){
            			hs_usedCountry.add(nextCountryName);
            			arrUsedCountry.add(nextCountryName);
            			count++;
            			return search( nextCountryName, count, hs_usedCountry, arrUsedCountry, arrCountryName );
            		}
            		continue;
            	}

            	// 検索が終了したら呼び出し元に戻る
            	return arrUsedCountry;
            }
        }

        // メイン処理
        int resultMax = 1;
        Collection clct_Answer = new ArrayList();

        Iterator itr_arrCountryName1 = arrCountryName.iterator();
        while( itr_arrCountryName1.hasNext() ){

        	String startCountryName = itr_arrCountryName1.next().toString();

        	// 使用済みの国名を保持
        	 HashSet<String> hs_usedCountry = new HashSet<>();
        	 // 使用済みの国名および順序を保持
        	 ArrayList<String> arrUsedCountry = new ArrayList<>();

        	 hs_usedCountry.add(startCountryName);
        	 arrUsedCountry.add(startCountryName);

        	SearchCountry countrySearching = new SearchCountry();
        	ArrayList arrResult = countrySearching.search( startCountryName, 0, hs_usedCountry, arrUsedCountry, arrCountryName );

        	// 長さが最大の解答を保持、2国以上が前提
        	if( resultMax < arrResult.size() ){
        		// 保持していた解答を全て削除
        		clct_Answer.clear();
        		resultMax = arrResult.size();

        		// 新しく追加し直す
        		clct_Answer.add( arrResult );

        	// 最大値と同じ長さの解答を保持
        	} else if( resultMax == arrResult.size() ){
        		clct_Answer.add( arrResult );
        	}

        }

    	// 解答を表示
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
            	System.out.println( " → "+ arrTmp.get(q) );
            	sumCount++;
            }
            System.out.println( "Sum: " + arrTmp.size() );
            count++;
        }

    }

}