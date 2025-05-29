package week13;

public class ProdConsEx {

	public static void main(String[] args) {
		// dataBox 객체 생성
		DataBox dataBox = new DataBox();
		
		ProducerThread prod = new ProducerThread(dataBox);
		ConsumerThread cons = new ConsumerThread(dataBox);
		
		prod.start();
		cons.start();

	}

}
