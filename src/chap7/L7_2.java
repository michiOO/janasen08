package chap7;

public class L7_2 {

//	static int signOf(int n) {
//		int ret = 0;
//		if (n < 0) {
//			ret = -1;
//		}
//		else if (n > 0) {
//			ret = 1;
//		}
//		return ret;
//	}

	static int min(int a,int b, int c){
		int min =a;
		if(b<min) min=b;
		if(c<min) min=c;
		return min;
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 1;

		System.out.print("最小値は"+min(a,b,c)+"です。");



//		int param1 = 10, param2 = 2, param3 = 9;
//		System.out.println("\nmin()引数=" + param1 + "," + param2 + "," + param3 + ",戻り値=" + min(param1, param2, param3));
	}
}