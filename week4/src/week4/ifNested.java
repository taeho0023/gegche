package week4;

public class ifNested {
	public static void main(String[] args) {
		//랜덤 함수를 이용해서 0~100 사이의 점수 생성
		int score = (int)(Math.random() * 100);
		System.out.println("점수" +score);
		String grade;
		
		if (score >= 90) {
			if (score>95) 
				grade = "A+";
				else if (score>93 && score <= 95)
					//93 < score <= 95
					grade = "A0";
				else
					grade = "A-";
		}
		else if (score>=80) {
			if (score>85) 
				grade = "B+";
			else if (score>83)
				//93 < score <= 95
				grade = "B0";
			else
				grade = "B-";
		}
		else {
			grade = "C";
		}
		System.out.println("등급" +grade);
	}

}
