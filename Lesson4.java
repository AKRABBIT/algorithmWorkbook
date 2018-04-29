// 長さ[n]cmの1本の棒を[m]人で1[cm]に切り分ける
// ただし1本の棒を一度に切り分けることができるのは1人とする
public class Lesson4{
    public static void main(String[] args) {
        int number, member, barCount; // 棒の長さ、人数、棒の数
        
        // 再起処理をするためインナークラスを宣言
        // 棒を切り分けた回数を返す
        class Cut{
            int cutBar( int n, int m, int b ) {
            
            	// 棒の数が長さに達していないとき処理を行う
            	if ( b < n ) {
            	
            		// 棒の数が人数よりも少ないとき
            		if ( b < m ) {
                		return 1 + cutBar( n, m, b*2 );
                	
                	// 棒の数が人数と等しいまたは大きいとき
            		} else {
            			return 1 + cutBar( n, m, b+m );
            		}
            	}
            	return 0; // 切り分けた棒の数 >= 長さであれば、何もせず終了
            }
        }
        
        Cut cutting = new Cut();

        number = 20; // 棒の長さ
        member = 3;  // 人数
        barCount = 1; // 棒の数
        int answer = cutting.cutBar( number, member, barCount );
        System.out.println("mumber = " + number + ", member = " + member);
        System.out.println("Answer is " + answer + ".");

        number = 100; // 棒の長さ
        member = 5;  // 人数
        barCount = 1; // 棒の数
        answer = cutting.cutBar( number, member, barCount );
        System.out.println("mumber = " + number + ", member = " + member);
        System.out.println("Answer is " + answer + ".");
        
    }
}