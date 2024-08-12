package Day06_0812;

public class Day06_00_forFinall {

	public static void main(String[] args) {
		// Day05 일일과제 풀이예제(쎔)
		// 문제1
		// 1. for( ; ; ){ };
		// 2. for문을 작성한다. + 초기값 100 조건<1000,i++
		// sysout(i); --- 결과확인.
		// for(int i=100;i<1000;i++{
		//	System.out.println(i);
		// }
		
		// 3. i가 홀수인지 판단(%연산자 활용.)
		// if(i%2!=0) {
		//	System.out.println(i);
//		}
		
		// 프젝 변수명 정할때: 동사 + 명사 + 카멜표기법을 사용. ---> 면접시 점수줌.
		
		// 문제2 과정
		// 1. 1부터 100까지 for문 작성.
		//    초기값1  조건:i<=100; i++
		// 2. 홀수판별 : i값이 홀수인지 %2==1
		// 3. 총합: 총합을 저장할 변수선언.
		
		// 문제4 과정
		// 1. for문을 작성한다.
		//	  (초기값:0  ; 조건<7(배열의 길이: arr.length) ; i++)
		// 	  i를 배열의 index로 본다.
		// for(int i=0; i<arr.length; i++){};		
		// 2. arr의 value값을 표시 : arr[i]
		// 	  arr[i]%2==0 (조건)
		// 3. 값을 출력하라 : sysout(arr[i]);
		//	  index를 출력하라: sysout(i);
		//    총합을 출력하라(값을 저장할 변수 선언): sysout(sum);
		//	  카운트 출력하라 : sysout(cnt);
		
		// 문제7 과정
		// 1. for 문 작성.
		// 2. 총합변수 선언: int sum;  sum += arr[i];
		
		
		// 문제10 과정
		// 1. for문 작성 i=0; 조건<arr.length; i++
		// 	  i는 베열의 index로 보겠다.
		// 2. 배열에서 가장큰값. --->(2차)시나리오 직접 실행해본다.
		//					 --->(3차)가장큰값 정보 필요.(선언문 int max=0 )
		// 3. i의 value값과 최대값(max)을 저장한 변수랑 비교(if).
		//	  만약 arr[i]<max 면 최대값 변경(max=arr[i];).
		// 4. for문이 끝난 시점에 max값을 출력하서 확인해본다.
		// 5. int maxIndex = -1;
		// 6. maxIndex = i;(현재 최대값의i (index))
		// 중요도: 1. 과정  2. 구현방법
		
		
		
		// 문제12 과정
		// 응용을 많이 할수 있는 예제입니다.
		// 1. for문 작성 : for(int i=0;i<arr.length;i++){};
		// 	  for문으로 배열 순회 초기값0 조건<arr.length i++
		//    i는 배열의 index
		// 2. 현재번호의 표현식:arr[i] --> 현재번호가 터널인지 아닌지. arr[i]==0
		// 	  현재번호가 터널인지 아닌지 --> 참: 커운팅 :변수선언 int cnt = 0; -->cnt++;
//								   --> 거짓:카운딩cnt -->초기화
		// 3. 제일 긴 터널의 길이를 저장.
		//	  cnt++아레에 판단 --> cnt가 증가될때마다 계속 비교.
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int cnt = 0;
		int maxLength = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {		// A if절:터널타운딩
				cnt++;
			}else {
				cnt=0;
			}
			if(cnt>maxLength) {			// B if절: 최대길이 판별
				maxLength = cnt;	
			}
			System.out.println("현재i값: "+i+"/cnt="+cnt+"*"+maxLength);
		}
		System.out.println(maxLength);
		
		// 문제13 과정
		// 2. 연속된 터널인지 판단. --> 변수선언 : int beforeTunnel = arr[0]; 1번 터널로 시작하겠다.
		// arr[i]==beforeTunnel 판단;
		int[] arr2 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
//				  cnt{1,1,1,1,2,3,1,1,1,1,1,1,2,3,4,1,2,3,4,5,1,2};
		int cnt2 = 0;
		int bT = arr2[0];
		int maxlength = 0;
		int maxIndex = 0;
		for(int i=1;i<arr2.length;i++) {
			if(arr2[i]==bT) {	// 연속으로 같은게 있을때. 현재값이 이전값과 같을때.
				cnt2++;
				System.out.println("cnt2: "+cnt2);
			}else {
				cnt2=1;			// 한개만 있을때.
				bT = arr2[i];
				System.out.println(i+"/"+"cnt2: "+cnt2);
			}
			if(maxlength<cnt2) {
				maxlength=cnt2;
				maxIndex=bT;	// 현재 터널의 번호.
			}
		}
		System.out.println(maxlength);
		System.out.println(maxIndex);
		
		
		// 문제9 과정
		// 결론: 변수는 test이고, 변수는 문자열의 값, 초기문자열은 "abcdeabce"이다.
		// 이변수를 만든 이유?(변수의 의미.)
		// 이 변수를 왜 만들었지?
		
