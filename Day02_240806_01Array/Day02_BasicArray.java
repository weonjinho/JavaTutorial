package Day02_240806_01Array;

public class Day02_BasicArray {
	public static void main(String[] args) {
		// 내용 : 자바의 배열
		/*
		 * 특징 : 
		 * 1. 변수 하나로 여러개의 값을 저장함
		 * 2. 같은 자료형을 연속적으로 저장. (나중에는 다른 다료형도 저장 할 수 있는 것 배울예정)
		 * 3. 고정길이 - 사용하지 않은 index가 있을 수도 있고 , 길이가 짧아서 데이터를 다 저장하기 못할 수도 있음, 단 속도는 빠름.
		 * 공부할때 : 배열의 길이( 변수명.length ), 베열의 인텍스 기억하자!
		 * 
		 * */ 
		// 배열 선언문
		// 자료형[] 변수명 = new 자료형[배열길이];
		// 배열의 인덱스 번호는 0부터 (배열길이-1)까지 이다.
		int[] lotto = new int[3];	// 길이 6, 인덱스 0-5, value type:int
		System.out.println(lotto[0] +"/"+lotto[1]+"/"+lotto[2]);
		System.out.println(lotto.length);
		
		// 배열의 값을 초기화 하기 전에는 배열 타입의 기본값이 들어간다.
		// 타입별 기본값:
		// 정수형:
		// byte	 --> 0
		// short --> 0
		// int	 --> 0
		// long  --> 0L
		// 문자형:
		// char  --> '\u0000'
		// 실수형:
		// float --> 0.0f
		// double--> 0.0d
		
		lotto[0] = 20;	// 변수명[index] = 대입할 값;
		lotto[1] = 30;
		lotto[2] = 40;
		System.out.println(lotto[0] +"/"+lotto[1]+"/"+lotto[2]);
		lotto[0] = lotto[1] = lotto[2];	
		System.out.println(lotto[0] +"/"+lotto[1]+"/"+lotto[2]);
		System.out.println(lotto[0]+20);
		System.out.println(lotto[0] +"/"+lotto[1]+"/"+lotto[2]);
		lotto[3] = lotto[1] + 20;	// 3번 인덱스가 없음.
		// 배열 범위 초과 에러(없는 index 번호에 값을 대입할때) : ArrayIndexOutOfBoundsException
	}
}
