package chap6;

import java.util.Scanner;

public class L6_6_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何人入力しますか:");
		int ninzu = stdIn.nextInt();
		int[] tensu = new int[ninzu];

		System.out.println(ninzu + "人の点数を入力せよ。");
		for ( int i=0 ; i< ninzu; i++ ) {
			System.out.print((i + 1) + "番の点数:");
			tensu[i] = stdIn.nextInt();
		}
		stdIn.close();

		int max = tensu[0];
		int min = tensu[0];
		int sum = tensu[0];
		for (int i=1; i<tensu.length; i++){
			sum += tensu[i];
			if (tensu[i] > max ) max = tensu[i];
			if (tensu[i] < min ) min = tensu[i];
		}
		System.out.println("合計点は" + sum + "点です。");
		System.out.println("平均点は" + sum/ninzu + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
	}
}