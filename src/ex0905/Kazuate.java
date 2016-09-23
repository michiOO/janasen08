package ex0905;

import java.util.Random;
import java.util.Scanner;

class Kazuate {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		final int MAXNO = 99;

		System.out.println("正解の数を設定してください。");
		int n = stdIn.nextInt();

		int prg1 = rand.nextInt(MAXNO + 1);
		System.out.println(prg1);

		int s= rand.nextInt();

		for(;s!=0;){
				System.out.println("当たりなら0、それより上なら1、それより下なら2");
				s = rand.nextInt();
				if ( s == 1) {//それより上
					int prg2 = rand.nextInt(prg1);
					System.out.println(prg2);
				}else if ( s == 2) {//それより下
					int prg2 = rand.nextInt(prg1);
					System.out.println(prg2);
				}
			else if(s==0){
				System.out.println("当たり！");
		}
		}


	}
}