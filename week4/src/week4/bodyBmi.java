package week4;

import java.util.Scanner;

public class bodyBmi {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :>>");
		String name = sc.next();
		System.out.print("키()를 입력하세요:>>");
		int k = sc.nextInt();
		System.out.print("몸무게()를 입력하세요:>>");		
		int m = sc.nextInt();
		
		double mHeight = k/100.0;
		
		double bmi = m/(mHeight*mHeight);
		
		String result="";
		if(bmi>= 18.5 && bmi <= 22.9) {
			result = "정상";
		else if(bmi>= 23&&bmi <= 24.9)
			result = "과체중";		
		else if(bmi>= 25&&bmi <= 29.9)
			result = "비만";	
		else if(bmi>= 25&&bmi <= 29.9)
				result = "고도비만";	
		System.out.println("bmi = %.2f,%s\n",bmi,result);		
		}
		
	}

}
