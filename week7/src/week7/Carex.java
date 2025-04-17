package week7;

public class Carex {
	public static void main(String[] args) {
		//실행 클래스
		//객체 생성
		Car mycar = new Car();
		
		//필드값 출력
		//객체의 속성 (필드) 값을 접군할 때는 반드시 객체변수명으로 접근
		System.out.println("-- mycar --");
		System.out.println("제작회사:"+ mycar.company);
		System.out.println("모델:"+ mycar.model);
		System.out.println("색상:"+ mycar.color);
		System.out.println("최고속도:"+ mycar.maxspeed);
		System.out.println("현재속도:"+ mycar.speed);
		
		//필드 값 변경
		//외부 클래스에서는 반드시 필드값을 객체변수명으로 접근
		mycar.speed = 100;
		System.out.println("현재속도:"+ mycar.speed);
		
		
		Car yourcar = new Car();
		System.out.println("-- yourcar --");
		System.out.println("제작회사:"+ yourcar.company);
		System.out.println("모델:"+ yourcar.model);
		System.out.println("색상:"+ yourcar.color);
		System.out.println("최고속도:"+ yourcar.maxspeed);
		System.out.println("현재속도:"+ yourcar.speed);
		
		
		//매개변수를 이용해서 초기화하는 생성자를 이용
		Car mycar2 = new Car("그랜저","White",350);
		System.out.println("-- mycar2 --");
		System.out.println("제작회사:"+ mycar2.company);
		System.out.println("모델:"+ mycar2.model);
		System.out.println("색상:"+ mycar2.color);
		System.out.println("최고속도:"+ mycar2.maxspeed);
		System.out.println("현재속도:"+ mycar2.speed);
		
		
		Car yourcar2 = new Car("그랜저","White",350);
		System.out.println("-- yourcar2 --");
		System.out.println("제작회사:"+ yourcar2.company);
		System.out.println("모델:"+ yourcar2.model);
		System.out.println("색상:"+ yourcar2.color);
		System.out.println("최고속도:"+ yourcar2.maxspeed);
		System.out.println("현재속도:"+ yourcar2.speed);
	}

}
