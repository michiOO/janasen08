package chap6;

public class Ex04 {

	public static void main(String[] args) {
		String[] monthString = { "January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December" };

		for (String m : monthString) {
			System.out.println(m);
		}
		for (int i=0; i<monthString.length; i++ ) {
			System.out.println(i + ":" + monthString[i]);
		}
		System.out.println(monthString[0]);
		System.out.println(monthString[1]);
		System.out.println(monthString[2]);
	}
}