package chap4;

import java.util.Scanner;

public class SumB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何個加算:");
		int n =stdIn.nextInt();

		int sum=0;
		for(int i=0;i<n;i++){
			System.out.println("整数:");
			int t=stdIn.nextInt();
			if(t==0){
				break;
				}
			sum +=t;
		}
		System.out.println(sum);
	}

}
