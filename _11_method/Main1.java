package _11_method;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정의안가, 호출인가?
		//어떤 메소드인가?
		//메소드 정의 : 접근제어자 리턴타입...
		
		TestMethod t = new TestMethod();
		System.out.println(t.name);
		t.setName("hong"); //"hong"매개변수 값.
		System.out.println(t.name);
		System.out.println(t.getName());
//		String resultName = t.getName2("1122");
//		if(resultName != null) {
//			System.out.println(resultName);
//		}else {
//			System.out.println("비번틀림");
//		}
		
		//이름+마스팅 코드
		String masking = t.maskName("***");
		System.out.println(masking);
		
		
	}

}
