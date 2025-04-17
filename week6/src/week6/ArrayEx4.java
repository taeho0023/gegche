package week6;

public class ArrayEx4 {

	public static void main(String[] args) {
		String[] st = {"홍길동", "이순신","김광찬","고길동"}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾고싶은 학생 이름>>");
		String name = sc.next();
		
		//존재여부 변수+
		boolean found = false;
		
		for (int i=0; i<st.length;i++) {
			if(st[i].equals(name)) {
				found = true;
						break;
			}
		}
		
		if(found)
			System.out.printf(name +"이 있음");
		else
			System.out.printf("없음");
	}

}
