package Lesson0831;

import java.util.Scanner;

class Lesson007 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値:");
		int n=stdIn.nextInt();

		for(int i=2;i<=n;i+=2)
			System.out.print(i+" ");

	}

}
