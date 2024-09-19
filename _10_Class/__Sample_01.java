package _10_Class;

import java.util.Random;

public class __Sample_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Random r = new Random();	//참조변수는 객체의 주소을 저장한다.
		Random r1 =r;	//r1는 r의 주소를 참조한다. (객체를 공유한다.)
		Random r2 = null; //에러: 객체를 참조할 주소가 없다. ---> exception
		Random r3 = new Random(); //r3는 랜덤이라는 객체의 주소를 저장한다.
		System.out.println(r.nextInt(4));//r를 참조한다. nextInt()라는 기능을 사용하겠다.
		System.out.println(r1.nextInt(4));//r1를 참조한다.
		System.out.println(r2.nextInt(4));//r2를 참조한다.
		System.out.println(r3.nextInt(4));//r3를 참조한다.
//		1.원시변수랑 참조변수를 구분한다.
//		2. 원시변수는 값을 저장하고,참조변수는 객체이 주소를 저장하고 있다.
//		3. 주소는 객체의 위치다.
		
//		객체는 합에 있다.
//		참조변수가 저장하고 있는 주소값을 참조하여 객체에 접근.
//		변수는 5개 있다, 이 중 원시변수는 1개, 참조변수는 4개 있고, 객체는 2개 있다.
//		변수는 값을 저장하는 공간이다,그 공간만 있더라도 변수는 존재합으로 r2도 참조변수이다.
//		".":참조하다.
		
//		*** 두 코드의 차이:
//		Random r = new Random(); --- 객체를 직업만든 코드.
//		Random r1 =r; 			 --- 만들어진 주소를 주입받아 사용하는 코드.
		
//		String aa = "abcd";
//		String aa = new String("abcd");
	}

}
