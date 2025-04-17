package week6;

public class Referencel {
	public static void main(String[] args) {
		//기본타입
		int iVal1= 100;
		int iVal2= 100;
		System.out.println("iVal1==iVal2 : "+(iVal1==iVal2? true:false));
		//참조타입 변수는 스택영역에 저장
		//해당 영역 값은 힙영역에 저장
		//객체 주소가 스택에 있는 변수에 저장
		//문자열 리트럴은 값이 동일하면 같은 주소를 공유
		//String은 가장 대표적인 클래스 타입
		String sVal1 = "java";
		String sVal2 = "java";
		System.out.println("sVal1==sVal2 : "+(sVal1==sVal2? "참조가 같다":"참조가 다르다"));
		
		String sVal3 = new String("java");
		String sVal4 = new String("java");
		
		System.out.println("sVal3==sVal4 : "+(sVal3==sVal4? "참조가 같다":"참조가 다르다"));
		//참조변수가 null 값을 가지면 해당 객체는 힙 영역에 생성 x
		//변수는 스택에 = 모든 변수는 스택에 참조든 기본이든★
		String sVal5 = null; //nullpointer Exception주의
		//System.out.println("sVal5.length =" + sVal5.length());
		sVal5 = "java";
		
		System.out.println("sVal1==sVal5 : "+(sVal1==sVal5? "참조가 같다":"참조가 다르다"));
		//값이 같은지 비교할경우 equals()매소드를 사용
		
		if(sVal3.equals(sVal4))
			System.out.println("sVal3과 sVal4의 문자열은 같다");
		else
				System.out.println("sVal3과 sVal4의 문자열은 다르다");
		
	}

}
