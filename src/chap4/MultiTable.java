package chap4;
class MultiTable{
	public static void main(String[] args){
		int t=40;
		for(int i=1; i<=9;i++){
			for(int j=1; j<=9;j++){
				if(i*j==t){
					System.out.print("   ");
					continue;
				}
				System.out.print(" "+i*j);

			}
			System.out.println();
		}
	}
}