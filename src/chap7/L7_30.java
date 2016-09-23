package chap7;

import java.util.Arrays;
import java.util.List;

public class L7_30 {

	static int min(int a, int b){
		return a < b ? a : b;
	}

	static int min(int a, int b, int c){
		return min(a, min(b, c));
	}

	static int min(int[] b){
		int min = b[0];
		for (int i = 1; i < b.length; i++) {
			min = min(min, b[i]);
		}
		return min;
	}

	static int min(List<Integer> b){
		int min = b.get(0);
		for (int i = 1; i < b.size(); i++) {
			min = min(min, b.get(i));
		}
		return min;
	}

	public static void main(String[] args) {
		int param1 = 15;
		int param2 = 1;
		int param3 = 11;
		int[] a = { param1, param2, param3 };
		List<Integer> b = Arrays.asList(new Integer[] { param1, param2, param3 });

		System.out.println(param1 + "," + param2 + "の最小値は" + min(param1, param2) + "です。");
		System.out.println(param1 + "," + param2 + "," + param3 + "の最小値は" +
				min(param1, param2, param3) + "です。");
		System.out.println("配列 a[" + a[0] + "," + a[1] + "," + a[2] + "]の最小値は" +
				min(a) + "です。");
		System.out.println("List b[" + b.get(0) + "," + b.get(1) + "," + b.get(2) + "]の最小値は" +
				min(b) + "です。");
	}
}