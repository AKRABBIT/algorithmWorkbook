import java.util.HashSet;

// 平方根を小数で表したときに0～9までの数字が最も早く全て現れる最小の整数を求める
// 正の平方根のみを対象とし、整数部を含む場合と小数部のみの場合を求める
public class Lesson12{
    public static void main(String[] args) {

    	double squareRoot;
    	int squareRootIntegers;
    	double squareRootDecimals;
        HashSet hsSquareRoot = new HashSet();
        int answer1 = 0;
        int answer2 = 0;

        // 整数部を含む場合_Loop1
        for( double i=1; hsSquareRoot.size() < 10; i++ ){
        	// 初期化
        	hsSquareRoot.clear();

        	// 平方根を取得
        	squareRoot = Math.sqrt(i);

        	// 整数部と小数部を取得
        	squareRootIntegers = (int) (squareRoot / 1);
        	squareRootDecimals = squareRoot % 1;

        	String strSquareRootIntegers = String.valueOf(squareRootIntegers);
        	String strSquareRootDecimals = String.valueOf(squareRootDecimals);
        	// 小数点および小数点前のゼロを除去
        	String edit_strSquareRootDecimals = strSquareRootDecimals.substring( 2, strSquareRootDecimals.length() );

        	String[] arrSquareRootIntegers = strSquareRootIntegers.split("");
        	String[] arrstrSquareRootDecimals = edit_strSquareRootDecimals.split("");

        	// 配列を一つにまとめる
        	int length = arrSquareRootIntegers.length +arrstrSquareRootDecimals.length;
        	String[] arrSquareRoot = new String[length];
        	System.arraycopy(arrSquareRootIntegers, 0, arrSquareRoot, 0, arrSquareRootIntegers.length);
        	System.arraycopy(arrstrSquareRootDecimals, 0, arrSquareRoot, arrSquareRootIntegers.length, arrstrSquareRootDecimals.length);

        	// 左から10桁取得
        	int forLength1;
        	if(arrSquareRoot.length > 10){
        		forLength1 = 10;
        	} else {
        		forLength1 = arrSquareRoot.length;
        	}

        	for(int j=0; j < forLength1; j++){
        		String strJ = arrSquareRoot[j];
        		hsSquareRoot.add(strJ);
        	}

        	// 解答を保持
        	answer1 = (int)i;
        }
        // 初期化
    	hsSquareRoot.clear();

        // 小数部のみの場合_Loop2
        for( double k=1; hsSquareRoot.size() < 10; k++ ){

        	// 初期化
        	hsSquareRoot.clear();

        	// 平方根を取得
        	squareRoot = Math.sqrt(k);

        	// 小数部を取得
        	squareRootDecimals = squareRoot % 1;

        	String strSquareRootDecimals2 = String.valueOf(squareRootDecimals);
        	// 小数点および小数点前のゼロを除去
        	strSquareRootDecimals2 = strSquareRootDecimals2.substring( 2, strSquareRootDecimals2.length() );

        	String[] arrstrSquareRootDecimals2 = strSquareRootDecimals2.split("");

        	// 左から10桁取得
        	int forLength2;
        	if(arrstrSquareRootDecimals2.length > 10){
        		forLength2 = 10;
        	} else {
        		forLength2 = arrstrSquareRootDecimals2.length;
        	}
        	for(int l=0; l < forLength2 ; l++){
        		String strL = arrstrSquareRootDecimals2[l];
        		hsSquareRoot.add(strL);
        	}

        	// 解答を保持
        	answer2 = (int)k;
        }

        System.out.println( "Answer1:" + answer1);
        System.out.println( "Answer2:" + answer2);

    }

}