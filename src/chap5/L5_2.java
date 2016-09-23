package chap5;
import java.util.Scanner;
class L5_2 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);

		float x;
		double y;

		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		System.out.println("x:");
		x = stdIn.nextFloat();
		System.out.println("y:");
		y = stdIn.nextDouble();


		System.out.println("x="+x);
		System.out.println("y="+y);


		float f =0.1f;
		double d =1e-5;

		int ii=123_456;



		stdIn.close();
	}
}
