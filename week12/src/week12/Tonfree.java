package week12;

public class Tonfree implements EarPhone{

	public Tonfree() {
		System.out.println(" lg 블루투스 이어폰 톤프리 연결");
	}
	@Override
	public void play() {
		System.out.println(" lg 톤프리  음악 재생 중");
		
	}

	@Override
	public void stop() {
		System.out.println(" lg 톤프리  음악을 중지합니다");
		
	}
	

}
