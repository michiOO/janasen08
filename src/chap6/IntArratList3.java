package chap6;

import java.util.ArrayList;

public class IntArratList3 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) { //このfor文で代入の処理
			a.add(10);//ここで値を代入している
		}

		for (int i = 0; i < a.size(); i++) {//下のfor文で値を取得して、出力
			System.out.println("a.get(" + i + ")=" + a.get(i));
		}

	}

}
