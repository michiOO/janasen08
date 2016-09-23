package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class L6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> tensu = new ArrayList<Integer>();

		System.out.print("何人入力しますか:");
		int ninzu = stdIn.nextInt();

		System.out.println(ninzu + "人の点数を入力せよ。");
		for ( int i=0 ; i< ninzu; i++ ) {
			System.out.print((i + 1) + "番の点数:");
			tensu.add(stdIn.nextInt());
		}
		stdIn.close();

		int max = tensu.get(0);
		int min = tensu.get(0);
		int sum = tensu.get(0);
		for (int i=1; i<tensu.size(); i++){
			sum += tensu.get(i);
			if (tensu.get(i) > max ) max = tensu.get(i);
			if (tensu.get(i) < min ) min = tensu.get(i);
		}
		System.out.println("合計点は" + sum + "点です。");
		System.out.println("平均点は" + sum/ninzu + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
	}
}