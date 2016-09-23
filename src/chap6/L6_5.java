package chap6;

import java.util.Scanner;

public class L6_5 {

	public static void main(String[] args) {

		System.out.print("要素数：");
		Scanner stdIn = new Scanner(System.in);
		int yousosu = stdIn.nextInt();
		int[] a = new int[yousosu];

		for (int i = 0; i < yousosu; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("a = {");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i == a.length - 1){
				break;
			}
			System.out.print(", ");
		}

		System.out.println("}");
	}

}