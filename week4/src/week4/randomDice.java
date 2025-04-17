package week4;

public class randomDice {
	public static void main(String[] args) {
		//랜덤 함수: Math.random()을 사용 => 0.0~0.99999사이의  실수를 반환
		double num = Math.random();
		System.out.println("랜덤숫자 = "+num);
		
		//주사위 놀이 : 1~6
		int number = (int)(num * 6 +1);
		System.out.println("주사위 숫자 = "+number);
		
		
	}

}
