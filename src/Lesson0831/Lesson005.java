package Lesson0831;

import java.util.Scanner;

public class Lesson005 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値:");
		int n =stdIn.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
		}

	}

}
