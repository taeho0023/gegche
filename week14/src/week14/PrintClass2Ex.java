package week14;

public class PrintClass2Ex {

	public static void main(String[] args) {
		//제네릭 타입 피라미터 => 구체적인클래스 타입으로 지정
		
		PrintClass2<Integer> pc2 = new PrintClass2<Integer>();
		pc2.printValue(100);
		//pc2.printValue("홍길동"); Integer값만 들어감
		
		
		PrintClass2<String> pc3 = new PrintClass2<String>();
		pc3.printValue("홍길동");
		
		PrintClass2<Boolean> pc4 = new PrintClass2<>();//<>안에 뒤에는 없어도 됨
		pc4.printValue(true);

	}

}
