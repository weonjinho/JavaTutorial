package Day08_0814;

import java.util.Random;

public class _typeLesson {

	public static void main(String[] args) {
		int[] lo = new int[6];
//		lo[0] = 렌던번호;
//		렌던수를 제공하는 부품 ---> Random(클래스)
		// 부품을 만든다.
		Random r = new Random();
		r.nextInt(45);
		// 내가 필요한 객체는 Random객체
		// 클래스로 객체를 만든다 --> Random객체중에 nextInt()라는 기능이 필요하다.
		// 이러한 매칭 과정이 매우 중요하다!!!
		
		// 컴버스 객체 --> 그림 게임 만들기.
	}

}
