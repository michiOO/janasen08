package chap6;

import java.util.Random;
import java.util.Scanner;
public class MonthCAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
				"January", "February" , "March" , "April" , "May" , "June" ,
				"July" , "August" , "September" , "October" , "Nobvember" , "December"
		};

		int month = rand.nextInt(12);
		System.out.println("問題は" + monthString[month]);

		while(true){
			System.out.print("何月かな：");
			int m = stdIn.nextInt();

			if( m == month + 1){
				break;
			}
			System.out.println("違います。");
		}

		System.out.println("正解です。");
		stdIn.close();
	}

}