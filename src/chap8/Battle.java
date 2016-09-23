package chap8;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	static Random rand = new Random();

	static final int AIKO = 0;
	static final int KACHI_1 = 1;
	static final int KACHI_2 = 2;

	static final double param = 0.6;

	// 勝負
	static boolean goBattle( int kyori, BattleShip japan, BattleShip usa) {
		boolean result = false;
		boolean isJapanOK = kyori <= japan.getDistance() ? true: false;
		boolean isUsaOK = kyori <= usa.getDistance() ? true: false;
		double HitJapan = 0;
		double HitUsa = 0;
		int luckJapan = rand.nextInt(japan.getLuckey())/5;
		int luckUsa  = rand.nextInt(usa.getLuckey())/5;
		String resultJapan = "miss";
		String resultUsa = "miss";

		if (isJapanOK) {
			HitJapan = japan.getCanonSize() * param;
		}
		if (isUsaOK) {
			HitUsa = usa.getCanonSize() * param;
		}
		System.out.printf("\n距離%dm 大和:%d アイオワ:%d\n", kyori, japan.getHp(), usa.getHp());
		System.out.printf(" *** 大和砲撃:%2.0f アイオワ砲撃:%2.0f\n", HitJapan, HitUsa);
		if (luckJapan > 1 ) {
			int hp = usa.getHp() - (int)HitJapan;
			usa.setHp(Math.max(hp, 0));
			resultJapan = "命中";
		}
		if (luckUsa > 1 ) {
			int hp = japan.getHp() - (int)HitUsa;
			japan.setHp(Math.max(hp, 0));
			resultUsa = "命中";
		}
		if ( japan.getHp() <= 0 || usa.getHp() <= 0 ) result = true;
		System.out.printf(" *** 大和砲撃:%2s アイオワ砲撃:%2s\n", resultJapan, resultUsa);
		return result;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		//日本艦隊
		BattleShip yamato = new BattleShip("大和", 65000, 46, 12, 42, 93);

		//米艦隊
		BattleShip iowa = new BattleShip("アイオワ", 55000, 40.6, 35, 38, 84);

		for (int kyori = 50; kyori>=1 ; kyori--){
			if (goBattle(kyori, yamato, iowa)) break;
			stdin.nextLine();
		}
		System.out.printf("\n *** 大和:%2d     アイオワ:%2d\n", yamato.getHp(), iowa.getHp());
	}
}