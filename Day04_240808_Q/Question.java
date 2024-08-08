package Day04_240808_Q;

import java.util.Arrays;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		up --------------------------------------
//		1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		int plusNum = 0;
		int minusNum = 0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				minusNum -= i;
			}else if(i%2==1) {
				plusNum += i;
			}
		}
		System.out.println(plusNum+minusNum);
		System.out.println("----------------------------1");
		
		
		
		
//		2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		int oddPlus = 0;
		int evenPlus = 0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				evenPlus += i;
			}else if(i%2==1) {
				oddPlus += i;
			}
		}
		System.out.println("홀수끼리 더한 값: "+oddPlus);
		System.out.println("짝수끼리 더한 값: "+evenPlus);
		System.out.println("----------------------------2");
		
		
		
		
		
//		3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		int cnt1 = 0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				cnt1++;
			}
		}
		System.out.println("1부터 100까지 숫자 중 홀수의 개수: "+cnt1);
		System.out.println("----------------------------3");
		
		
		
		
		
//		4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
//	       453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.

		int[] breakNumArr = new int[3];
		int[] totalNumArr = new int[900];
		for(int i=0;i<=899;i++) {
			totalNumArr[i]=i+100;
		}
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int numSum = 0;
		for(int i=0;i<=899;i++) {
			number1=(totalNumArr[i]/100);	
			number2=(totalNumArr[i]/10)%10;
			number3=totalNumArr[i]%10;
			numSum = number1+number2+number3;
			numSum += numSum;
		}
		System.out.println(numSum);
		System.out.println("----------------------------4");
//		방법2
		int sum5 = 0;
		for(int i=100;i<=999;i++) {
			sum5 +=((i/100)+((i%100)/10)+(i%10));
		}
		System.out.println(sum5);
		
		System.out.println("----------------------------4_2");
		
//		5. 범인은 100부터 999까지 숫자에 숨어 있다.
//		   범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		for(int i=0;i<=899;i++) {
			number2=(totalNumArr[i]/10)%10;
			if(number2%3==0 && number2!=0) {
				System.out.println(totalNumArr[i]+" ");
			}
		}
		System.out.println("----------------------------5");
		String criminal = "";		// 범인의 숫자를 모두 출력하기 위하여 누적할 문자열을 생성
		for(int i=100;i<=999;i++) {
			if(((i%100)/10)%3==0&&((i%100)/10)!=0){	
				// i의 십의자리 숫자가 3으로 나눈 나머지가 0이면서 십의자리의 숫자가 0이 아닐때
				// 십의자리 숫자가 0이여도 3으로 나눈 나머지가 0이 나오기때문에 3의 배수만 도출하기위해 제외시켜주는 과정이 필요함
				// 즉 십의자리가 3의 배수일때의 i 숫자를 모두 출력하기위해 숫자를 문자열로 누적하여 저장
				criminal+=(i+" ");
			}
		}
		System.out.println("범인의 숫자: "+criminal);
		
		
		
		
		
//		6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
//		   누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
//		   범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		int sum2 = 0;
		for(int i=0;i<=100;i++) {
			sum2 += i;
			if(sum2>44 && sum2<=45) {
				System.out.println(i);
			}
		}
		System.out.println("----------------------------6");
		
		
		
		
		
		
//		7. System.out.println("abc");  
//		   System.out.println("def"); 
//		   // 위코드를 실행하면
//		   abc
//		   def
//
//		   System.out.print("abc");    // ln이 빠지면 i변수 값을 출력 후 줄바꿈을 하지 않는 코드이다. 
//		   System.out.print("def"); 
//		   // 위코드를 실행하면
//		    abcdef
//
//		   문제>> 다음과 같이 출력하게 하시오.
//		   1+2+3+4+5+6+7+8+9+10=결과값
		   int sum3 = 0;
		   int[] arr3 = new int[10];
		   for(int i=0;i<10;i++) {
			   arr3[i] = i+1;
		   }
		   int number01 = arr3[0];
		   int number02 = arr3[1];
		   int number03 = arr3[2];
		   int number04 = arr3[3];
		   int number05 = arr3[4];
		   int number06 = arr3[5];
		   int number07 = arr3[6];
		   int number08 = arr3[7];
		   int number09 = arr3[8];
		   int number10 = arr3[9];
		   int sumAllNum = number01 + number02 + number03 + number04+ number05+ number06+ number07+ number08+ number09+number10;
		   String result = number01 + "+" + number02 + "+" + number03 + "+" + number04+ "+" + number05+ "+" + number06+ "+" + number07+ "+" + number08+ "+" + number09+ "+" + number10;
		   System.out.println(result+ "=" + sumAllNum);
		   System.out.println("----------------------------7");
		   
		   
		   
		   
		   
		   
