package chap11.x;

public class Maruyama {
	public 		void maru1(){} //誰でもOK
	protected void maru2(){} //同一package内でのみOK(例外は次章で)
					void maru3(){} //同一package内でのみOK
	private 	void maru4(){} //誰もアクセスできない

	void func(Maruyama m){
		m.maru1();		//OK!
		m.maru2();		//OK!
		m.maru3();		//OK!
		m.maru4();		//OK!
	}
}
