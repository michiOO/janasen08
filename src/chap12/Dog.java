package chap12;

class Dog extends Animal {
	private String name;

	public Dog(int age, String name) {
		super(age);
		this.name = name;
	}

	public void say(){
		System.out.println(age+"才の"+name+"が鳴きました。");
	}
}