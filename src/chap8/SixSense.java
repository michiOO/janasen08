package chap8;

public class SixSense{

	public static void main(String[] args) {
		Sense gibo = new Sense("宜保愛子", "持って", "よろしくお願いします。");
		Sense ehara = new Sense("江原宏之", "持って", "オーラは薄い茶色ですね。");
		Sense hosoki = new Sense("細木数子", "持って", "Go to Hell.");
		Sense miwa = new Sense("美輪さん", "持って", "『黙れ小僧。』");
		Sense harry = new Sense("ハリー", "ウォルデモートではあり", "エクスペクト・パトローナム。");
		Sense joel = new Sense("ハーレイ・ジョエル・オスメントくん", "持って", "『自分が死んでることに気付いてないんだ。」");
		Sense bluce = new Sense("ブル－ス", "強靭な肉体を持って", "代表作：アルマゲドン 共演：ベン・アフレック");
		Sense stb = new Sense("スティーブン・タイラー", "リブ・タイラーの父で、エアロスミスのボーカルです。", "代表曲：I Don't Want to Miss a Thing");


		System.out.println(gibo.getName() + "です。私は" + gibo.getTruth() + "います。"
				+ gibo.getMsg());
		System.out.println(ehara.getName() + "です。私は" + ehara.getTruth() + "います。"
				+ ehara.getMsg());
		System.out.println(hosoki.getName() + "です。私は" + hosoki.getTruth() + "いません。"
				+ hosoki.getMsg());
		System.out.println(miwa.getName() + "です。美輪さんは" + miwa.getTruth() + "いません。"
				+ miwa.getMsg());
		System.out.println(harry.getName() + "です。私は" + harry.getTruth() + "ません。"
				+ harry.getMsg());
		System.out.println(joel.getName() + "です。" + joel.getTruth() + "います。"
				+ joel.getMsg());
		System.out.println(bluce.getName() + "です。私は" + bluce.getTruth() + "います。"
				+ bluce.getMsg());
		System.out.println(stb.getName() + "です。私は" + stb.getTruth()
				+ stb.getMsg());
	}
}