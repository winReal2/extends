package sec01.exam04;

public class SupersonicAirplaneExample {
	public SupersonicAirplaneExample() {
		SupersonicAirplane superSonic
				= new SupersonicAirplane(SupersonicAirplane.NORMAL);
//		(다른방법) SupersonicAirplane superSonic = new SupersonicAirplane(1);
		
		// 이륙합니다
		superSonic.takeOff();
		superSonic.fly();
		
		//(SUPERSONIC)는 상태를 의미 / 가독성을 높여주기 위해 상수 사용
		superSonic.flyMode = SupersonicAirplane.SUPERSONIC;
		superSonic.fly();
		
		superSonic.flyMode = SupersonicAirplane.NORMAL;
		superSonic.fly();
		
		// 착륙
		superSonic.land();
	}


}
