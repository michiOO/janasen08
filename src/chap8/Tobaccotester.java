package chap8;

import java.util.Scanner;

public class Tobaccotester {

	public static void main(String[] args) {

		Tobacco mild = new Tobacco(440, 10, 0.8, 20, 1);
		Tobacco cool = new Tobacco(450, 8, 0.7, 20, 2);
		Tobacco seven = new Tobacco(480, 14, 1.2, 20, 3);
		Tobacco hope = new Tobacco(230, 14, 1.1, 10, 4);
		Tobacco wakaba = new Tobacco(480, 19, 1.4, 20, 5);

		Tobacco[] type = { mild, cool, seven, hope, wakaba };

		Scanner stdIn = new Scanner(System.in);

		System.out.println("普段吸うたばこの銘柄を教えてください。1.マイセン2.クール3．セッタ4．ホープ5．若葉");
		int x = stdIn.nextInt();
		System.out.println("喫煙歴を教えてください：1年であれば１と入力");
		int year = stdIn.nextInt();
		System.out.println("一日何本吸いますか？");
		int piece = stdIn.nextInt();
		int totaln = year * piece * 365;

		System.out.println("あなたが吸ってきた本数は" + totaln + "本です。");
		System.out.println("累計購入金額は" + (int) type[x].getPrice() / 20 * totaln + "円です。");
		System.out.println("タールの総摂取量は" + totaln * type[x].tar + "mgです。");
		System.out.println("ニコチンの総摂取量は" + totaln * type[x].nicotine + "mgです。ちなみに致死量は60mgです。");

		stdIn.close();

	}

}