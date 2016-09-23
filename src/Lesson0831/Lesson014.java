package Lesson0831;

import java.util.Scanner;

public class Lesson014 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("正の整数を入力:");
		int n=stdIn.nextInt();

		for(int i=2;i<=n;i+=2){
			System.out.print(i);
		}

	}
}

