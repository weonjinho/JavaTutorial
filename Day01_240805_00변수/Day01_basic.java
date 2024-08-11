package Day01_240805_00변수;

public class Day01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 자료형 : 정수형, 실수형, 논리형, 문자형
		// 참조 자료형 : Object, String, Array, Wrapper클래스
		
		// 1.정수형 변수 선언
		// 정수 타입:
		// 정수형 타입			할당되는 메모리 크기			데이터의 표현 범위		
		// byte 			1byte					-128 ~ 127
		// short			2byte					-32,768 ~ 32,767
		// int(정수 기본타입)	4byte					-2,147,483,648 ~ 2,147,483,647
		// long				8byte					-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		int a = 10;
		byte aa = 10;
		System.out.println(a);
		System.out.println(aa);
		
		
		
		// 2.실수형 변수 선언
		// 실수 타입:
		// 실수형 타입				할당되는 메모리 크기			데이터의 표현 범위
		// float				4byte					1.4*10의(-45)승 ~ 3.4*10의(38)승
		// double(실수 기본타입)	8byte					4.9*10의(-324)승 ~ 1.8*10의(308)승
		float b = 10.0f;
		double bb = 11.0;
		System.out.println(b);
		System.out.println(bb);
		
		
		// 3.논리형 변수 선언
		// 참(true) 또는 거짓(false)의 값을 갖는 자료형을 논리형(불리언) 자료형이라고 한다.
		// 논리형 타입				할당되는 메모리 크기			데이터의 표현 범위
		// boolean				1byte					true, false
		boolean isSuccess = true;
		boolean isTest = false;
		
		// 불리언 자료형에는 다음과 같이 숫자 연산자의 결과값이 대입된다.
		boolean bool1 = (2>1);
		boolean bool2 = (1==2);
		boolean bool3 = (3%2==1);
		boolean bool4 = ("3".equals("2"));
		System.out.println(bool1);	// true
		System.out.println(bool2);	// false
		System.out.println(bool3);	// true (3을 2로 나눈 나머지는 1이므로 참이다.)
		System.out.println(bool4);	// false
		
		// 그래서 이러한 참,거짓을 판단하는 불리언 연산을 이용해 if문과 같은 조건문에 자주 애용된다.
		int base = 180;
		int height = 185;
		if(height > base) {
			System.out.println("키가 큽니다.");
		}
		
		
		
		
		
		
		
		// 4.문자형 변수 선언 --- 작은 따옴표('')사용
		// 문자형 타입		할당되는 메모리 크기		데이터의 표현 범위	
		// char			2byte				0 ~ 65,535
		char c1 = 'a';			// 문장로 표현
		char c2 = 97;			// 아스키코드로 표현
		char c3 = '\u0061';		// 유니코드로 표현
		
		System.out.println(c1);	// a 출력
		System.out.println(c2);	// a 출력
		System.out.println(c3);	// a 출력
		
		char A = 'C' - 2;	// 103 - 2
		System.out.println(A); // 'A'
		
		// 5.문자열 변수 선언 --- 큰따옴표("")사용
		String str = "Hello!";
		System.out.println(str);
	}

}
