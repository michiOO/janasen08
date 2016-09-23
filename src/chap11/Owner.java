package chap11;

public class Owner {

	public static void main(String[] args) {
		Dog pochi = new Dog();

		System.out.println("ペットの種類は"+Dog.name);
		System.out.println("与えたエサはまだ"+pochi.eatCount+"回です");
	}
}