package chap11.y;

import chap11.x.Maruyama;

public class Ishizaki {
	void func(Maruyama m){
		m.maru1();		//OK!(publicしか呼べない)
//		m.maru2();		//ERROR!
//		m.maru3();		//ERROR!
//		m.maru4();		//ERROR!
	}
}
