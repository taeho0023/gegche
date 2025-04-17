package week4;

public class ifElse {
	public static void main(String[] args) {
		int score = 85;
		
		if (score >= 90) {
			//true 경우
			System.out.println("90점 이상");
			System.out.println("A등급");
		}else {
			//false 인 경우
			//score < 90
			System.out.println("90점 미만");
			System.out.println("B등급");

		}
	}
}
