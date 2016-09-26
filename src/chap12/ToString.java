package chap12;

class Teacher {
	public String toString(){
		return "Class Teacher";
	}
	public void printX(){
		System.out.println("  --My name is Class "+this.getClass().getName());
	}
}

class GreatTeacher extends Teacher {
	public String toString(){
		return "Class GreatTeacher";
	}
}

public class ToString {
	static void print(Object obj) {
		System.out.println(obj);
		Teacher objX = (Teacher) obj;
		objX.printX();
	}
	public static void main(String[] args) {
		Teacher natsume = new Teacher();
		GreatTeacher chida = new GreatTeacher();
		int[] c = new int[5];

		print(natsume);
		print(chida);
		print(c);
	}
}