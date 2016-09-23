package Lesson0831;

import java.util.Scanner;

public class Lesson008 {

	public static void main(String[] args) {

			Scanner stdIn = new Scanner(System.in);

			System.out.print("先頭の整数値:");
			int a =stdIn.nextInt();
			System.out.print("末尾の整数値:");
			int b =stdIn.nextInt();

				if(a<=b){
					for(;a<=b;a+=2){
						System.out.print(a+" ");
				}
				}else{
					for(;b<=a;b+=2){
						System.out.print(b+" ");
					}

				}

		}

	}

