package week12;

public class TV implements RemoteControl{
	//인터페이스기능을 (구현하는)사용허는 클래스 => 구현 클래스
    //구현 클래스에서 이넡페이스의 메소드를반드시 재정의
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV전원을 킵니다");
		
	}
	//인터페이스기능을 (구현하는)사용허는 클래스 => 구현 클래스
	//구현 클래스에서 이넡페이스의 메소드를반드시 재정의

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		//유효성 검사
		if (volume>MAX_VALUE)
			volume = MAX_VALUE;
		else if (volume>MIN_VALUE)
			volume = MAX_VALUE;
		
		
		this.volume = volume;
		System.out.println("현제 TV 볼륨 : " + volume);
		
	}
	
}
