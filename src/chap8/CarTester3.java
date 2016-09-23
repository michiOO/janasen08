package chap8;

import java.util.Scanner;
public class CarTester3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");

		System.out.print("名前は：");
		String name = stdIn.next();

		System.out.print("車幅は：");
		int width = stdIn.nextInt();

		System.out.print("高さは：");
		int height = stdIn.nextInt();

		System.out.print("長さは：");
		int length = stdIn.nextInt();

		System.out.print("ガソリン量は：");
		double fuel = stdIn.nextDouble();

		Car myCar = new Car(name , width , height , length , fuel, 20, 5);

		int input = -1;
		while(input != 0){
			System.out.println("\n現在地(" + myCar.getX() + "," + myCar.getY() + ")・残り燃料" + myCar.getFuel());
			System.out.print("移動しますか[0…No/1…走る/2…飛ぶ]:");
			input = stdIn.nextInt();
			switch (input) {
				case 0:
					break;
				case 2: // 飛ぶ
					System.out.println("飛びます!飛びます!");
				case 1: // 走る
					System.out.print("X方向の移動距離：");
					double dx = stdIn.nextDouble();
					System.out.print("Y方向の移動距離：");
					double dy = stdIn.nextDouble();
					boolean isFuelOK;
					if (input == 1) {
						isFuelOK = myCar.move(dx, dy);
					} else {
						isFuelOK = myCar.fly(dx, dy);
					}
					if (!isFuelOK) {
						System.out.println("燃料が足りません。");
					}
					break;
			}
		}
	}
}