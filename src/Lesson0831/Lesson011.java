package Lesson0831;

import java.util.Scanner;

public class Lesson011 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか:");
		int n=stdIn.nextInt();

		for(int i=0;i<n;i++){
			System.out.print('*');
		}
		System.out.println();
	}

}
