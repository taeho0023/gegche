package week13;

public class BeepThreadEx {
	public static void main(String[] args) throws InterruptedException  {
		BeepThread thread = new BeepThread();
		thread.start();
		
		for (int i=0; i<5 ;i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}

}
