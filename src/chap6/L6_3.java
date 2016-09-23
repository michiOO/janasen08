package chap6;

public class L6_3 {

	public static void main(String[] args) {
		double[] d = new double[5];

		for (int i = 0; i < d.length; i++) {
			d[i] = (i + 1) * 11 / 10d;
		}
		for (int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
	}

}