package chap4;

import java.util.Random;
import java.util.Scanner;

class LuckyNo2{
	public static void main(String[] args){
		Scanner ScannerKun = new Scanner(System.in);
		Random randomKun = new Random();

		System.out.println("入力した値:");
		int x = ScannerKun.nextInt();
		int offset=randomKun.nextInt(11)-5;

		System.out.println("その値の+-5の乱数を生成しました。それは"+x+"です。");
		System.out.println("その値の+-5の乱数を生成しました。それは"+(x + offset)+"です。");

	}
}