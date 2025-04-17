package week4;

public class ifElseErr {
	public static void main(String[] args) {
		int score = 85;
		char grade;
		
		if (score >= 90) {
			System.out.println("90점 이상");
			grade = 'A';
		}

		else if (score >= 80) {
			grade = 'B';
			System.out.println("80점 이상");
		}

		else if (score >= 70) {
			grade = 'c';
			System.out.println("70점 이상");
		}

		else if (score >= 60) {
			grade = 'D';
			System.out.println("60점 이상");
		}else {
			grade = 'F';
		}
		System.out.println(grade);
	}

}
