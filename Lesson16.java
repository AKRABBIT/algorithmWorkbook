package algorithmWorkbook;
import java.util.Arrays;

import org.uncommons.maths.combinatorics.CombinationGenerator;
// ある階段を下からAさんが上がり、同時に上からBさんが下りてくる。
// 10段の階段で移動する場合、2人が同じ段に止まるのは何通りあるか求める。
// ただし階段は、最大で4段まで一気に進むことができるものとする。
public class Lesson16{

	static int answerCount = 0;

    public static void main(String[] args) {

    	int maxNumber = 500;

    	for(int square = 1; square <= maxNumber/4; square++){

    		if(square - 1 <= 0){
    			continue;
    		}
    		int arr_size = square;

    		// 組み合わせを求めたい数の範囲を配列に格納
    		Integer[] arr_Range = new Integer[arr_size];

    		for(Integer j = 1; j <= arr_Range.length; j++){
    			arr_Range[j-1] = j;
    		}

    		// 組み合わせを求める
    		CombinationGenerator<Integer> gen = new CombinationGenerator<>( Arrays.asList(arr_Range), 2 );

    		// 組み合わせの取り出し
    		while(gen.hasMore()){
    			Object[] arr_gen = gen.nextCombinationAsArray();

    			// ここでは2通りの数を取り出すため固定値でインデックス指定
    			int rectangle1 = (int) arr_gen[0];
    			int rectangle2 = (int) arr_gen[1];

    			// ピタゴラス数か判定
    			if((rectangle1 * rectangle1) + (rectangle2 * rectangle2) == square * square ){

    				// 長方形同士の最大公約数が1ならばカウント
    				int tmp;
    				while( (tmp = rectangle1 % rectangle2) != 0){
    					rectangle1 = rectangle2;
    					rectangle2 = tmp;
    				}
    				if(rectangle2 ==1){
    					answerCount++;
    				}
    			}
    		}
    		gen.reset();
    	}

    	// 解答を表示
    	System.out.println( "Answers: " + answerCount + " patterns." );

    }

}