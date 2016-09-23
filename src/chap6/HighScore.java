package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) {
			Scanner stdIn =new Scanner(System.in);
			final int ninzu=5;
			ArrayList<Integer> tensu =new ArrayList<Integer>();

			System. out.println(ninzu+"人の点数を入力せよ：");
			for(int i=0;i<ninzu;i++){
				System.out.print((i+1)+"番の点数");
				tensu.add(stdIn.nextInt());
			}
			stdIn.close();

			int max=tensu.get(0);
			for(int i=0;i<tensu.size();i++){
				if(tensu.get(i)>max)max=tensu.get(i);
			}
			System.out.println("最高点は"+max+"点です。");
		}
}
