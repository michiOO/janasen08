package Lesson0831;

import java.util.Scanner;
class Lesson012{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("数値の1を入力");
		int n=stdIn.nextInt();

		int sum=0;
		int i=1;
		for(;;i++){
			System.out.print("数値の"+(i+1)+"を入力");
			int t=stdIn.nextInt();
			if(t==0) break;
			sum +=t;
		}
		System.out.println("合計は"+(sum+n)+"です。平均は"+((sum+n)/i)+"です。");
	}
}