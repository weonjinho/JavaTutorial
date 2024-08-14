package _04Random;

import java.util.Random;

public class _00_Test {
	public static void main(String[] args) {
		// 시나리오.. 렌던한 숫자를 뽑아서 로또 번호로 저장한다.
		// 로또 번호 저장할 배열
		int[] lotto = new int[6];
		// 렌던한 번호를 추출하기 위한 객체 만들기.
		Random r = new Random();
		// 렌던한 번호를 뽁기 취한 반복문
		for(int i=0;i<lotto.length;i++) {
			int k = r.nextInt(45)+1;
			lotto[i] = k;
		}
		// 로또 번호를 출력하는 반복문.
		for(int i=0;i<lotto.length;i++) {
			if(i==lotto.length-1) {		// 마지막 번호
				System.out.println("보너스: "+lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
		}
	}
}
