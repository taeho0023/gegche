package week13;

public class BeepTask implements Runnable {

	//Runnable 인터페이스를 구현하는 클래스
	@Override
	public void run() {
		for (int i=0; i<5 ;i++) {
			System.out.println("삐~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
		
	}

}
