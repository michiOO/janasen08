package chap5;

import java.util.Scanner;

public class BooleanTesster {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);

		System.out.print("整数a:");int a=stdIn.nextInt();
		System.out.print("整数b:");int b=stdIn.nextInt();


		System.out.println("a<b="+(a<b));
		System.out.println("a<b="+(a<=b));
		System.out.println("a<b="+(a>b));
		System.out.println("a<b="+(a>=b));
		System.out.println("a<b="+(a==b));
		System.out.println("a<b="+(a!=b));
		System.out.println("a<b="+!(a==0));
		System.out.println("a<b="+!(b==0));
	}

}
