package home;

public class home2 {
	static void aryRmv(int[] a, int idx) {
		for (int i = idx+1; i < a.length; i++) {
			a[i-1] = a[i];
		}
	}

	static int max(int a ,int b){
		return a>b ? a :b;
	}


	static int max(int a,int b, int c){
		int max=a;
		if(b>max){max=b;}
		if(c>max){max =c;}
		return max;
	}


	public static void main(String[] args) {
		int x=1;
		int y=2;
		int z=3;
		System.out.println(max(x,y));
		System.out.println(max(x,y,z));


		int[] a = { 1, 3, 4, 7, 9, 11 };
		aryRmv(a, 2);

		System.out.print("{");
		for (int aa : a) {
			System.out.print(aa + ",");
		}
		System.out.println("}");
	}
}
