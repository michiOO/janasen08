package Lesson0831;

import java.util.Scanner;

public class Lesson009 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("正の整数を入力してください。");
		int x = stdIn.nextInt();
		int sum=0;

		for(int i=1;i<=x;){
			sum +=i;
			i++;
		}

		System.out.println("1から" + x + "までの合計は" + sum + "です。");

	}

}
