import java.util.ArrayList;
import java.util.Iterator;

// フィボナッチ数列のうち、各桁の数を足した数で割り切れる数を小さい順に11個求める。
public class Lesson11{
    public static void main(String[] args) {

        // 求めたい解答の個数を設定
    	int targetRange = 11;
        int count = 0;

        // フィボナッチ数列用の変数は桁数が多くなるためlong型を使用する
        long tmp1 = 1;
        long tmp2 = 1;
        long tmp3;
        long tmp3_edit;
        int sum;

        // 答えを保持するリスト
        ArrayList answerList = new ArrayList();

        while( count < targetRange ){
        	tmp3 = tmp1 + tmp2;
        	sum = 0; // 初期化
        	
        	// 1の位の数から順に加算
        	tmp3_edit = tmp3;
        	
        	do{
        		sum += tmp3_edit  % 10;
        		tmp3_edit = tmp3_edit / 10;
        	}
        	while( tmp3_edit != 0 );

        	// 割り切れる場合のみリストへ追加
        	if( tmp3 % sum == 0 ){
        		answerList.add(tmp3);
        		count += 1;
        	}
        	
        	tmp1 = tmp2;
        	tmp2 = tmp3;
        }

        System.out.println( "Answer:" );

        // リストを表示
        Iterator itr_answerList = answerList.iterator();
        while( itr_answerList.hasNext() ){
        	String str = itr_answerList.next().toString();
        	System.out.println( str );
        }
    }

}