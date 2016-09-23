package chap7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L7_22List {

	static ArrayList<Integer> arrayClone(List<Integer> a ){
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int aa: a ){
			b.add(aa);
		}
//		b.addAll(a);
		return b;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });

		ArrayList<Integer> b = arrayClone(a);
		System.out.println("b=" + b);
		System.out.println(a.hashCode()+" : "+b.hashCode());
	}
}