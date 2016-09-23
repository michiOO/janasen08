package chap8;

class Sense {
	private String name;
	private String truth;
	private String msg;

	public Sense(String name, String truth, String msg) {
		super();
		this.name = name;
		this.truth = truth;
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public String getTruth() {
		return truth;
	}

	public String getMsg() {
		return msg;
	}
}
