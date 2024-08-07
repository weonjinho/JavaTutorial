package Day03_240807_Q;

import java.util.Arrays;

public class Question {

	public static void main(String[] args) {
		
//		모든 문제 for문 사용불가!
//		1. 평균을 저장하는 변수를 만들고 89.2라고 저장하시오.
//			평균이 80점 이상이면 합격, 80점 마만이면 불합격이라고 출력하시오.
		double avg = 89.2;
		if(avg>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("---------");
		
		
//		2. int level = 2;
//			int point = 30;
//			level 이 1이면 포인트에 30을 더하고
//			level 이 1이 아니면 포인트에 10을 더하시오.
//			sysout을 한 번만 사용하여 최종 포인트를 출력하시오.
		int level = 2;
		int point = 30;
		if(level == 1) {
			point += 30;
		}else {
			point += 10;
		}
		System.out.println(point);
		System.out.println("---------");
		
		
		

//		3. int[] lotto = {6,12,33,4,5,26} * 배열의 값은 바뀔 수 있다.
//			로또 번호이다
//		    3번째 값에 80을 더하시오.
		int[] lotto = {6,12,33,4,5,26};
		int result1 = lotto[2] + 80;
		System.out.println(result1);
		System.out.println("---------");
		
		
		
//		4. int[] lotto = {6,12,33,4,5,26} * 배열의 값은 바뀔 수 있다.
//			4번째 번호가 홀수이면 홀수, 짝수이면 짝수라고 출력하시오.
		int result2 = lotto[3];
		if(result2 % 2 ==1) {
			System.out.println("홀수");
		}else if(result2 % 2 ==0) {
			System.out.println("짝수");
		}
		System.out.println("---------");
		
		
//		5. int[] lotto = {6,12,33,4,5,26} * 배열의 값은 바뀔 수 있다.
//			홀수인 로또 번호의 합을 구하시오.. 결과 : 33+5 = 38
		int oddSum = 0;
		boolean r0 = true;
		int[] numbers = new int[2];
		boolean r1 = lotto[0]%2==1;
		boolean r2 = lotto[1]%2==1;
		boolean r3 = lotto[2]%2==1;
		boolean r4 = lotto[3]%2==1;
		boolean r5 = lotto[4]%2==1;
		boolean r6 = lotto[5]%2==1;
		if(r0 == r1) {
			oddSum += lotto[0];
			numbers[0] = lotto[0];
		}
		if(r0 == r2) {
			oddSum += lotto[1];
			if(numbers[0]!=0) {
				numbers[1] = lotto[1];
			}else {
				numbers[0] = lotto[1];
			}
		}
		if(r0 == r3) {
			oddSum += lotto[2];
			if(numbers[0]!=0) {
				numbers[1] = lotto[2];
			}else {
				numbers[0] = lotto[2];
			}
		}
		if(r0 == r4) {
			oddSum += lotto[3];
			if(numbers[0]!=0) {
				numbers[1] = lotto[3];
			}else {
				numbers[0] = lotto[3];
			}
		}
		if(r0 == r5) {
			oddSum += lotto[4];
			if(numbers[0]!=0) {
				numbers[1] = lotto[4];
			}else {
				numbers[0] = lotto[4];
			}
		}
		if(r0 == r6) {
			oddSum += lotto[5];
			if(numbers[0]!=0) {
				numbers[1] = lotto[5];
			}else {
				numbers[0] = lotto[5];
			}
		}
		System.out.println(numbers[0] + "+" + numbers[1] + "=" + oddSum);
		System.out.println("---------");
		
		
		
//		6. 숫자의 모든 합을 구하시오.
//			int[] a = {45,34,64,45,24} * 배열의 값은 바뀔 수 있다.
		int[] a = {45,34,64,45,24};
		a[1] += a[0];
		a[2] += a[1];
		a[3] += a[2];
		a[4] += a[3];
		System.out.println(a[4]);
		System.out.println("---------");

//		up
//		7. [숫자놀이]철수는 숫자를 0번째분터 2번째까지 차례대로 수집했다.
//			철수는 숫자의 자릿수를 분해하여 합한 결과 값이 가장 큰 숫자를 선택할 예정이다.
//			숫자를 분해하는 것은 45인 경우 4+5를 의미한다.
//		  	철수가 선택할 숫자는 몇 번째 수집한 숫자인가?
//			int[] aa = {45, 34, 64};
			int[] aa = {45, 34, 64};
			int aa1 = aa[0]/10;
			int aa2 = aa[0]%10;
			int aa3 = aa[1]/10;
			int aa4 = aa[1]%10;
			int aa5 = aa[2]/10;
			int aa6 = aa[2]%10;
			if((aa1+aa2)>(aa3+aa4) && (aa1+aa2)>(aa5+aa6)) {
				System.out.println(aa[0]);
			}else if((aa3+aa4)>(aa5+aa6)) {
				System.out.println(aa[1]);
			}else  {
				System.out.println(aa[2]);
			}
		
		System.out.println("===");
		
//		up2
//		int[] x = {6,5,9}		0번 새 위치 6,4
//		int[] y = {4, 10, 6} 	1번 새 위치 5,10
//								2번 새 위치 9,6
//		네모는 새, 화살표는 총알
//		총알은 직진으로 움직인다.
//		총알에 맞는 새의 번호를 출력하시오.
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		int[] bird = {3,2};
		double tanBullet = (bird[1]*1.0)/(bird[0]*1.0);
		double tanBird1 = (y[0]*1.0)/(x[0]*1.0);
		double tanBird2 = (y[1]*1.0)/(x[1]*1.0);
		double tanBird3 = (y[2]*1.0)/(x[2]*1.0);
		if(tanBird1==tanBullet) {
			System.out.println("Bang1");
		}
		if(tanBird2==tanBullet) {
			System.out.println("Bang2");
		}
		if(tanBird3==tanBullet) {
			System.out.println("Bang3");
		}
		
	}

}
