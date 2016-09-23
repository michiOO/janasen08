package chap7;

public class L7_1_2 {

	static int signOf(int n) {
		int ret = 0;
		if (n < 0) {
			ret = -1;
		}
		else if (n > 0) {
			ret = 1;
		}
		return ret;
	}

	public static void main(String[] args) {
		int param = -10;
		System.out.println("引数=" + param + ",戻り値=" + signOf(param));
		param = 0;
		System.out.println("引数=" + param + ",戻り値=" + signOf(param));
		param = 10;
		System.out.println("引数=" + param + ",戻り値=" + signOf(param));

//		int param1 = 10, param2 = 2, param3 = 9;
//		System.out.println("\nmin()引数=" + param1 + "," + param2 + "," + param3 + ",戻り値=" + min(param1, param2, param3));
	}
}