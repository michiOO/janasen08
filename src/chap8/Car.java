package chap8;

public class Car {
	/** 名前 */
	private String name;
	/** 幅 */
	private int width;
	/** 高さ */
	private int height;
	/** 長さ */
	private int length;
	/** 現在位置X座標 */
	private double x;
	/** 現在位置Y座標 */
	private double y;
	/** 残り燃料 */
	private double fuel;
	/** 一度に飛べる距離 */
	private double flyLimit;
	/** 飛行時の燃料係数 */
	private double flyMul;

	public Car(String name, int width, int height, int length, double fuel, double flyLimit, double flyMul) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.flyLimit = flyLimit;
		this.flyMul = flyMul;
		x = y = 0.0;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return y;
	}

	public double getFuel() {
		return fuel;
	}

	/** スペック表示 */
	void putSpec() {
		System.out.println("名前:" + name);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
	}

	/**
	 * X方向にdx���Y方向にdy分移動する
	 * @param dx X方向
	 * @param dy Y方向
	 * @return 燃料が足りているので移動した=true/燃料不足=false
	 */
	boolean move(double dx, double dy) {
		boolean ret = true;

		double moveFuel = Math.sqrt(dx * dx+dy * dy);
		if (moveFuel > fuel) {
			ret = false;
		} else {
			fuel -= moveFuel;
			x += dx;
			y += dy;
		}
		return ret;
	}

	/**
	 * X方向にdx、Y方向にdy分飛ぶ
	 * @param dx X方向
	 * @param dy Y方向
	 * @return 燃料が足りているので移動した=true/燃料不足=false
	 */
	boolean fly(double dx, double dy) {
		boolean ret = true;

		double flyFuel = Math.sqrt(dx * dx+dy * dy) * flyMul;
		if (flyFuel > fuel) {
			ret = false;
		} else {
			fuel -= flyFuel;
			x += dx;
			y += dy;
		}
		return ret;
	}
}