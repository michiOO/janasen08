package chap7;

import java.util.Scanner;

public class L7_4 {

	static int sumUp(int n){
		int sum=0;
		int i =1;

		while(i<=n){
			sum+=i;
			i++;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("nの値");
		int n=stdIn.nextInt();

		System.out.println("1から"+n+"の和は"+sumUp(n)+"です。");


	}

}
