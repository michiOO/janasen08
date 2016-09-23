package home;

//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class home {

	public static void main(String[] args) {
		Random rand = new Random();

		//random
		int k=rand.nextInt(100);
		System.out.print(k);
	System.out.println();


		// Scanner stdIn = new Scanner(System.in);
		// int n = stdIn.nextInt();
		int[] a = new int[5];
		//final int n=3;
		int n = a.length;


		//配列
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
			System.out.print(a[i]+",");
		}

		System.out.println();

		//拡張for文
		int sum = 0;
		for (int i : a) {
			sum += 1;
			System.out.print(" " + sum);
		}

		System.out.println();


		//二値の交換
		int c=10;
		int d=5;

			int f =c;
			c=d;
			d=f;

		System.out.print("c="+c+"d="+d);
		System.out.println();

		//反転
		for (int i = 0; i < n / 2; i++) {
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
			for(; i < n; i++){
				System.out.print(a[i]+",");
			}
		}

		System.out.println();

		//コピー
		int[]b=new int[n];
		for(int i=0;i<n;i++){
			b[i] =a[i];
			System.out.print(b[i]+",");
		}

		System.out.println();

		//2次元配列
		int[][]x=new int[4][4];
		int y = x.length;
		for(int i=0;i<y;i++){
			for(int j=0;j<y;j++){
				x[i][j]=i+j;
			System.out.print(x[i][j]+",");
			}
		}

		System.out.println();

		//ArrayList
		ArrayList<Integer> g =new ArrayList<Integer>();
		g.add(10);
		g.add(20);
		g.add(30);
		g.add(40);
		g.add(50);

		System.out.println(g.get(2));
		System.out.println(g.get(4));
		System.out.println(g.get(3));
		System.out.println(g.size());

		System.out.println();




	}
}
