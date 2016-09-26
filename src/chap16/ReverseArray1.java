package chap16;

public class ReverseArray1 {

	static void swap(int[] a, int idx1, int idx2) {
		try{
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("swap()内で不正な添え字を検出しました。");
				System.out.println("プログラムを終了します。");
				System.out.println(1);
			}
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i);
		}
	}

	public static void main(String[] args) {
		int[] x = { 10, 73, 2, -5, 42 };
		reverse(x);
	}
}
