package chap6;

import java.util.ArrayList;

public class IntArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {//上のfor文で代入の処理
			a.add(i + 1);//ここで値を代入
		}

		for (int i = 0; i < a.size(); i++) {//下のfor文で値を取得して、出力
			System.out.println("a.get(" + i + ")=" + a.get(i));
		}

	}

}
