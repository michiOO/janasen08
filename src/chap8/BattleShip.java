package chap8;

/** 戦艦クラス */
public class BattleShip {
	/** 名前 */
	private String name;
	/** 排水量(単位:トン) */
	private int water;
	/** 主砲サイズ(単位:cm) */
	private double canonSize;
	/** 運 */
	private int luckey;
	/** 射程距離(単位:km)  */
	private int distance;
	/** HP(単位:ちだ) */
	private int hp;

	public BattleShip(String name, int water, double canonSize, int luckey, int distance, int hp) {
		this.name = name;
		this.water = water;
		this.canonSize = canonSize;
		this.luckey = luckey;
		this.distance = distance;
		this.hp = hp;
	}
	/** 名前を返す */
	public String getName() {
		return name;
	}
	/** 排水量を返す(単位:トン)  */
	public int getWater() {
		return water;
	}
	/** 主砲サイズを返す(単位:cm)  */
	public double getCanonSize() {
		return canonSize;
	}
	/** 運を返す */
	public int getLuckey() {
		return luckey;
	}
	/** 射程距離を返す(単位:km)  */
	public int getDistance() {
		return distance;
	}
	/** HPを返す(単位:ちだ)  */
	public int getHp() {
		return hp;
	}
	/** HPをセットする(単位:ちだ)  */
	public void setHp(int hp) {
		this.hp = hp;
	}
}