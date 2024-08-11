package WeonMathFiles;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// 피보나치 수열을 생성하는 코드.
		// 분석과정:
		// 1. 피보니치 수열 생성: 1 1 2 3 5 8 13
		// 2. int i는 수열에 첫번째 숫자(1)이다.
		// 3. 다음 피보나치 수를 구하는 공식: 다음피수 = 이전피수 + 현재피수.
		// 4. int bint : 이전피수(이전i)
		
		// [1] = bint + [0]   1 = 1 + 0		// 다음피수 = 현재피수 + 이전피수
		// [2] = [1] + [0]	  2 = 1 + 1		
		// [3] = [2] + [1]	  3 = 2 + 1
		// [4] = [3] + [2]    5 = 3 + 2
		// [5] = [4] + [3]    8 = 5 + 3
		// [6] = [5] + [4]   13 = 8 + 5
		int bint = 0;					// 이전 피수
		for(int i=1;i<20;) {			// int i는 수열의 첫번째 숫자이다.
			System.out.println(i);
			int temp = i;				// 현재 i값 백업 ( temp변수 선언이 중요 포인트! )
			i = bint + i;				// 다음피수(i값) = 이전피수 + 현재피수
			bint = temp;				// 이전bint에 현재 i값 저장.
		}
		
	}

}
