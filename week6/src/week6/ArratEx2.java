package week6;

public class ArratEx2 {

	public static void main(String[] args) {
		//배열을사용하는 연습문제
		//길이가 10 인 정수타입위 배열을 선언
		int[] scoer = new int[10];
		//각 배열에다가 랜덤하게 생성된 정수(0~99)를 저장
		//배열 처러 =>for문을 이용
		//누적되는 변수는 반두시 초기화;
		int sum = 0;
				
		System.out.println("=랜덤 생성된 점수 배열= ");
		for (int i=0; i<scoer.length;i++) {
			scoer[i] = (int)(Math.random()*100);
			System.out.printf("scoer[%d] = %d\n",i,scoer[i]);
			sum +=scoer[i];
		}
		double ave = (double)sum / scoer.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균: "+ ave);

	}

}