//		   8. 피보나치 수열 1
//		   i는 피보나치 수의 갯수이다.   총 8개의 피보나치 수를 구하고 합한 값을
//		   출력하시오. 
//		   i는 1 2 3 4 5 6 7 까지 증가, i가 4일 때 피보나치 수는 3이 된다.
//
//		    int fib=1;  // 파보나치 수   1 1 2 3 5 8 13
//		    for(int i=1;i < 8; i++){  // 피보나치 수의 개수 i  
//		    
//		    }
//		   결과 : 1 + 1 + 2 +3 + 5 + 8 + 13 = 합한 값
		   int[] numP = new int[8];
		   numP[0] = 0;
		   numP[1] = 1;
		   numP[2] = 1;
		   numP[3] = numP[1] + numP[2];
		   numP[4] = numP[2] + numP[3];
		   numP[5] = numP[3] + numP[4];
		   numP[6] = numP[4] + numP[5];
		   numP[7] = numP[5] + numP[6];
		   
		   System.out.println("numP[4]: "+numP[4]); // 3
		   int sumP = 0;
		   for(int i=1;i<8;i++) {
			   sumP += numP[i];
		   }
		   System.out.println(sumP);// 33
		   System.out.println("----------------------------8");
		   
		   
		   
		   
		   
		   
		   
//		   9. 피보나치 수열 2
//		   i를 피보나치 수로 정의한다.
//		   i의 변화는 1 1 2 3 5 8 13 이 된다.
//		   for(int i=1;i < 20; ){  
//		    
//		    }
		   System.out.println(Arrays.toString(numP));
		   System.out.println("----------------------------9");
		   
		   
		   
		   
		   
		   
//		   10. 987654321이라는 숫자가 있다.. 변수2개와 for문 한개로
//		   모든 자릿수를 더한 합을 구하시오.. 9+8+7+6+5+4+3+2+1 = 합
//		   합만 출력하면 됩니다.
//		   main메서드 안의 라인수를 최소화 하여서 작성하세요. 최소 라인수로 작성하라는 의미입니다.
		   int a = 987654321;
		   int numSum3 = 0;
		   System.out.print(a/100000000);
		   for(int v = 10000000; v>=1; v/=10) {
			   numSum3 += ((a/v)%10);
			   System.out.print("+");
			   System.out.print((a/v)%10);
		   }
		   System.out.println("=" + ((a/100000000) + numSum3));
	
//		   긴 숫자가 주어졌을때 원하는 숫자를 추출하는 방법(예제)
//		   step1: 숫자의 길이를 본다, 이 숫자의 첫 번째 숫자를 얻고 싶다면, 숫자/(10*(length-1))를 하면 된다.
//		   step2: 두번째 숫자 추출: 숫자/(10*(length-2)).
//		   step3: 세번째 숫자 추출: 숫자/(10*(length-3)).
//		   step4: 네번째 숫자 추출: 숫자/(10*(length-4)).
//		   step5: 다섯번째 숫자 추출: 숫자/(10*(length-5)).
//		   step6: 여섯번째 숫자 추출: 숫자/(10*(length-6)).
//		   step7: 일곱번째 숫자 추출: 숫자/(10*(length-7)).
//		   step8: 여덜번째 숫자 추출: 숫자/(10*(length-8)).
//		   step9: 아홉번째 숫자 추출: 숫자/(10*(length-9)).
		   int aaa = a/100000000;		// (a/10의8승)		// 9
		   int bbb = (a/10000000)%10;	// (a/10의7승)%10	// 8
		   int ccc = (a/1000000)%10;	// (a/10의6승)%10 	// 7
		   int ddd = (a/100000)%10;		// (a/10의5승)%10	// 6
		   int eee = (a/10000)%10;		// (a/10의4승)%10	// 5
		   int fff = (a/1000)%10;		// (a/10의3승)%10	// 4
		   int ggg = (a/100)%10;		// (a/10의2승)%10	// 3
		   int hhh = (a/10)%10;			// (a/10의1승)%10	// 2
		   int iii = (a/1)%10;			// (a/10의0승)%10	// 1
		   System.out.println(aaa);
		   System.out.println(bbb);
		   System.out.println(ccc);
		   System.out.println(ddd);
		   System.out.println(eee);
		   System.out.println(fff);
		   System.out.println(ggg);
		   System.out.println(hhh);
		   System.out.println(iii);
		   
//		  그 값들을 배열로 받아봤다.
//		  Tip : 중첩 for문 사용시 반복 횟수가 가장 작은 반복문을 가장 안쪽에 둔다.
//		  이유 : 반복문은 조건식이 false 일때 반복문을 빠져나가기 때문이다. 
	      int aa = 987654321;
	      int b = 0;
	      int[] numContainer = new int[9];
	      for(int v=10000000; v>=1; v/=10) {   // 10단위로 나눈다.
	         for(int i=0; i<9; i++) {
	             b=(aa/v)%10;
	             numContainer[i]=b;
	         }
	      }
	      System.out.println("---");
	      System.out.println(Arrays.toString(numContainer));
		   
		   
		   
		   
		   
		   
		   
	}

}
