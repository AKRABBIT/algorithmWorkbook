package algorithmWorkbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import org.uncommons.maths.combinatorics.PermutationGenerator;

// READ + WRITE + TALK = SKILL の覆面算を満たす数字の組み合わせが何通りあるか求める
public class Lesson13{
    public static void main(String[] args) {

    	int count = 0;
    	ArrayList arr_Answer = new ArrayList();

    	int r = 0;
    	int e = 0;
    	int a = 0;
    	int d = 0;
    	int w = 0;
    	int i = 0;
    	int t = 0;
    	int l = 0;
    	int k = 0;
    	int s = 0;

    	int[] arr_pattern = { r, e, a, d, w, i, t, l, k, s };

    	// 組み合わせを求める
    	PermutationGenerator<Integer> gen = new PermutationGenerator<>( Arrays.asList(0,1,2,3,4,5,6,7,8,9) );

    	// それぞれの組み合わせが条件を満たすかチェック
    	while (gen.hasMore()){
    		Object[] arr_gen = gen.nextPermutationAsArray();

    		for( int arr_index = 0;  arr_index < arr_gen.length;  arr_index++ ){

    			arr_pattern[arr_index] = (int) arr_gen[arr_index];
    		}

    		for( int loop_index = 0; loop_index < arr_pattern.length; loop_index++ ){


    			switch (loop_index){

    				case 0:
    					r = arr_pattern[loop_index];
    				case 1:
    					e = arr_pattern[loop_index];
    				case 2:
    					a = arr_pattern[loop_index];
    				case 3:
    					d = arr_pattern[loop_index];
    				case 4:
    					w = arr_pattern[loop_index];
    				case 5:
    					i = arr_pattern[loop_index];
    				case 6:
    					t = arr_pattern[loop_index];
    				case 7:
    					l = arr_pattern[loop_index];
    				case 8:
    					k = arr_pattern[loop_index];
    				case 9:
    					s = arr_pattern[loop_index];
    			}
    		}

    		// 各単語の先頭が0の場合は計算処理をスキップ
    		if( r == 0 || w == 0 || t == 0 || s == 0 ){
    			continue;
    		}

    		int read = (r * 1000) + (e * 100) + (a * 10) + d;
    		int write =  (w * 10000) + (r * 1000) + (i * 100) + (t * 10) + e;
    		int talk = (t * 1000) + (a * 100) + (l * 10) + k;
    		int skill = (s * 10000) + (k * 1000) + (i * 100) + (l * 10) + l;
    		System.out.println( "read" + read );
    		System.out.println( "write" + write );

    		if( read + write + talk == skill ){
    			count++;

    			HashMap<String, Integer> hs_TmpAnswer = new HashMap<>();
    			hs_TmpAnswer.put("read", read);
    			hs_TmpAnswer.put("write", write);
    			hs_TmpAnswer.put("talk", talk);
    			hs_TmpAnswer.put("skill", skill);

    			arr_Answer.add(hs_TmpAnswer);
    		}

    	}


    	// 解答を表示
        System.out.println( "Answers: " + count );

        Iterator itr_arr_Answer = arr_Answer.iterator();
        while (itr_arr_Answer.hasNext()) {

        	HashMap hs_tmp = (HashMap) itr_arr_Answer.next();

        	System.out.print( hs_tmp.get("read") + " + "  );
        	System.out.print( hs_tmp.get("write") + " + " );
        	System.out.print( hs_tmp.get("talk") + " = " );
        	System.out.println( hs_tmp.get("skill") );

        }

    }

}