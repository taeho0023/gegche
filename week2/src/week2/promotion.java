package week2;

public class promotion {
	public static void main(String[] args) {
		//자동 타입 변환
		byte bValue = 25;
		int iValue = bValue;
		System.out.println(bValue);
		char cValue = '가';
		iValue = cValue;
		System.out.println(iValue);
		
		long lValue = iValue;
		System.out.println(lValue);
		
		double dValue = iValue;
		System.out.println(dValue);
		
		
	}
}
