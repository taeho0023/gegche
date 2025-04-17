package week4;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		String mobile = "iphone";
		
		switch(mobile) {
		case "iPhone" -> System.out.println("애플 제품");
		case "Galaxy" -> System.out.println("삼성 제품");
		default -> System.out.println("기타 제품");
		}
		
		//점수를 입력받아 switch 문장으로 등급 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력(0~100) >>");
		int score = sc.nextInt();
		
		char grade = switch(score/10) {
		case 10,9 -> 'A';
		case 8 ->'B';
		case 7 ->'C';
		case 6 ->'D';
		default -> 'F';
		};
		System.out.print(grade);
		sc.close();
	}

}
