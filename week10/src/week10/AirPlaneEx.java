package week10;

public class AirPlaneEx {

	public static void main(String[] args) {
		SoniAirPlane sPlane = new SoniAirPlane();
		sPlane.takeoff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.flyMode = SoniAirPlane.supersonic;
		sPlane.fly();
	}
}
