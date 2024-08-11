package Day04_240808;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제1
//		for(int i=0; i<3; i++) {}
//		for(int i=3; i>0; i--) {}
//		for(int i=0; i<100; ) {}	// 무한루프
//		for(int i=0; i<(i+1); i++) {}	// 무한루프
		
//		문제2
////		int[] a = {30,40,50,55,65}을
////		65 55 50 40 30 순으로 출력
//		int[] a = {30,40,50,55,65};
//		for(int i=4;i>=0 ;i--) {
//			System.out.print(a[i]+" ");
//		}
////		40 50 55 65 30 순으로 출력
//		System.out.println();
//		for(int i=1;i<=5;i++) {
//			System.out.print(a[i%5]+" ");
////			작은수%큰수 ==> 작은수
//		}
//		System.out.println();
//		for(int i=0;i<=4;i++) {
//			System.out.print(a[(i+1)%5]+" ");
////			코딩 테스트에는 i=0이 좋다.
//		}
//		
//		System.out.println();
////		배열 순회를 반복하면서 값의 조건 판단후 출력.
//		for(int i=0;i<5;i++) {
//			if(a[i]>=50) {
//				System.out.print(a[i]+" ");
//			}
//		}
		
		
//		int[] a = {30,40,50,55,65};
//		1. 50점 이상 정수를 합하시오.
		int sum = 0;
		int[] a = {30,40,50,55,65};
		for(int i=0;i<5;i++) {
			if(a[i]>=50) {
				sum += a[i];
			}
		}
		System.out.println(sum);
		System.out.println("------");
	
//		2. 평균을 구하시오 단, 50점 이상만.
		int cnt = 0;
		double avg = 0.0;
		for(int i=0;i<5;i++) {
			if(a[i]>=50) {
				cnt++;
			}
			avg = (sum*1.0)/(cnt*1.0);	// 평균값 구하기.
		}
		System.out.println(avg);
//		System.out.println((double)sum/cnt);	// [주의] 케스팅을 적극 활용하도록!!!
		System.out.println("------");
		
//		3. 평균을 구하시오 단, 최저 점수는 포함하지마시오.
		int sum2 = 0;
		int cnt2 = 0;
		int minValue = 100;
		double avg2 = 0.0;
		for(int i=0; i<5; i++) {
			if(a[i]<minValue) {	// 최소값 찾기.
				minValue = a[i];
			}
			if(a[i]!=minValue) {	
				sum2 += a[i];		// 누적값 구하기
				cnt2++;				// 조건에 맞는 값의 개수.
			}
//			avg2 = (sum2*1.0)/(cnt2*1.0);	// 평균 구하기
			avg2 = (double)sum2/cnt2;
		}
		System.out.println(cnt2);
		System.out.println(avg2);
		System.out.println(sum2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
