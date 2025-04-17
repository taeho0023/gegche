package week6;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 2차원 배열은 1차원 배열을 이용해서 구현
		int[][] math = new int[2][3];
		
		//행의 반복 : 밖깥쪽 for
		//열의 반복 : 안깥쪽 for
		for (int i=0; i<math.length;i++) {
			//배열의이름이 length = 행의크기
			for(int j=0; j<math[i].length;j++) {
				//math[i].length : i번쨰 행의 길이
				System.out.printf("math[%d][%d] = %d\n",i,j,math[i]);
			}
		}
		System.out.println();
		int[][]eng = new int[2][];
		

	}

}
