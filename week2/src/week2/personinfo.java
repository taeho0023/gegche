package week2;

public class personinfo {
	public static void main(String[] args) {
	
	String name = "박태호";
	int aData = 25;
	double bData = 170;
	char cData = 'M';
	boolean dData= true;
	
	System.out.println("키 : " + name);
	System.out.println("나이 : "+ aData +"세");
	System.out.printf("키 : %.1fcm \n", bData);
	System.out.printf("성별 : %c \n",cData);
	System.out.printf("학생여부 : %b \n",dData);

	
	}

}
