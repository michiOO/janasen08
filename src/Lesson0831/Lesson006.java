package Lesson0831;

import java.util.Scanner;

public class Lesson006 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("先頭の整数値:");
		int a =stdIn.nextInt();
		System.out.print("末尾の整数値:");
		int b =stdIn.nextInt();

			if(a<=b){
				for(int j=b;a<=b;a++,j--){
					System.out.print(j+" ");
			}
			}else{
				for(int j=a;b<=a;b++,j--){
					System.out.print(j+" ");
				}

			}

	}

}
