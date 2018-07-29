package algorithmWorkbook;

// 30人を1列に並べるときの男女の並べ方が何通りあるか考える。
// ただし女性が隣り合うことはなく、男性は何人並んでもよいものとする。

public class Lesson17{

    public static void main(String[] args) {

    	int maxCount = 30; // 人数を変えるときはこの数を変更
    	int lngMan = 1;
    	int lngWoman = 0;
    	int lngPreMan = lngMan;
    	int lngPreWoman = lngWoman;
	int loopCount = 0;

	// 人数分ループ
    	while( loopCount < maxCount ){

		lngPreMan = lngMan;
    		lngPreWoman = lngWoman;
		
		// n-1人まで並んでいる状態からスタート
		// 次に男性が並ぶのは、前が男性の場合+前が女性の場合
    		lngMan = lngPreMan + lngPreWoman;
		// 次に女性が並ぶのは、前が男性の場合のみ
    		lngWoman = lngPreMan;

    		loopCount++;
    	}

    	// 解答を表示
	int answer = lngMan + lngWoman;
    	System.out.println( "Answers: " + answer );

    }

}