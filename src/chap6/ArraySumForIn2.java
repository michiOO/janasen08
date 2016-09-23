package chap6;

import java.util.ArrayList;

public class ArraySumForIn2 {

	public static void main(String[] args) {
		//double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(1.0);a.add(2.0);a.add(3.0);a.add(4.0);a.add(5.0);
		int i=0;
		for (double d : a ) {
			System.out.println("a[" + (i++) + "] = " + d);
		}
		double sum = 0;
		for (double d : a) {
			sum += d;
		}
		System.out.println("全要素の和は" + sum +"です。");
	}
}