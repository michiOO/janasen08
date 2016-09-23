package chap11.x;

class Sin {
	void func(Maruyama m){
		m.maru1();		//OK!
		m.maru2();		//OK!
		m.maru3();		//OK!
//		m.maru4();		//ERROR!(privateがついてるから)
	}
}
