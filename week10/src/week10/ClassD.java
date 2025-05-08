package week10;

public class ClassD {
	//필드 접근제한자
	public int field1;
	int field2;
	private int field3;
	
	public ClassD() {
		field1 = 10;
		field2 = 10;
		field3 = 10;
		method1();

		method2();

		method3();

	}
	
	
	//매소드 접근 제한자
	public void method1() {}
	void method2() {}
	private void method3() {}

}
