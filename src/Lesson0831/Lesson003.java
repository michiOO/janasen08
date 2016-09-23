package Lesson0831;

import java.util.Scanner;

public class Lesson003 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数1:");
		int a = stdIn.nextInt();
		System.out.print("整数2:");
		int b = stdIn.nextInt();
		System.out.print("整数3:");
		int c = stdIn.nextInt();


		int temp; //作業用変数を用意、出力しないので、初期値は不要
		//まず、aとbをASCで並べ替え-> a < b
		if(a>b){
			temp=a; //変数のスコープ 宣言した変数はそのブロック(ifとか)のなかでしか使えない
			a=b;
			b=temp;

		}
		//次にbとcをASCで並べ替え ->cのmaxが確定
		if(b>c){
			temp=b;
			b=c;
			c=temp;

		}
		//最後にaとbを再びASCで並べ替え
		if(a>b){
			temp=a;
			a=b;
			b=temp;

		}

		System.out.println("最も大きい整数" + c + "と最も小さい整数"+a+"の差は"+(c-a)+"です。");

	}
}
