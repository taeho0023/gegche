package week12;

import java.util.Scanner;

public class SmartPhoneEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		SmartPhone sp = new SmartPhone();
		EarPhone ep = null;
		
		System.out.println("** 스마트 포느올 음악 재생하기 **");
		
		while(true) {
			System.out.print("이어폰 선택(1.buds 2.airpods 3.Tonfree 4.종료 >> ");
			menu = sc.nextInt();
			if (menu ==4)
				break;
			if(menu ==1)
				ep = new Buds();
			else if (menu ==2)
				ep = new AirPods();
			else
				ep = new Tonfree();
			
			sp.musiOn(ep);
			sp.musiOff(ep);
		}
	}

}
