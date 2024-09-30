package _15_접근제어자_02;

public class CatDTO {
	private String name = null;
	private int age = 1;
	//멤버변수는 은닉화 시킨다. 무엇으로? 접근제어자로.
	//은닉화 시키면 CatDTO 클래스 외부에서 변수에
	//참조를 어떻게 하려고??
	//일단 은닉화 하고, 멤버변수에 저장및 인출에 관련
	//메소드를 만든다.. 저장하는 메소드를 setter
	//인출하는 메소드를 getter 라고 부릅니다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		checkName(name);
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private void checkName(String name2) {
		
	}
	
	//클래스,객체 ---> 클래스 추상화 ---> 접근제어자.
	
	//상속 ---> 인터페이스이다.
	
	
	
	//DTO : Date Transtorm Object
	//하나의 세트 데이터를 가져온다.
	//고양이 한미리를 정의한 데이터를 객체를 가져온다.
	
	//클래스의 네이밍 규칙은 반드시 적어논는다. *****
	
}
