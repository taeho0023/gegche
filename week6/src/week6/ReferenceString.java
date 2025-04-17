package week6;

public class ReferenceString {

	public static void main(String[] args) {
		String ssn = "0203041234567";
		
		//ㅁ누자열은 0번부터 인덱스를 가짐
		//한 개  문자 추출
		char gender = ssn.charAt(6);
		switch(gender) {
		case'1','3' -> System.out.println("남자");
		case'2','4' -> System.out.println("여자");
		}
		
		//문자열으; 길이
		int length = ssn.length();
		if(length == 13)
			System.out.println("올바른 주민번호");
		else
			System.out.println("잘못된 주민번호");
		
		//answkduf eocp
		String oldStr="자바 프로그래밍";
		String newStr = oldStr.replace("자바", "java");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//문자열 잘라내기 혹은 추출하기 
		//0번부터5번까지 가져올려면 마지막 인덱스 +1 기술
		String fistNum = ssn.substring(0,6);
		System.out.println(fistNum);
		
		String secondNum =ssn.substring(6);
		System.out.println(secondNum);
		
		//문자열 찾기
		//String oldStr="자바 프로그래밍";
		//indexOf:특정 단어가 문자열에서 시작되는 인덱스 값을 반환
		int index = oldStr.indexOf("프로그래밍");
		
		//찾고자하느 단어가 문자열 안에 없는경우 : -1을 반환
		if(index == -1)
			System.out.println("프로그램 단어가 포함되어 있지 않음");
		else
			System.out.println(index+"번 인덱스에 프로그래밍 단어가 있음");
		
		//문자열 포함 여부 : contains() => true || false
		boolean result = oldStr.contains("자바");
		if(result)
			System.out.println("자바와 관련된 문자열");
		else
			System.out.println("자바와 관련없는 문자열");
		
		//문자열 분리 : split()
		String board = "1,자바학습,참조타입 Stricg 클래스,홍길동";
		String[] tokens = board.split(",");
		for(int i=0;i<tokens.length;i++)
			System.out.println(tokens[i]);
		
		//향상된 for문
		
		for(String Str:tokens)
			System.out.println(Str);
		
		}

}
