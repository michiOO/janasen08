package chap7;

public class L7_22 {

	static int[] arrayClone(int[] a) {
		int[] b = new int[a.length];
		int i = 0;
		for (int aa : a) {
			b[i++] = aa;
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		int[] b = arrayClone(a);
		System.out.print("b={");
		for (int bb : b) {
			System.out.print(bb + ",");
		}
		System.out.println("}");
		System.out.println(a.hashCode()+" : "+b.hashCode());
	}
}