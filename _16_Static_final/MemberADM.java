package _16_Static_final;

public class MemberADM {
	public String name = null;
	public static String companyName = "Human";
	public static final String teamname = "kimTeam";
	//변수 하나를 만들고 공용으로 가져와서 사용하겠다, 단 변수값 변경불가.
	
	//final ---> 초기값이 결정되면, 변경불가.
	//public final String name = "aaa";는 객체가 생성될때 마다 만들어진다. *** static이 없기때문.
	//static ---> 공유해서 사용하겠다.
	
	//teamName라는 변수의 값을 변경할수 없다, 그것을 상수라고 한다.
	
	//3.14, 기준금리 등...
	//객체를 100게 만들어도 메모리에 차지하는 공간은 1개이다.
	
	//접근제어자랑, static, final의 의미는 다르다.
	
	//static final 하면 변경불가가 된다.
	//static는 저장된 메모리를 같이 사용한다.

	//static는 하나면 만들면 여러 클래스에서 사용할 수 있다.
	MemberADM(){
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 MemberADM"+"생성자 실행");
	}
	public static void prt() {
//		System.out.println(name);
		
	//자바에서 반드시 이해할 내용:
	//자료형, 변수
	//if for
	//클래스 객체
	//클래스 추상화
	//JVM
	//접근제어자
	//static final
	// + 문제해결 능력
		
	//admin객체는 공용적으로 사용되는 느낌이고, memberOne은
	//디자인 페턴
		
		
	}
	
}
