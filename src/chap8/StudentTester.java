package chap8;

public class StudentTester {

	public static void main(String[] args) {
		Student yasuda = new Student("安田", 30, "よろしく");
		Student mimaki = new Student("三巻", 27, "お休みです");

		System.out.println(yasuda.getName() + "です。" + yasuda.getAge() + "才です。"
				+ yasuda.getMsg());
		System.out.println(mimaki.getName() + "です。" + mimaki.getAge() + "才です。"
				+ mimaki.getMsg());
	}
}