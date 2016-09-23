package chap10;

class Static {
	private static int count;
	private         int sum;

	public static void countUp() {
		count++;
	}

	public         void sumUp() {
		sum++;
	}

	public static void setCount(int x){
		count = x;
//		sum   = x;
		countUp();
//		sumUp();
	}

	public void setSum(int x){
		count = x;
		sum   = x;
		countUp();
		sumUp();
	}

	public static int getCount() {
		return count;
	}

	public int getSum() {
		return sum;
	}
}

public class StaticTester {

	public static void main(String[] args) {
		Static c1 = new Static();
		Static c2 = new Static();

		Static.setCount(5);
		c1.setSum(10);
		System.out.println("count = " + Static.getCount() + "  sum = " + c1.getSum());
		c2.setSum(20);
		System.out.println("count = " + Static.getCount() + "  sum = " + c2.getSum());
	}
}