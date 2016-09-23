package chap7;

public class L7_26 {

	static int[] arrayInsOf(int[] a, int idx, int x) {
		int[] b = new int[a.length + 1];
		for (int src = 0, des = 0; src < a.length; src++) {
			if (src == idx) {
				b[des++] = x;
			}
			b[des++] = a[src];
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 7, 9, 11 };

		int[] b = arrayInsOf(a, 2, 99);
		System.out.print("b={");
		for (int bb : b) {
			System.out.print(bb + ",");
		}
		System.out.println("}");
//		System.out.println(a.hashCode()+" : "+b.hashCode());
	}
}