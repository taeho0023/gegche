package week12;

public interface RemoteControl {
	//필드선언 => 상수필드 (public static final)
	//반드시 초기화가 필요
	
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	//모든 인터페이스 선언
	//모든 구현 객체에서 사용하는 기능을모아놓은것
	//인터페이스에서 선언된 메소드는 실행문이 업ㄱ는 추상 메소드
	//public abstract를 생량해도 콤파일 과정에서 장동으로 생성
	
	void turnOn();
	
	//기능추가 => 추상메소드 구현 클래승레서 반드시 재정의

	void turnOff();
	
	void setVolume(int volume);
	
	//새로운 가능 추가
	//default 메소드로 선언 => 기존 구현 클래스에는 영향을 주지 않는다
	//대산 반드시 싱행문을 포함해야함
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VALUE);
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적메소드 선언
	//구현 객체가 없어도 인터페이스 이름으로 호출이 가능
	static void changeBettery() {
		System.out.println("리모컨건전지를 교환하자.");
	}

}
