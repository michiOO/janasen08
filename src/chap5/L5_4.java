package chap5;

import java.util.Scanner;

class L5_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値xとyの平均値を求めます。");
		System.out.print("xの値:");	int x=stdIn.nextInt();
		System.out.print("yの値:");	int y=stdIn.nextInt();
		System.out.print("zの値:");	int z=stdIn.nextInt();


		double ave =(x+y+z)/3d;
		System.out.println("xとyとzの合計は"+(x+y+z)+"です。");
		System.out.println("xとyとzの平均値は"+ave+"です。");

	}

}
