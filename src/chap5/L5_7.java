package chap5;

public class L5_7 {

	public static void main(String[] args) {
		float sum = 0.0F;

		for (int i = 0; i <= 1000; i++) {
			double x = (double)i/1000;
			System.out.println("x=" + x+" xの2乗は=" + (x*x));
		}
	}

}
