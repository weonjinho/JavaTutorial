package Day02_Q;

import java.util.Arrays;

public class Question {

	public static void main(String[] args) {
//		기본
//		문제1
//		30, 40, 50, 60, 55을 배열에 저장하고 모든 배열의 값을 출력하시오.
		System.out.println("--- 문제1 ---");
		int[] numbers = {30,40,50,60,55};
		System.out.println(Arrays.toString(numbers));
//		[해석]
/*		현제 문제에 제시된 조건대로라면, 자료형이 정수(int)인, 길이가 5인 배열을 생성해야한다.
 * 		따라서 저는 정수값을 저장할 수 있는 배열을 생성했으며, 이에 변수명은 numbers이다.
 * 		이후, 정수값으로 구성된 값 목록 {30,40,50,60,55}을 대입연사자를 이용해서 numbers변수에 대입하였다.
 * 		그후, 저는 Arrays객체의 toString()메소드를 사용해여, numbers변수에 저장되있는 값을 배열의 형태로 출력하였습니다.
 * 
 * */		
		
		
		
//		문제2
//		kim lee park 3개의 값을 배열에 저장하고 출력하시오.
		System.out.println("--- 문제2 ---");
		String[] names = {"kim","lee","park"};
		System.out.println(Arrays.toString(names));
/*		[해석]
 * 		문맥상 3개의 문자열을 저장하는 배열을 만들어야한다. 
 * 		따라서 저는 문자열을 저장할 수 있는 배열을 생성했으며, 배열의 변수명은 names로 정했습니다.
 * 		이후, 문자열값으로 구성괸 값 목록{"kim","lee","park"}을 생성해서, 이를 names변수에 대입하였다.
 * 		그후, 저는 Arrays객체의 toString()메소드를 사용하여, names변수에 저장되있는 값을 배열의 형태로 출력하였습니다.
 * */		
		
		
//		문제3
//		int[] lotto = {6,12,33,4,5,26} 3번째 값에 +2를 더하시오.
		System.out.println("--- 문제3 ---");
		int[] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2]+2);
/*		[해석]
 * 		이 문제는 자료형이 정수(int)인 값 으로 구성된 목록을 변수 lotto에 대입하고 있고, 값의 개수는 6개입니다.
 * 		이중 "3번째"값은 index번호가 2라는 값과 동일합니다. 따라서 index번호가 2인 값에 2를 더하면 적합한 답안을 얻을수 있습니다.
 * 		lotto배열에서 index 번호가 2인 값을 표현할때는 lotto[2]로 표현하면 됩니다. 여기에 2를 추가하면 원하는 답안인 33+2=35를 
 * 		얻을수 있습니다.
 * 		[실수포인트]
 * 		제가 이 문제를 풀때 더해야 하는 값을 잘 못 봤었습니다. 문제를 더 꼼꼼하게 읽어야할것 같아.
 * */		
		
		

//		문제4
//		int[] lotto = {6,12,33,4,5,26}  홀 수 번째로 뽑은 번호의 총합을 구하시오, 단 저장된 로또 번호의 값은 유지.
		System.out.println("--- 문제4 ----");
		int sum = 0;
//		for(int i = 0;i<lotto.length;i++) {
//			if((i+1)%2==1) {
//				sum +=lotto[i];
//			}
//		}
//		System.out.println(sum);
//		System.out.println("-----");//44
		
//		6, 33, 5
		int indexNum = 0;
		sum += lotto[indexNum];
		System.out.println(sum);
		System.out.println(Arrays.toString(lotto));
//		[해석]
		
//		[노트]
/*		이 문제는 내가 못 풀어냈다! 사실 반복문을 사용해서 해결은 했지만, 반복문과 조건문을 사용하지 않는 조건하에, 이 문제속 
 * 		총합을 구한다는 것은 내에게도 너무 어려웠다.
 * */		
		
		
		
//		중
//		문제5
//		int[] lotto = {6,12,33,4,5,26} 다음 규칙에 의해서 저장된 값을 수정하세요. 첫번째 번호는 그대로 저장된다.
//		n 번째 저장될 값은 첫번째번호 + 두번째번호 ... + n 번째번호의 합이 저장된다.
		System.out.println("--- 문제5 ----");
		lotto[1]+=lotto[0];		// lotto[1] = lotto[1] + lotto[0];  lotto[1] = 12+6;
		lotto[2]+=lotto[1];		// lotto[2] = lotto[2] + lotto[1];	lotto[2] = 33+(12+6);
		lotto[3]+=lotto[2];		// lotto[3] = lotto[3] + lotto[2]; 	lotto[3] = 4+(33+(12+6));
		lotto[4]+=lotto[3];		// lotto[4] = lotto[4] + lotto[3]; 	lotto[4] = 5+(4+(33+(12+6)));
		lotto[5]+=lotto[4];		// lotto[5] = lotto[5] + lotto[4]; 	lotto[5] = 26+(5+(4+(33+(12+6))));
		System.out.println(Arrays.toString(lotto));
		System.out.println(lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4]+lotto[5]);
//		[해석]
/*		첫째 이 문제에서 반복문, 조건문을 사용할 수 없다.
 * 		둘째 이 문제속 정수배열 lotto 중 첫번째 값은 변화가 없다.
 * 		셋째 
 * */		
		
		
		
