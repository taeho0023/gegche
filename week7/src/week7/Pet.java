package week7;

public class Pet {
	String name;
	String type;
	String age;
	String color;
	Pet(String name,String type,String age,String color){
		this.name=name; 
		this.type=type;
		this.age=age;
		this.color=color;
	
	}
	Pet(String name,String type){
		this.name=name;
		this.type=type;
		this.age="0살";
		this.color="미정";
	}

}
