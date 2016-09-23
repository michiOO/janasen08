package chap2;

import java.util.Random;
import java.util.Scanner;

class LuckyNo2{
	public static void main(String[] args){
		Scanner ScannerKun = new Scanner(System.in);
		Random randomKun = new Random();

		System.out.println(" ");
		int x = ScannerKun.nextInt();
		int y=randomKun.nextInt(11)-5;

		System.out.println((x + y));

	}
}