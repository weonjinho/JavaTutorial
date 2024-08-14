package Day06_0812_Q;

import java.util.Arrays;
import java.util.Scanner;

public class TeamMission {

	public static void main(String[] args) {
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
		// 방법1:
		String word ="gehoudfkimjnlvy";
		char[] aaa = new char[word.length()];
		for(int i=0;i<word.length();i++) {
			aaa[i] = word.charAt(i);			// word 문자열을 문자형으로 풀어서 배열 aaa에 저장한다.
												// 굳이 배열을 만들 필요는 없었다. 반복문을 선언한 후 word.charAt(letter[i])로 바로 출력하면 된다.
		}
		System.out.println(Arrays.toString(aaa));
		int[] letter={8,12,3,13,1,14,3,4};
		int[] letterNum = new int[letter.length];
		for(int i=0;i<letterNum.length;i++) {
			letterNum[i] = letter[i];			// letter배열의 내용을 letterNum배열에 풀어서 저장한다.
												// 이 과정은 사실상 불필요한 과정인것 같아.
		}
		System.out.println(Arrays.toString(letterNum));
		char[] resultStr = new char[letterNum.length];
		for(int i=0;i<letterNum.length;i++) {
			resultStr[i] = aaa[letterNum[i]];
		}
		System.out.println(resultStr);
		// 사니리오1:
		// 1. 배열 letter의 값은 word문자열의 인덱스번호이다.
		// 2. 배열 letter의 첫 번째 값인 8을 인덱스 번호 삼아 word문자열의 대입하면 'i'가 된다.
		// 3. 저는 반복문을 사용해서 letter배열의 길이 만큼 반복해서, 그 값을 배열resultStr로 받았습니다. 
		
		System.out.println("---------------");
		// 방법2:
		String secrete = "";					// 원하는 인덱스의 문자를 받을 문자열 secrete을 선언한다.
		for(int i=0;i<letter.length;i++) {
			secrete += word.charAt(letter[i]);
		}
		System.out.println(secrete);
		// 시나리오2:
		// 원하는 인덱스의 문자를 받을 문자열 secrete을 선언한다.
		// word.charAt(letter[i])로 원하는 인덱스에 위치한 문자를 가져와 secrete에 저장한다.
		
		
		
		// 4 난건물주
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		// int size=2;
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		
		
		
//		6
//		String a ="23-56+45*2-56";
//		수식을 계산하는 프로그램을 작성하세요.
//		수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
//		지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
//		메서드는 최대한 적게 사용하세요
	      


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
		
		
		
//		8
//		철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
//		0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
//		가장 큰 값이 나오면 가장 큰 값을 갱신한다.
//		위와 같은 방식으로 가장 큰 수를 구하시오.

		
		
		
//		특별1
//		String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
//		문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
//		숫자별로 수집된 수만큼 카운팅하세요.
//		카운팅 배열은
//		int[] a = new int[10]; 
//		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
//		// 인덱스 0 - 9까지를 숫자로 정의한다.
//		조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다. 
		String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		int[] aa = new int[10]; 
		for(int i=0;i<a.length();i++) {
			if((int)a.charAt(i)>47) {
				if((int)a.charAt(i)==57) {						// 9
					aa[9]++;
				}else if(a.charAt(i)=='8') {					// 8
					aa[8]++;
				}else if((int)a.charAt(i)==55) {				// 7
					aa[7]++;
				}else if((int)a.charAt(i)==54) {				// 6
					aa[6]++;
				}else if((int)a.charAt(i)==53) {				// 5
					aa[5]++;
				}else if((int)a.charAt(i)==52) {				// 4
					aa[4]++;
				}else if((int)a.charAt(i)==51) {				// 3
					aa[3]++;
				}else if((int)a.charAt(i)==50) {				// 2
					aa[2]++;
				}else if((int)a.charAt(i)==49) {				// 1
					aa[1]++;
				}else if((int)a.charAt(i)==48) {				// 0
					aa[0]++;
				}
			}
		}
		System.out.println(Arrays.toString(aa));
		
		
		// 
		
		
		
		
		
		
		
//		특별2
//		 String a ="67/414/1/23/32/45/54/12/11/232"
//		문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
//		해충의 갯수를 모두 합하시오.
//		charAt() 메서드만 사용이 가능하다. 
//		형변환이 필요하면 검색하여 사용하시오.
		
		
	}

}
