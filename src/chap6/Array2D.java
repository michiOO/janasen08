package chap6;

import java.util.Random;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("行数:");
		int line = stdIn.nextInt();

		System.out.print("列数:");
		int w = stdIn.nextInt();

		int[][] x = new int[line][w];

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < w; j++) {
				x[i][j] = rand.nextInt(100);
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
			}
		}
	}
}
