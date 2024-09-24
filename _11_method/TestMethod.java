package _11_method;

public class TestMethod {
	//생성자는 눈에 안 보이지만 생략되어 있음.
	
	//이름뒤에 마스킹을 해주는 메소드 만들기
	//호출할때 문자열로 마스킹 문자를 지정하면,
	//이름뒤에 마스킹 문자를 연결하여 리턴한다.
	//메소드명은 maskName
	
	//매개변수, 기능, 리턴
	//메소드 정의, Call
	//매개변수 값, 매개변수 정의, 리턴타입...
	
	
	public String maskName(String masking) {
		return name+masking;
	}
	
	
	String name = null;	//멤버변수
//	public String getName2(String pwd) {
//		if(pwd.equals("1111")) {
//			return name;
//		}else {
//			return null;
//		}
//	}
	public void setName(String n) { //메소드가 정의되어 있다. String n: 매개변수 정의.
		name = n;
	}
	public String getName() {
		return name;
	}
}
