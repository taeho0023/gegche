package week14;

public class PrintClass1 {
	//데이터를 입력받아 출력하는 메소드
	//데이터 타입이 다 다른경우  => 메소드 오버로딩
	public void printVslue(int value) {
		System.out.println("value = " + value);
	}
	public void printVslue(String value) {
		System.out.println("value = " + value);
	}
	public void printVslue(boolean value) {
		System.out.println("value = " + value);
	}

}
