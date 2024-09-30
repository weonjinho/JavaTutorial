package _11_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestMethod r = new TestMethod();
		
		//Method study
		//index 012345
		String a = "880104";
		System.out.println(a.substring(0, 2)); //88
		String year = a.substring(0, 2);
		System.out.println(year); //88
		System.out.println("19"+year); //1988
		//객체의 기능중 ... 있다.
		
		// 다음 에러의 원인을 서술하세요.
		//리턴타입이 String이다, 저장 변수는 int 타입, 미스매치타입.
//		int month = a.substring(2, 4); //return 타입
		//String이란 클래스의 저으이된 메소드.

		System.out.println(a.contains("8"));
		String w = "개나리";
		String title = "오늘 컨디션 참 개나리야 짜증!";
		System.out.println(title.contains(w)); //특수문자 찾기.
		if(title.contains(w)) {
			System.out.println("욕설 금지"); // 욕설 검열.
		}else {
			System.out.println("제목은 올바른 표현입니다.");
		}
		System.out.println(title.indexOf(w));
		
		//과제: 제목에서 개나리 부분을 ***으로 바꾸시오.
		//방법1
		if(title.contains(w)) {
			System.out.println(title.replace(w, "***"));
		}
		//방법2
		String t1 = title.substring(0, title.indexOf(w));
		System.out.println(t1);
		String t2 = title.substring(title.indexOf(w)+3);
		System.out.println(t2);
		System.out.println(t1+"***"+t2);
		//여기에서의 포인트는 메소드를 찾아내고 사용하는 것.
		//사용할때는 메소드의 기능 ? 매개변수 값? 리턴타입과 리턴값을 이해.
		
		
		//과제: 제목에서 개나리라는 단어가 표현된 부분을 가져오세요,
		//	   단어가 포함된 기준은 개나리단어의 시작부터 스페이스까지.
		//	   위 샘풀에서는 [개나리야]를 가져오는 겁니다.
		//이 문제는 개나리야 부터 잘라 내면 된다 > substring
		//시작점은 indexOf(w)로 하고, 끝점은 indexOf(" ")로
		System.out.println(title.substring(title.indexOf(w), title.indexOf(" ",title.indexOf(w))));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}