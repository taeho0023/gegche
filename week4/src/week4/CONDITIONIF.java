package week4;

import java.util.Scanner;

public class CONDITIONIF {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 태어난 연도를 입력하세요: ");
		int year = sc.nextInt();
		
		int age = 2025- year;
		if(age >= 20 && age <= 26) {
			System.out.println("대학생 ");
		}
		else if(17 <=age && age < 20 )
			System.out.println("고등학생");
		else if(14 <=age && age < 17 )
			System.out.println("중학생");
		else if(8 <=age && age < 14 )
			System.out.println("초등학생");
		else
			//age <= 7 || age >= 27
			System.out.println("학생이 아닙니다");

	}
}
