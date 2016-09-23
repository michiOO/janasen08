package chap7;

import java.util.Scanner;

public class L7_3 {

	static int center(int a, int b, int c) {
		int center = a;
		if ((a >= b && b >= c) || (c >= b && b >= a)) {
			center = b;
		} else if ((a <= b && a >= c) || (a >= b && a <= c)) {
			center = a;
		} else {
			center = c;
		}
		return center;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数a:");
		int a = stdIn.nextInt();
		System.out.print("整数b:");
		int b = stdIn.nextInt();
		System.out.print("整数c:");
		int c = stdIn.nextInt();

		System.out.print("中央値は" + center(a, b, c) + "です。");

	}
}