package week12;

public class RemoteControlEx {

	public static void main(String[] args) {
		Audio audio = new Audio();
		TV tv = new TV();
		
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();

		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);
		tv.setMute(false);
		tv.turnOff();
		System.out.println("---");	
		
		
		SmartTV smart = new SmartTV();
		smart.turnOn();
		smart.setVolume(5);
		smart.search("네이버");
		smart.setMute(true);
		smart.setMute(false);
		smart.turnOff();
		
		
		System.out.println("---");	
		System.out.println("리모컨의 최대볼륨 : "+RemoteControl.MAX_VALUE);	
		System.out.println("리모컨의 최소볼륨 : "+RemoteControl.MIN_VALUE);	
		System.out.println("---");	
		System.out.println("--인터페이스 다형성-");	
		RemoteControl.changeBettery();
		
		RemoteControl[] rc = new RemoteControl[3];
		rc[0] = audio;
		rc[1] = tv;
		rc[2] = smart;
		
		for(RemoteControl r : rc) {
			r.turnOn();
			r.setVolume(3);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
			System.out.println("---");	
			
		}
	}
}
