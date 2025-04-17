package week7;

public class Koreanex {

	public static void main(String[] args) {
		Korean i = new Korean("박태호","020304-1234123","010-1234-1234");
		System.out.println("-- i --");
		System.out.println("국적:"+i.nation);
		System.out.println("이름:"+i.name);
		System.out.println("주민번호:"+i.ssn);
		System.out.println("전화번호:"+i.phone);
		
	}

}