//		[노트]
//		이 문제를 풀기전 꼭 lotto 배열속 값을 한번 출력해 보는 것이 실수 방지에 좋다.
//		( lotto배열 속 변경된 값이 있는지 확인하라는 말이다.)
/*			
 * 		"첫 번째 번호는 그대로"라는 조건일 주의!!! 이는 lotto[0]에 값을 대입하지 않아도 된다는 말과 같다.
 *
 * 		이 문제도 반복문 사용안하고 풀지는 못했다. 위 방법은 옆 동료가풀어냈 방법이다. lotto[0]을 건너뛰고 생각했다는게 정말 대단한것 같아.
 * 
 * 	
 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		문제6
//		int[] lotto = {6,12,33,4,5,26} 4번째 로또번호가 홀수이면 true, 짝수이면 false를 출력하시오.
		System.out.println("--- 문제6 ----");
		System.out.println(lotto[3]%2==1);
/*		[해석]
 * 		이 문제는 정수값 목록을 lotto라는 번수에 대입했으며, lotto의 자료형은 정수입니다.
 * 		여기서 4번째 정수값이 홀수인지를 판단하기 위해, 일단 4번째 숫자인 "4"를 추출해야한다.
 * 		이를 추출하는 방법은 lotto[3]을 사용하는것이다.
 * 		이후 추출된값 즉 "4"의 홀짝을 판단하기 위해, 2를 나누어 나머지값이 1인지 판단하면 된다.
 * 		만역 나머지값이 1이면 lotto[3]은 홀수이고, 1이 아니면 짝수이다.
 * 
 * 		[주의]
 * 		이 문제는 삼항연산자 사용할 필요가 없다! 비교 연산자는 boolean값을 리턴하기떼문이다.
 * */		
		
		
		
		
//		문제7
/*		거스름돈을 구해보자 int money = 2750; int pay = 10000; 
 * 		출력 : 천원 ?개, 백원 ?개, 십원 ?개
 * */		
		System.out.println("--- 문제7 ----");
		int money = 2750;
		int pay = 10000;
		int change = pay-money;
		int[] restArr = new int[3];
//		restArr[0] = change/1000;
//		restArr[1] = ((change/10)-(restArr[0]*100))/10;
//		restArr[2] = (change-(restArr[0]*1000)-(restArr[1]*100))/10;
//		System.out.println("restArr[0]:"+restArr[0]+"개 "+"restArr[1]:"+restArr[1]+"개 "+"restArr[2]:"+restArr[2]+"개");
		
		// 방법2
		restArr[0] = change/1000;
		restArr[1] = (change%1000)/100;
		restArr[2] = ((change%1000)%100)/10;
		System.out.println(restArr[2]);
		System.out.println("restArr[0]:"+restArr[0]+"개 "+"restArr[1]:"+restArr[1]+"개 "+"restArr[2]:"+restArr[2]+"개");
/*		[해석]
 * 		먼저 요구사항에 맞게 개수즉 정수값 3개를 받을 수 있는 배열을 생성한다.
 * 		둘째 pay과 money의 차액을 구한다.
 * 		셋째 차액중 천원에 개수를 알고 싶다면 차액을 1000이랑 나누기 연산을 한 다음 그 값을 restArr배열의 첫번째 값으로 대입했다.
 * 		넷째 차액중 백원에 개수를 알고 싶다면 차액을 1000이랑 나머지 연산을 진행한 후 그 값을 또 100과 나누기 연산을 진행하고 그 값을 restArr배열의 두번째 값으로 대입했다.
 * 		다섯째 차액중 십원에 개수를 알고 싶다면 차액을 1000이랑 나머지 연산을 진행한 후 그 값을 또 100과 나머지 연산을 진행한 다음,
 * 		또 그 값을 10과 나누기 연산을 진행하고 그 값을 restArr배열의 세번째 값으로 대입했다.
 * */		
		
		
		
		
//		상
//		문제8	
/*		볼이 벙커에 빠졌는가? 빠졌으면 true, 안빠졌으면 false
 * 		볼이 벙커에 완전히 들어와야 빠진것으로 간주합니다.
 * 		int xA = 700;
 * 		int yA = 500;
 * 		int xB = 900;
 * 		int yB = 300;
 * 		
 * 		int xC = 650;
 * 		int yC = 150;
 * */
		System.out.println("--- 문제8 ----");
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		int xC = 650;
		int yC = 150;
		int movex = 0;
		int movey = 0;
		boolean location = ((xC+movex)>=700 && (xC+movex)<=897 && (yC+movey)>=303 && (yC+movey)<=500);
		System.out.println(location);
/*		[해석]
 * 		이 문제를 풀때는 "볼이 벙커에 완전히 들어와야 빠진것으로 간주합니다." 라는 조건을 주의해야한다. 이는 공의 한쪽면 만 벙커 테두리와 겹치면
 * 		안빠진 것임을 의미한다. 이는 x축,y축 모두 적용된다.
 * 		공의 가로,세로 길이가 3센치 이고 공의 최소 3면은 벙커안에 있어야한다는 조건하 공의 x축 활동 범위는 700~(900-3)사이다.
 * 		같은 원리로 공의 y축의 활동 범위는(300+3)~500사이다.
 * 		또한 공의 이동은 (movex+xC),(movey+yC)를 의미하기 때문에 최종적으로  (movex+xC)의 범위는 700~897, (movey+yC)의 범위는 303~500
 * 		이라는 결론을 내릴수 있다.
 * 		마지막으로 논리 연산자를 자료형으로 한 location변수를 선언함으로써 공의 좌표값이 벙커 범위 안에 있는지에대한 결과를 true/false로 리턴한다. 
 * */
/*		[주의]
 * 		이 문제에서 공의 위치는 변할수 있다, ( 650,150 )은 초기 위치값일 뿐이다. 변화의 범위를 부여할 수 있도록 별또의 변수를 선언해야한다.
 * 		그리고 공에 있는 좌표가 공에 어느쪽에 위치해 있는지를 정확히 확인해야한다, 이는 공이 벙커에 빠짐여부를 판단할때 매우 중요한 기준이 된다.
 * */		
		
		
		
		
	}	

}
