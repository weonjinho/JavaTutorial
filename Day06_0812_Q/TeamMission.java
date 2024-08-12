package Day06_0812_Q;

import java.util.Arrays;
import java.util.Scanner;

public class TeamMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 선택받은너
		// int[] letter={8,12,4,13,2,14,4,5}
		// 짝수만 출력하시오.
		System.out.println("--- 0 ---");
		int[] letter1={8,12,4,13,2,14,4,5};
		for(int i=0;i<letter1.length;i++) {
			if(letter1[i]%2==0) {
				System.out.println(letter1[i]);
			}
		}
		
		// 1 큰놈
		// int[] letter={8,12,4,13,2,14,4,5}
		// 배열의 가장 큰수가 있는 인덱스를 출력하시오.
		
		int[] letter2={8,12,4,13,2,14,4,5};
		int maxNum = 0;
		int maxIndex = 0;
		for(int i=0;i<letter2.length;i++) {
			if(maxNum<letter2[i]) {
				maxNum = letter2[i];
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
		System.out.println("------");
		
		// 2 현상수배
		// int[] letter={8,12,4,13,25,14,4,5}
		// 범인을찾으시오
		// 범인은 짝수이면서 가장큰 값이다. 
		// 범인은 14입니다. 
		int maxNum2 = 0;
		int[] letter3={8,12,4,13,25,14,4,5};
		for(int i=0;i<letter3.length;i++) {
			if(letter3[i]%2==0) {
				if(maxNum2<letter3[i]) {
					maxNum2 = letter3[i];
				}
			}
		}
		System.out.println(maxNum2);
		
		
		// 3 비밀편지
		// String word ="gehoudfkimjnlvy";
		// int[] letter={8,12,3,13,1,14,3,4};
		// letter  배열은 word문자열 알파벳의 위치이다.
		// letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		System.out.println("--- 3 ---");
		String word ="gehoudfkimjnlvy";
		char[] a = new char[word.length()];
		for(int i=0;i<word.length();i++) {
			a[i] = word.charAt(i);
		}
		System.out.println(Arrays.toString(a));
		int[] letter={8,12,3,13,1,14,3,4};
		int[] letterNum = new int[letter.length];
		for(int i=0;i<letterNum.length;i++) {
			letterNum[i] = letter[i];
		}
		System.out.println(Arrays.toString(letterNum));
		char[] resultStr = new char[letterNum.length];
		for(int i=0;i<letterNum.length;i++) {
			resultStr[i] = a[letterNum[i]];
		}
		System.out.println(Arrays.toString(resultStr));
		System.out.println("---------------");
		
		
		
		
		
		
		
		
		
		
		
		// 4 난건물주
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		// int size=2;
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
	
		
		
		
		
		
		
		
		
		
//		6
//		String a ="23-56+45*2-56";
//		수식을 계산하는 프로그램을 작성하세요.
//		수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
//		지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
//		메서드는 최대한 적게 사용하세요
		System.out.println("--- 6 ---");
		String aa ="23-56+45*2-56";
		String[] aStr = new String[aa.length()];
		for(int i=0;i<aa.length();i++) {
			aStr[i] = aa.charAt(i)+"";
		}
		System.out.println(Arrays.toString(aStr));
		
		char[] aaa = new char[aa.length()];
		for(int i=0;i<aaa.length;i++) {
			aaa[i] = aa.charAt(i); 
		}
		System.out.println(Arrays.toString(aaa));
		char[] b = new char[aaa.length];
		for(int i=0;i<aaa.length;i++) {
			if((int)aaa[i]!=42 && (int)aaa[i]!=43 && (int)aaa[i]!=45 && (int)aaa[i]!=47) {
				System.out.println(aaa[i]);
			}
		}
			
			
		
		

//		-------------------------------------------------------------------------------
//		[7번 , 8번 문제 배열 제시]
//		int[] a = {34,2,35,8,31,45}
//		최대값을 구하는 문제에서
//		철수는 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각하였다. 	
		
		
//		7
//		철수는 배열의 0번 인덱스부터 순회한다.
//		0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
//		이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
//		위와 같은 방식으로 가장큰 수를 구하시오.
		
		
		
		
		
		
		
		
		
	}

}
