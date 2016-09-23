package chap10;

public class MinMax {
	// Privateなメソッド(Math.min、Math.maxでもいいけど)
    private static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
    private static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    // 以下が解答例
	public static int max(int a, int b, int c) {
		return max(a, max(b, c));
	}

	public static int min(int a, int b, int c) {
		return min(a, min(b, c));
	}

	public static int min(int[] a ){
		int min = Integer.MAX_VALUE;
		for (int aa : a){
			min = min(min, aa);
		}
		return min;
	}

	public static int max(int[] a ){
		int max = Integer.MIN_VALUE;
		for (int aa : a){
			max = max(max, aa);
		}
		return max;
	}
}