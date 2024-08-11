package Day03_240807_02if;

public class ThinkingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		int a =8;
		
		//코드1
		if(a==1) {
			System.out.println("1입니다.");
		}else if(a==2) {
			System.out.println("1입니다.");
		}else if(a==3) {
			System.out.println("1입니다.");
		}else if(a==4) {
			System.out.println("1입니다.");
		}else if(a==5) {
			System.out.println("1입니다.");
		}else if(a==6) {
			System.out.println("1입니다.");
		}else if(a==7) {
			System.out.println("1입니다.");
		}else if(a==8) {
			System.out.println("1입니다.");
		}else if(a==9) {
			System.out.println("1입니다.");
		}
		
		long endTime = System.nanoTime();
		long durationTimeSec= endTime - startTime;
		System.out.println(durationTimeSec + "m/s");
		System.out.println((durationTimeSec / 1000) + "sec"); // 초 단위 변환 출력
		
	}

}
