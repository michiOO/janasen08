package chap6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class L6_7 {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n =12;
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int j=0;j<n;j++){
			a.add(rand.nextInt(10));
		}

		System.out.print("ArrayList aの全要素の値"+a+"\n");

		System.out.println("探す数値");
		int key =stdIn.nextInt();

		int i;
		for(i=n-1; i>=0; i--){
			if(a.get(i)==key) break;
		}
		if(i>=0){
			System.out.println("それはa.get("+i+")にあります。");
		}else{
			System.out.println("それはありません。");

		}

	}

}
