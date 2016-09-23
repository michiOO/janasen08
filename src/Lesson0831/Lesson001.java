package Lesson0831;

import java.util.Scanner;

public class Lesson001 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("2つの整数を入力してください。");

		System.out.print("整数1:");
		int x = stdIn.nextInt();
		System.out.print("整数2:");
		int y = stdIn.nextInt();

		System.out.println(x + "と" + y + "の合計値は" + (x + y) + "です。");

	}
}
