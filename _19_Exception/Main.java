package _19_Exception;

public class Main {

	public static void main(String[] args) {
		//의도
		//바이너리 코드가 실행이 되면
		//jvm 의 코드영여게 소스가 로딩이 되고
		//스레드*가 생성되어 main 메소드 코드를 실횅한다.
		//new는 객체를 만들고 객체의 주소를 리턴받는다.
		//new연산자 뒤에는 생성자를 작성한다.
		//생성자로 객체를 만들고, 생성자(메소드)를 호출한다.
		//생성자 메소드의 모든 코드가 종료되면 호출 위치로 리턴.
		new MemberAdmin();
	}

}
