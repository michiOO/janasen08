package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class exp02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> tensu = new ArrayList<Integer>();

		System.out.print("3人入力しろ:");
		final int ninzu = 3;

		System.out.println(ninzu + "人の点数を入力せよ。");
		for ( int i=0 ; i< ninzu; i++ ) {
			System.out.print((i + 1) + "番の点数:");
			tensu.add(stdIn.nextInt());
		}
		stdIn.close();

		int max = tensu.get(0);
		int min = tensu.get(0);
		for (int i=1; i<tensu.size(); i++){
			if (tensu.get(i) > max ) max = tensu.get(i);
			if (tensu.get(i) < min ) min = tensu.get(i);
		}
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
	}
}


