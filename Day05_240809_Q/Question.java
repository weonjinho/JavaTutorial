package Day05_240809_Q;

import java.util.Arrays;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		System.out.println("---- 1번 문제 ----");
		for(int i=100; i<=999; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println();
//		2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		System.out.println("---- 2번 문제 ----");
		int oddSum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				oddSum += i;
			}
		}
		System.out.println("1부터 100까지 숫자중에서 홀수의 총합은: "+oddSum);
		System.out.println();
		
//		3. 다음과 같이 출력하시오   10  9  8  7  6  5  4  3  2  1
		System.out.println("---- 3번 문제 ----");
		for(int i=100;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();

//		4. 배열에서 배열의 값이 짝수인 것만 출력하시오.
//		  int[] arr = {45,23,25,64,3,24,48}
		System.out.println("---- 4번 문제 ----");
		int[] arr = {45,23,25,64,3,24,48};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		
//		6.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
//		  int[] arr = {45,23,25,64,3,24,48}
		System.out.println("---- 6번 문제 ----");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.println("값이 홀수 인 곳의 인덱스: "+i+" ");
			}
		}
		System.out.println();
		System.out.println();
		
//		7. int[] arr = {45,23,25,64,3,24,48}
//		   배열의 값을 모두 더한 총합을 구하시오.
		System.out.println("---- 7번 문제 ----");
		int arrSum = 0;
		for(int i=0;i<arr.length;i++) {
			arrSum += arr[i];
		}
		System.out.println("배열의 값을 모두 더한 총합: "+arrSum);
		System.out.println();
		
		
//		8. int[] arr = {45,23,25,64,3,24,48}
//		   짝수는 모두 몇개인가요?
		System.out.println("---- 8번 문제 ----");
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				cnt++;
			}
		}
		System.out.println("짝수는 "+cnt+" 개 있습니다.");
		System.out.println();
		
//		-----------------------------------------------------------------------------------------------------------------
//		이 문제는 응용문제입니다. 할 수 있습니다. 풀어 봅시다~~
//		변수, 연산자, 조건문, 반복문을 생각하면 해결 할 수 있습니다. 
//		9.  String test = "abcdeabce";
//		    for(int i=0; i < 9; i ++){
//			char aaa = test.charAt(i);
//			sysout(aaa);
//		    }
//
//		   위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		System.out.println("---- 9번 문제 ----");
		int cntText = 0;
		String test = "abcdeabce";
	    for(int i=0; i < 9; i ++){
	    	char aaa = test.charAt(i);
	    	if(aaa=='a') {
	    		cntText++;
	    	}
	    }
	    System.out.println("a문자열은 "+cntText+"개 있습니다.");
		System.out.println();
		
//		-----------------------------------------------------------------------------------------------------------------
//		여기부터는 어렵습니다.
		
//		10.  int[] arr = {45,23,25,64,3,24,48} 
//		   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		System.out.println("---- 10번 문제 ----");
		int maxValue = 0;
		int maxNumIndex = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
				maxNumIndex = i;
			}
		}
		System.out.println("배열에서 가장 큰 값은: "+maxValue+" 입니다.");
		System.out.println("이의 인덱스는:"+maxNumIndex+" 입니다.");
		System.out.println();
		
		
