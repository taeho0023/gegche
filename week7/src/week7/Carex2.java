package week7;

public class Carex2 {

	public static void main(String[] args) {
		//실행 클래스
		//오버로딩 생성자 이용
		
		Car c1 = new Car();
		System.out.printf("c1:%s %s %d\n",c1.model,c1.color,c1.maxspeed);
		
		Car c2 = new Car("그랜저");
		System.out.printf("c2:%s %s %d\n",c2.model,c2.color,c2.maxspeed);
		
		Car c3 = new Car("소나타","white");
		System.out.printf("c3:%s %s %d\n",c3.model,c3.color,c3.maxspeed);
		
		Car c4 = new Car("아반떼","navy",250);
		System.out.printf("c4:%s %s %d\n",c4.model,c4.color,c4.maxspeed);
		
	}

}