		// 객체를 초등학교 수준으로 설명해보세요.(면접질문)
		
		// 대문자로 시작하는 자료형은 토트연산자를 사용할수 있다.(String)
		// 소문자로 시작하는 자료형은 도트연산자를 사용할 수 없다.(예외: 배열은 도트연산자를 사용할수 있다.)(int,char)
		// 원시타입 : 기본타입,도트연산자 사용불가.
		// 참조타입 : 대문자로,단 배열자체는 참조타입이다.
		// 객체는 참조타입과 밀접한 관계를 가지도 있다.
		// 객체는 사용법이 정해져 있다.
		// 객체는 만들어진 부품이다, 이 부품(객체)에 대한 사용방법(메소드)이 있다.
		// 객체는 사용가능한 기능이 있다.
		// 대상의 대한 정확한 정의가 있어야 객체가 된다.
		
		// 객체는 부품이다, 객체는 우리가 사용할 수 있는 기능이 있다.
		// 부품이 제공하는 가능을 사용해서  문제를 해결한다.
//		.: 쩜은 "참조한다"라는 의미를 같고 있다.
//		test라는 객체를 참조한다.
		// 객체는 참조해서 기능을 사용한다.
		// charAt()의 기능 : 문자를 하나씩 가져온다.
		// charAt()사용예제 : 입력한 값이 문자인지 판단할때도 사용된다.
//		String test = "abcdeabce";
//		int cnt3 = 0;
//		for(int i=0;i<9;i++) {
//			char aaa = test.charAt(i);
//			if(aaa == 'a') {
//				cnt3++;
//			}
//		}
		
		System.out.println("------");
		
		// 문제14
//		 String ttt ="aabbbcccaaaaddbbbaaaaa";
		 // ttt는 참조타입이다.
		 // ttt는 기능을 기지고 있다.
		 // 그중 charAt()메소드를 사용할것이다.
		 
		 // 1. 문자열의 문자를 가져온다.
		 //    배열의 문자를 첫번째부터 하나씩 가져온다.
//		 for(int i=0;i<ttt.length();i++) {	// .length()라는 기능을 가져온다.
//			 char a = ttt.charAt(i);
//			 System.out.println(a);		// ttt의 문자를 하나씩 보여준다.
//		 }
		 
		 // 설계도 건물 = new 설계도(); ---> 컴퓨터가 건물 만드는 과정.
		 // 설계도는 클래스를 만든는것이다.
		 // 클래스는 변수와 메소드로 구성되있다.
		 
		 // 객체가 뭐야?!!!!!!!
		 // ttt참조타입변수
		 // new 연산자
		 // 클래스를 가지고 객체를 만든다.
		 // 객체는 참조변수와 메소드로 구성되있다.
		 // 변수는 이름만 있고, 메소드는 소괄호가 있다.
//		 String ttt = new String("aabbbcccaaaaddbbbaaaaa");
//		 int cnt = 0;							// 같은 값의 개수.
//		 String resultZip = "";					// resultZip
//		 char bT = ttt.charAt(0);				// 시작값을 a로 지정한다.
//		 int maxCnt = 0;					
//		 int maxNumber = 0;
//		 for(int i=0;i<ttt.length();i++) {		// ttt의 길이만큼 반복한다.
//			 if(bT==ttt.charAt(i)) {			// 만약 시작값이 ttt의charAt(i)과 같아면.
//				 cnt++;							// 같은 값의 개수+1;
//			 }else {
//				 resultZip = resultZip + (char)bT + cnt;
//				 bT = ttt.charAt(i);
//				 cnt = 1;
//			 }
////			 if(i==ttt.length()-1) {
////				 resultZip = resultZip + (char)bT + cnt;
////			 }
//			 if(maxCnt < cnt) {			// 15번 문제에서는 불필요.
//				 maxCnt = cnt;
//				 maxNumber = bT;
//			 }
//		 }
//		 resultZip = resultZip + (char)bT + cnt;
//		 System.out.println(resultZip);  // 15번 문제 확인
//		 System.out.println(maxCnt + "/" + (char)bT);  // 14번 문제 확인
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
