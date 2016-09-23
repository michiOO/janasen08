package chap6;

import java.util.Random;
import java.util.Scanner;

public class L6_10 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数は:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		stdIn.close();

		int before = -1;
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(9) + 1;
			while( before == a[i]) {
				a[i] = rand.nextInt(9) + 1;
			}
			before = a[i];
		}
		System.out.print("{");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[n - 1] + "}");
	}
}