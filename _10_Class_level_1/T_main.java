package _10_Class_level_1;

public class T_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// T_center를 의존하기 때문에 변수가 필요.
		T_Center tcenter = new T_Center(); //"변수가 필요하다"가 포인트.
							   //생성자
							   //객체를 만들때 
		//T_main클래스은 T_center클래스를 의존하고 있다, 실제 참조는 불가능하다.
		//의존 관계는 판단할 수 있다, 실제 참조는 불가능하다.
		//T_main클래스은 T_center클래스를 의존하고 있다,T_main클래스은 T_center클래스를 참조하기 위해
		//객체를 마
		
		//직접 참조하는 주소를 만들고 참조한다.
		//주업 받았다.
		//주업받는게 중요한 이유 ---> 개발자가 객체를 함부로 만들기 않겠다.
		
	}

}
