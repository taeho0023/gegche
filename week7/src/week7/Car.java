package week7;

public class Car {
    //자동차 객체를 만들기 위한 라이브러리요 클래스 => 설계도
	//자동차 객체의 속성 => field(필드)
	String company = "현대자동차";
	String model  ;
	String color  ;
	int maxspeed  ;
	int speed;
	
	//생성자를 선언하지 하지않으먄 기본생성자가 자동으로 생김
	//하지만 하나라도 생성자를 선언하면 안생김
	
	//생성자 오버로딩(오버로딩)
	Car(){
		//기본 생성자
	}
	
	Car(String model,String color){
//		//this.model = model;
		//this.color = "black";
		//this.maxspeed = 300;
		this(model,color,200);
	}
	
	Car(String model){
		//this.model = model;
		//this.color = "black";
		//this.maxspeed = 300;
		this(model,"black",300);
	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		
	}
}