//		11. 범인 숫자 구하기.. 
//		  범인은 100부터 999까지 숫자중에 여러명이다. 
//		  범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
		System.out.println("---- 11번 문제 ----");
		int[] numContainer = new int[900];
		for(int i=0;i<=899;i++) {
			numContainer[i]=(i+100);
		}
		for(int i=0;i<899;i++) {
			if(((numContainer[i]/100)%10+(numContainer[i]/10)%10+(numContainer[i])%10)%2==0) {
				System.out.print(numContainer[i]+" ");
			}
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
//		12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
//		   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		
		System.out.println("---- 12번 문제 ----");
		
//		풀이과정:
//		각 요소중 중복 횟수가 제일 많은 요소.
		int[] tunnelArr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int[] tunnel = new int[6];	// 터널의 종류 0~5
		for(int i=0;i<=(tunnel.length-1);i++) {
			tunnel[i]=i;
		}
//		터널 번호 : 0 1 2 3 4 5 생성.
//		tunnel[0] -- 0번 터널
//		tunnel[1] -- 1번 터널
//		tunnel[2] -- 2번 터널
//		tunnel[3] -- 3번 터널
//		tunnel[4] -- 4번 터널
//		tunnel[5] -- 5번 터널
//		터널별 일치하는 값의 개수를 count 하는 변수 필요.
//		System.out.println("tunnel: "+Arrays.toString(tunnel));
		
		int[] cntTunnel = new int[6];
		for(int i=0;i<=(cntTunnel.length-1);i++) {
			cntTunnel[i]=0;	// 터널별 게수 초기값을 0으로 설정.
		}
		for(int i=0;i<tunnelArr.length;i++) {
			if(tunnelArr[i]==tunnel[0]) {
				cntTunnel[0]++;
			}else if(tunnelArr[i]==tunnel[1]) {
				cntTunnel[1]++;
			}else if(tunnelArr[i]==tunnel[2]) {
				cntTunnel[2]++;
			}else if(tunnelArr[i]==tunnel[3]) {
				cntTunnel[3]++;
			}else if(tunnelArr[i]==tunnel[4]) {
				cntTunnel[4]++;
			}else if(tunnelArr[i]==tunnel[5]) {
				cntTunnel[5]++;
			}
		}
		
		int maxLengthTunnel = 0;
		for(int i=0;i<cntTunnel.length;i++) {
			if(maxLengthTunnel<cntTunnel[i]) {
				maxLengthTunnel=cntTunnel[i];
			}
		}
		System.out.println("가장 긴 터널의 길이는: "+maxLengthTunnel+" 입니다.");
		System.out.println();
		
//		13. int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,0,0,0,0,0,3,3}
//		   숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		
		System.out.println("---- 13번 문제 ----");
		int[] tunnelArr2 = {1,2,3,0,0,0,1,2,2,4,2,2,2,0,0,0,0,0,3,3};
		int[] tunnel2 = new int[5];
		for(int i=0;i<=(tunnel2.length-1);i++) {
			tunnel2[i]=i;
		}
		
		int[] cntTunnel2 = new int[5];
		for(int i=0;i<=(cntTunnel2.length-1);i++) {
			cntTunnel2[i]=0;	// 터널별 게수 초기값을 0으로 설정.
		}
		for(int i=0;i<tunnelArr2.length;i++) {
			if(tunnelArr2[i]==tunnel2[0]) {
				cntTunnel2[0]++;
			}else if(tunnelArr2[i]==tunnel2[1]) {
				cntTunnel2[1]++;
			}else if(tunnelArr2[i]==tunnel2[2]) {
				cntTunnel2[2]++;
			}else if(tunnelArr2[i]==tunnel2[3]) {
				cntTunnel2[3]++;
			}else if(tunnelArr2[i]==tunnel2[4]) {
				cntTunnel2[4]++;
			}
		}
		
		int maxLengthTunnel2 = 0;
		int maxLengthTunnelNum = 0;
		for(int i=0;i<cntTunnel2.length;i++) {
			if(maxLengthTunnel2<cntTunnel2[i]) {
				maxLengthTunnel2=cntTunnel2[i];
				maxLengthTunnelNum = i;
			}
		}
		System.out.println("가장 긴 터널의 길이는: "+maxLengthTunnel2+" 입니다.");
		System.out.println("가장 긴 터널은:"+maxLengthTunnelNum+" 번 터널입니다.");
		System.out.println();
	
		
//		14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
//		 String ttt ="aabbbcccaaaaddbbbaaaaa";
		System.out.println("---- 14번 문제 ----");
		char tunnelA = 'a';
		char tunnelB = 'b';
		char tunnelC = 'c';
		char tunnelD = 'd';
		int[] cntT = new int[4]; 
		for(int i=0;i<cntT.length;i++) {
			cntT[i]=0;
		}
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		char[] tunnelText = new char[ttt.length()];		// ttt의 길이만큼에 공간이 있는 배열 공간 생성.
		int maxLengthTunnelIndex = 0;
		for(int i=0;i<ttt.length();i++) {
			tunnelText[i]=ttt.charAt(i);
			if(tunnelText[i]==tunnelA) {
				cntT[0]++;
			}else if(tunnelText[i]==tunnelB) {
				cntT[1]++;
			}else if(tunnelText[i]==tunnelC) {
				cntT[2]++;
			}else if(tunnelText[i]==tunnelD) {
				cntT[3]++;
			}
		}
		int maxVal = 0;
		char maxText = '0';
		for(int i=0;i<cntT.length;i++) {
			if(maxVal<cntT[i]) {
				maxVal=cntT[i];
				maxText = tunnelText[i];
			}
		}
		System.out.println(maxVal);
		System.out.println(maxText);
		System.out.println();
		
		
//		15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
//		   압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
        System.out.println("---- 15번 문제 ----");
        String ttt2 ="aabbbcccaaaaddbbbaaaaa";
        char[] textList = new char[22];               // ttt2의 요소를 배열 형식으로 저장하기 위해 만든 배열이다.
        for(int i=0;i<ttt2.length();i++) {
           textList[i]=ttt2.charAt(i);
        }
        char temp = 'a';                           // 문자 비교용 변수, ttt2의 시작 문자인 'a'를 비교 문자로 지정함.
        int[] selectIndex = new int[22];               // 이 배열은 비교후 다른 문자의 index번호를 저장하는 용도로 사용된다.
        int[] diffIndex = new int[8];                  // 이 배열은 index번호가 0이 아닌 요소의 index번호를 저장하는 용도이다.
        for(int i=0;i<ttt2.length();i++) {            // textList의 문자열과 temp의 문자를 하나씩 비교하는 과정.
           if(temp!=textList[i]) {
              selectIndex[i]=i;
              temp = textList[i];                  // 다른 문자로 기존 temp변수의 값을 교체한다.
           }
        }
        
        int a=1;                                 // 이 변수는 단순히 diffIndex배열을 0으로 시작하기 위해 선언한것이다.
        diffIndex[diffIndex.length-1]=selectIndex.length;
        for(int i=0;i<selectIndex.length;i++) {
           if(selectIndex[i]!=0 && selectIndex[0]==0) {
              diffIndex[a]=i;                     // diffIndex[0]=첫 번째 다른 문자의 index번호.
              a++;                              // a가 1씩 증가합으로 diffIndex배열의 index번호도 0부터 1씩 증가한다.
           }
        }
        int[] minusIndex = new int[diffIndex.length];
        for(int i=1;i<minusIndex.length;i++) {
           minusIndex[i-1] = diffIndex[i]-diffIndex[i-1];
        }
        
        // 값 확인 부분
        System.out.println("selectIndex[]: " + Arrays.toString(selectIndex));      // [0, 0, 2, 0, 0, 5, 0, 0, 8, 0, 0, 0, 12, 0, 14, 0, 0, 17, 0, 0, 0, 0]
        System.out.println("diffIndex[]:   " + Arrays.toString(diffIndex));      // [ 0, 2, 5, 8, 12, 14, 17, 22 ]
        System.out.println("minusIndex[]:  " + Arrays.toString(minusIndex));     // [2, 3, 3, 4, 2, 3, 5, 0]
        
//        [ 0, 2, 5, 8, 12, 14, 17, 22 ]
//        22 : selectIndex.length
//        0 : selectIndex[0]
//        diffIndex[] ===> [ selectIndex[0], 2, 5, 8, 12, 14, 17, selectIndex.length ]

		
		
		
		
		
		
		
		
		
		
	}

}
