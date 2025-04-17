package week2;

public class DatType2 {
	public static void main(String[] args) {
		float fValue = 3.14f;
		double dValue = 3.14;
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		
		fValue = 0.1234567890123456789f;
		dValue = 0.12345678990123456789;
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);

		//e 기호
		int iData = 450000;
		float fData = 3e7f; //e : 10의 제공승 e7 = 1000000
		double dData1 = 3e7;
		double dData2 = 3e-7; //e-7 = 0.0000001
		
		System.out.println("iData = " + iData);
		System.out.println("fData = " + fData);
		System.out.println("dData1 = " + dData1);
		System.out.println("dData2 = " + dData2);
		
		System.out.println();
		System.out.printf("iData = %d \n", iData);
		System.out.printf("fData = %f \n", fData);
		System.out.printf("dData1 = %f \n", dData1);
		System.out.printf("dData2 = %f \n", dData2);
		
		System.out.println();
		System.out.printf("fData = %.4f \n", fData);
		System.out.printf("dData1 = %.2f \n", dData1);
		System.out.printf("dData2 = %10.8f \n", dData2);



		
   }
}