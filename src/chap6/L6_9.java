package chap6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class L6_9 {

	public static void main(String[] args) {

		Random rand=new Random();
		Scanner stdIn=new Scanner(System.in);

		System.out.println("要素数:");
		int n = stdIn.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i=0;i<n;i++){
			a.add(i,1+rand.nextInt(10));
			System.out.println("a["+i+"]="+a.get(i));
		}
	}
}

