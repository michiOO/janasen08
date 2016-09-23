package chap4;

import java.util.Scanner;

public class swicth {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("手を選べ（0...グー／1...チョキ／2...パー）:");
		int hand = stdIn.nextInt();

		switch(hand){
			case 0: System.out.println("グー");
						System.out.println("グンカン");
			break;
			case 1: System.out.println("チョキ");
			System.out.println("チョビス");
			break;
			case 2: System.out.println("パー");
			System.out.println("パレス");
			break;
		}
	}
}