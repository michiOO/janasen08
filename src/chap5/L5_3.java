package chap5;

import java.util.Scanner;

public class L5_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean b;

		System.out.print("変数b:");
		b = stdIn.nextBoolean();

		System.out.println("変数b ="+b);

		stdIn.close();
	}

}