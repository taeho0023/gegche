package week12;

public class VolumeEX {

	public static void main(String[] args) {
		//익명객체 구현
		//구현 클래스 선언없이 바로 구현객체를 생성
		//인터베이스 변수 = new 인터페이스() {};
		Volume vol = new Volume() {

			@Override
			public void volumeUp(int level) {
				System.out.println("익명객체 볼륨을 올립니다 "+level);
				
			}

			@Override
			public void volumeDown(int level) {
				System.out.println("익명객체 볼륨을 내립니다 "+level);
				
			}
			
		};
		
	 
		vol.volumeUp(5);
		vol.volumeDown(3);
		
		Volume vo12 = new Volume() {
			
			@Override
			public void volumeUp(int level) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void volumeDown(int level) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
