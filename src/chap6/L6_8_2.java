package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class L6_8_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.print("要素の個数を指定:");
		int n = stdIn.nextInt();

		int sum = 0;
		for ( int i=0 ; i< n; i++ ) {
			System.out.print((i+1)+"個目の要素:" );
			a.add(stdIn.nextInt());
			sum +=a.get(i);
		}


		System.out.println("全要素の和は" + sum +"です。");
		System.out.println("全要素の平均は" + sum/n +"です。");

	}
}
