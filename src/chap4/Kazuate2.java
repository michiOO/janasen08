package chap4;

import java.util.Random;
import java.util.Scanner;

class Kazuate2 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int MAXNO = 99; // ここをいじるだけでプログラムが変えられる定数

		int no = rand.nextInt(MAXNO + 1);

		System.out.print("数当てゲーム開始!!");
		System.out.print("0～" + MAXNO + "の数字を当ててください。");

//		System.out.println(no); デバッグ用

		int x = 0;
		int count = 0;
		final int LIMIT = 3; // 制限回数を可変

	Outer:
		do {
			System.out.print("いくつかな：");
			x = stdIn.nextInt();

			if (x > no) {
				System.out.println("もっと小さな数だよ。");
			} else if (x < no) {
				System.out.println("もっと大きな数だよ。");
			} else {
				System.out.println("正解です。");
				break Outer;
			}

			count++;
			if (count == LIMIT) {
				System.out.println("制限回数内に答えられませんでした。");
				break Outer;
			}
		} while (x != no);

		System.out.println("正解は" + no + "です。");
	}

}