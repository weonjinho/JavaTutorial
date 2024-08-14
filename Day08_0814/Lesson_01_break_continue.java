package Day08_0814;

public class Lesson_01_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코데-- 이중 for문 필수이다.
		// 독해력 : 글을 읽는것 ---> 이해 목적
		// 반복문에서 break, continue 키워드 사용. -- 암기
		// for()/while()
		// break의 (정의)특징: 현재 반복문을 종료한다.(***)
//		int a=30;
//		if(true) {
//			if(a%2==0) {
//				break;
//			}
//		}
		// break,continue는 반복문(조건문 아님,조건문 아님,조건문 아님)에서 사용이 가능하다.
		// break,continue는 반복문(조건문 아님,조건문 아님,조건문 아님)에서 사용이 가능하다.
		// break,continue는 반복문(조건문 아님,조건문 아님,조건문 아님)에서 사용이 가능하다.

		
//		for(int i=0;i<100;i++) {
//			if(i>3) {
//				break;
//			}
//		}
		// for문이기 때문에 사용가능.
		
		
//		for(int i=0;i<100;i++) {
//			if(i>3) {
//				System.out.println(i);
//				break;					// 반복문에서 나간다.
//			}
//			System.out.println("h");
//		}
		
//		for(int i=0;i<100;i++) {
//			if(i>3) {
//				System.out.println(i);
//				break;					// 반복문을 종료한다.
//			}else {
//				System.out.println("h");
//			}
//		}
		
		
		// continue : 더 아상 코드를 실행하지 않고, 증감식 동작후 조건식을 판별한다.
		// 증감식: 증가하거나, 감소하는식.
//		for(int i=0;i<10;i++) {
//			if(i%2==0) {
//				continue;
//			}
//			System.out.println(i);	// 1 3 5 7 9
//		}
		// continue를 만나면 System.out.println(i)을 실행하지 않는다.
		
		
		// break : 반복문 종료시 많이 사용.
		
//		1부터 10까지 숫자중 짝수의 합을 구하시오.(continue 필이사용.)
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i+"hhhh");	// 코드 건너뛰기 전애 할일.
				continue;
			}
			System.out.println(i+"ssss");
			sum += i;
		}
		System.out.println(sum);
		
		// -------------------------------------------------------------
		 String id = "abcdefee";
		// 조건: id에 알파벳 e는 금지
		boolean flag = false;
		for(int i=0;i<id.length();i++) {
			if(id.charAt(i)=='e') {
				flag=true;	// e가 있다.
				break;
			}
		}
		if(flag) {						// if(조건식){}
			System.out.println("e있음.");
		}
		// 1. 자료형 을 파악한다.원시/참조
		// for문을 분석할때 i의 변화를 분석하라.
		
		// 시나리오:
		// 겅험:
		// id는 참조자료형(문자열) ---> index가 있고 0부터시작.
		//.length() :길이
		// .charAt(i) : 매개변수의 위치의 문자 라턴, ex)i=1 --> 문자 b를 리턴.
		// -------------------------------------------------------------
		
		// 선언문: 변수 자료형 값
		// 암기:
		// 원시: .사용불가 종류:int char boolean float
		// int char 사칙연산 가능.
		// 참조: .사용가능 종류: String ...
		// String 사칙연산 불가.
		
		// 암기 --> 경험 --> 예제(프로젝트 경험)
		
		
		
		
	}

}
