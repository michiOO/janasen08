package Lesson0914;

public class SampleTester {

	public static void main(String[] args) {
		String[] names = { "たなか", "たかはし", "すずき", "さとう", "かとう", "いとう", "たなか", "たかはし", "かとう", "たなか", };

		// ノーマル版
		// countNames()を呼んで
		String[] countName = Sample.countNames(names);
		System.out.print("\nメインでの結果={");
		for (String str : countName) {
			System.out.print(str + ",");
		}
		System.out.println("}");

		// countNamesの戻り値を出力する

		// アドバンスド版
		// countNamesOpion()を呼んで

		// countNamesOpionの戻り値を出力する
	}
}