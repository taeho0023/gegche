package week10;

public class SoniAirPlane extends Airplane {
	//비행모드에 따라 비행방법이 달라진다
	//비행모드 설정
	public static final int normal = 1;
	public static final int supersonic = 2;
	
	int flyMode = normal;
	
	private int soundSpeed;
	private int maxSpeed;
	
	@Override
	public void fly() {
		if (flyMode == supersonic)
		
		System.out.println("음속비행합니다.");

		else
			super.fly();
	}
	
	public int getSoundSpeed() {
		return soundSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	

}
