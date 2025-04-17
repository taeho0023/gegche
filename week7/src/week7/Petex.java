package week7;

public class Petex {

	public static void main(String[] args) {
		Pet Petex = new Pet("구름","강아지","2살","흰색");
		System.out.println("<애완동물>");
		System.out.println("이름::"+Petex.name);
		System.out.println("종류:"+Petex.type);
		System.out.println("나이:"+Petex.age);
		System.out.println("색깔:"+Petex.color);

		Pet Petex2 = new Pet("초코","고양이");
		System.out.println("<애완동물>");
		System.out.println("이름::"+Petex2.name);
		System.out.println("종류:"+Petex2.type);
		System.out.println("나이:"+Petex2.age);
		System.out.println("색깔:"+Petex2.color);
	}

}
