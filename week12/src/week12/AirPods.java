package week12;

public class AirPods implements EarPhone{

	public AirPods() {
		System.out.println("새로 구입한 apple Airpods 연결");
	}
	@Override
	public void play() {
		System.out.println("apple Airpods로 음악을 재생 중");
		
	}

	@Override
	public void stop() {
		System.out.println("apple Airpods로 음악을 중지 합니다");
		
	}

}
