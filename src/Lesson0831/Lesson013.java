package Lesson0831;

import java.util.Scanner;

public class Lesson013 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力:");
		int n=stdIn.nextInt();

		if(n>0 && n<10){
			System.out.print(n+"は0以上10以下です。");
		}

	}

}
