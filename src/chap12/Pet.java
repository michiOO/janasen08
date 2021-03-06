package chap12;

import lesson0926.Pet;

class Pet {
	private String name;
	private String masterName;

	public Pet(String name, String masterName){
		this.name = name;
		this.masterName = masterName;
	}

	public String getName() {
		return name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void introduce() {
		System.out.println("■僕の名前は" + name + "です!");
		System.out.println("■ご主人様は" + masterName + "です");
	}
}
class RobotPet extends Pet {
	public RobotPet(String name, String masterName){
		super(name,masterName);
	}

	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	public void work(int sw){
		switch (sw){
			case 1:
				System.out.println("ルンバします。");
				break;
			case 2:
				System.out.println("選択します。");
				break;
			case 3:
				System.out.println("炊事します。");
				break;
		}
	}
}