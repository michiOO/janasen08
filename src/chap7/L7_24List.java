package chap7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L7_24List {

	static List<Integer> arrayRmvOf(List<Integer> a, int idx) {
		List<Integer> b = new ArrayList<Integer>();
		for (int src = 0; src < a.size(); src++) {
			if (src != idx) {
				b.add(a.get(src));
			}
		}
		return b;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] { 1, 3, 4, 7, 9, 11 });

		List<Integer> b = arrayRmvOf(a, 2);
		System.out.print("b="+b);
//		System.out.println(a.hashCode()+" : "+b.hashCode());
	}
}