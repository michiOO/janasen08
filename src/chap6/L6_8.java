package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class L6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Double> a = new ArrayList<Double>();

		System.out.print("要素の個数を指定:");
		int n = stdIn.nextInt();

		for ( int i=0 ; i< n; i++ ) {
			System.out.print((i+1)+"個目の要素:" );
			a.add(stdIn.nextDouble());
		}

		double sum = 0;
		for (double d : a) {
			sum += d;
		}
		System.out.println("全要素の和は" + sum +"です。");
		System.out.println("全要素の平均は" + sum/n +"です。");

	}
}