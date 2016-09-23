package chap6;

import java.util.Random;
import java.util.Scanner;

public class L6_14 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = { "January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December" };

		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");

		int month = rand.nextInt(12);
		String str = monthString[month];
		while (true) {
			if (monthString[month].equals(str)) {
				// 正解だったら次の問題を出す(初回はかならず実行される)
				int before = month;
				while (before == month) {
					month = rand.nextInt(12);
				}
			}
			System.out.print((month + 1) + "月:");
			str = stdIn.next();

			if (monthString[month].equals(str)) {
				System.out.print("正解です。もう一度? 1…Yes/0…No:");
				if (stdIn.nextInt() == 0) break;
			} else {
				System.out.println("違います。");
			}
		}
		stdIn.close();
	}
}