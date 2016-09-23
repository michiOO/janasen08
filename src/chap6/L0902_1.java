package chap6;

import java.util.ArrayList;

public class L0902_1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();//ここで参照型を作り、リストを生成するイメージ。

			for (int i = 0; i < 3; i++) { // このfor文で代入の処理
				a.add(i + 1);// ここで値を代入している
			}
			for (int i = 0; i < a.size(); i++) {// このfor文で値を取得して、出力
				System.out.println("a.get(" + i + ")=" + a.get(i));
			}
			for (int i = 3; i < 5; i++) { // このfor文で4,5を代入の処理　
				a.add(i+1);// ここで値を代入している
			}
			for (int i = 0; i < a.size(); i++) {// このfor文ですべての値を取得して、出力
				System.out.println("a.get(" + i + ")=" + a.get(i));
			}

	}

}
