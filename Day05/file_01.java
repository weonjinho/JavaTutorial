package Day05;

public class file_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 피보나치 수열 생성 : 1 1 2 3 4 8 13
		// int i 는 수열에 첫번쩨 숫자이다.
		// 다음 피보니치 수 공식 : 이전피수 + 현재피수
		// int bint : 이전 i
		int bint = 0;
		for(int i=1;i<20;) {	// 증감식에 공백은 생략 가능하다.
			System.out.println(i);
			int temp = i;	// temp변수 선언하는 것이 중요한 포인트.	// 현재 i값 백업
			i = bint + i;	// 다음i값
			bint = temp;	// 이전bint에 현재 i값 저장
		}
		
//		변수2개, for문 1개
		int a = 987654321;
		int sum = 0;
		for(;a>0;) {
			sum += (sum%10);
			a/=10;
		}
		System.out.println(sum);
		
		
		
		
	}

}
