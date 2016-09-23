package Lesson0831;

import java.util.Scanner;

public class Lesson010 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数１入力；");
		int one = stdIn.nextInt();

		System.out.println("整数２入力；");

		int two = stdIn.nextInt();

		System.out.println("偶数なら０、奇数なら１を入力せよ。");
		int EvenOdd = stdIn.nextInt();

		if (one > two) { // 整数1が必ず小さくなりように処理する。//
			int t = one;
			one = two;
			two = t;

		}

		int sum = 0;

		if ((one % 2 == 0 && EvenOdd == 0) && (one % 2 == 1 && EvenOdd == 1)) {//始まりの数と偶奇の選択が一致するとき

			for (int i = one; i <= two; i = i + 2) {
				sum += i;
			}
		} else {//始まりの数と偶奇が一致しないとき

			for (int i = one + 1; i <= two; i = i + 2) {
				sum += i;
			}
		}
		System.out.println("合計は" + sum);

	}

}