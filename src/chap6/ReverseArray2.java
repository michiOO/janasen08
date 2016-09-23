package chap6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray2 {

	public static void main(String[] args) {

		Random rand=new Random();
		Scanner stdIn=new Scanner(System.in);

		System.out.println("要素数:");
		int n = stdIn.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i=0;i<n;i++){
			a.add(i,10+rand.nextInt(90));
			System.out.println("a["+i+"]="+a.get(i));
		}

		for(int i=0;i<n/2;i++){
			int t=a.get(i);
			a.set(i,a.get(n-i-1));
			a.set(n-i-1,t);
		}

		System.out.println("要素の並びを字反転しました。");
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"]="+a.get(i));
		}


	}

}
