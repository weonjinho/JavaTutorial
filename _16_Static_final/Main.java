package _16_Static_final;

public class Main {
	//접근  공용변수  리턴타입 메소드명 매개변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		//스레드가 코드를 실행한다.
		//현재 코드를 실행하는 스레드의 여러 정보 중
		//스레드의 이름을 가져오라.
		System.out.println(name + "스레드가 1초 뒤에 시작합니다.");
		//클래스별 스레드가 다르다? X
		try {
			Thread.sleep(1000); // 1초간 코드를 실행하지 않는다는뜻.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//MemberADM m = new MemberADM();
		//static변수는 공용변수. 위치는 Method area
		//모든 스래드가 공용해서 사용가능 > 즉, 변수값접근가능.
		//객체를 만들지 않고 클래스명과 변수또는 메소드명으로 접근.
		String a = MemberADM.companyName; //클래스명.멤버변수명
		System.out.println(a);
		System.out.println(MemberADM.companyName);
		MemberADM.prt();
		MemberADM.companyName = "HOman"; //보안에 매우 취약하다. 
		System.out.println(MemberADM.companyName);
		//공용변수는 유출하면 안된다.
		
		MemberADM mm = new MemberADM();
		mm.name = "a";
		mm.companyName = "abc";
		MemberADM mmm = new MemberADM();
		mmm.name = "b";
		mmm.companyName = "kkk";
		System.out.println(mm.name); // a
		System.out.println(mm.companyName); // kkk
		
//		MemberADM.teamname = "kkk"; // 상수는 초기값이 결정되면 값을 변경 불가능.
		
		
		//static는 이변수를 공통으로 사용하겠금 선언하겠다.
		
		//새로운 스레드를 만들어서 멀터스레드로 운용이 가능. *
//		Thread t1 = new Thread();
//		t1.setName("task1_thread");
//		String tname = t1.getName();
//		System.out.println("새로만든 스레드 이름은 "+tname);

		
		//final은 처음에 값을 세팅하면 반경할 수 없다.
		//final은 초기값을 세팅하면 변경할 수 없다.
		
		
		
		
		
		
		
	}

}
