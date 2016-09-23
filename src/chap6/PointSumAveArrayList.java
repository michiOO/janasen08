package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class PointSumAveArrayList {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		final int ninzu = 5;
		ArrayList<Integer> tensu = new ArrayList<Integer>();

		System.out.println(ninzu + "人の点数を入力せよ。");

		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "番の点数:");
			tensu.add(stdIn.nextInt());
			sum += tensu.get(i);
		}
		stdIn.close();

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double) sum / ninzu + "点です。");
	}
}