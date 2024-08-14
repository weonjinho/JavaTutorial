package _08_Random;

import java.util.Arrays;
import java.util.Random;

public class _00_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6개의 렌덤한 로또번호를 추출한다.
		int[] lotto = new int[6];
		Random r = new Random();
		// r변수를 참조하여 nextInt라는 기능을 호출, 리턴받은 수에 +1를 한다.
//		nextInt(45):0~44
//		+1를 보정이라 한다.
//		ctrl + shift + o: 자동 import 단축키
		// Random이라는 클래스를 내가 필요한 곳이다 import한다.(객체를 만들기 위해서다.)
		// 변수명, 길이, index
		// int에 초기값은 0이다.
		for(int i=0;i<lotto.length;i++) {
//			Random클래스는 JDK에 있다. 
			int k=r.nextInt(45)+1;
			lotto[i]=k;
		}
		System.out.println(Arrays.toString(lotto));
	}

}
