package week4;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("상품 구매 금액 >> ");
			
			int price = sc.nextInt();
			
			int rate = 0; 
			int f; 
			
			if(price >= 100000) 
				rate = 10 ;
				else if (price >= 50000)
					rate = 5 ;
				
				int d = price * rate /100;
				
				f = price - d;
				System.out.println("원래가격 "+price);
				System.out.println("할인율 "+rate);
				System.out.println("최종가격 "+f);
			

	}

}
