package week2;

public class productPrice {
	public static void main(String[] args) {
		int aData = 7;
		int bData = 5700;
		//상품 단가 계산 = 총구매금액 / 개수
		double cData = (double)bData / aData;
		
		System.out.printf("구매수량 : %d개 \n", aData);
		System.out.printf("총 구매금액 : %d원 \n", bData);
		System.out.printf("상품단가 : %.1f원 \n", cData);
	}
}
