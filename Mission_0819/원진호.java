//package Mission_0819;
//
//import java.util.Arrays;
//
//public class Weonjinho_240829_Mission2 {
//
//	public static void main(String[] args) {
////		<1-6> 필수 코스 -------------------------------------
////		1. 
////		1*1=1  1*2=2   1*3=3
////		2*1=2  2*2=4   2*3=6
////		3*1=3  3*2=6   3*3=9
////		4*1=4  4*2=8   4*3=12
//		System.out.println("===== 1번 문제 =====");
//		for(int i=0;i<4;i++) {
//			for(int j=1;j<4;j++) {
//				System.out.print((i+1)+"*"+j+"="+((i+1)*j)+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		
//		
//		
////		2. 
////		*****
////		****
////		***
////		**
////		*
//		System.out.println("===== 2번 문제 =====");
//		for(int i=0;i<5;i++) {
//			for(int j=5;j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		
//		
//		
////		3.
////		000*
////		00***
////		0*****
////		*******
//		System.out.println("===== 3번 문제 =====");
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<i+3;j++) {
//				if(i==0) {
//					if(j==0 || j==1 || j==2) {
//						System.out.print("0");
//					}else {
//						System.out.print("*");
//					}
//				}
//				if(i==1) {
//					if(j==0 || j==1) {
//						System.out.print("0");
//					}else {
//						System.out.print("*");
//					}
//				}
//				if(i==2) {
//					if(j==0) {
//						System.out.print("0");
//					}else {
//						System.out.print("*");
//					}
//				}
//				if(i>2) {
//					System.out.print("*");
//				}
//			}
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		
//		
//		
//		
////		4. 
////		*******
////		0*****
////		00***
////		000*
//		System.out.println("===== 4번 문제 =====");
//		for(int i=0;i<4;i++) {
//			for(int j=7;j>i;j--) {
//				if(i==0) {
//					System.out.print("*");
//				}
//				if(i==1) {
//					if(j==7) {
//						System.out.print("0");
//					}else {
//						System.out.print("*");
//					}
//				}
//				if(i==2) {
//					if(j==7 || j==6) {
//						System.out.print("0");
//					}else {
//						System.out.print("*");
//					}
//				}
//				if(i==3) {
//					if(j==7 || j==6 || j==5) {
//						System.out.print("0");
//					}else {
//						System.out.print("*");
//					}
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		
//		
//		
//		
////		5. int[] a ={34,55,23,56,34,45,34};
////		40보다 큰 수는 모두 몇개인가?
//		System.out.println("===== 5번 문제 =====");
//		int[] a ={34,55,23,56,34,45,34};
//		int cnt = 0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>40) {
//				cnt++;
//			}
//		}
//		System.out.println("40보다 큰 수는"+cnt+"개 있습니다.");
//		System.out.println();
//		
//		
//		
//		
//		
//		
////		6
////		int[] a ={34,55,23,56,34,45,34};
////		int[] b ={36,49};
////		b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
////		각각 카운팅 하시오 
////		출력은
////		 a 배열의 값에는  36번호 보다 큰 숫자가 ?? 개 있습니다.
////		 a 배열의 값에는  49번호 보다 큰 숫자가 ?? 개 있습니다.
//		System.out.println("===== 6번 문제 =====");
//		int[] aa ={34,55,23,56,34,45,34};
//		int[] b ={36,49};
//		int cntBig = 0;
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<aa.length;j++) {
//				if(b[i]<aa[j]) {
//					cntBig++;
//				}
//			}
//			System.out.println(b[i]+" 보다 큰 숫자가 "+cntBig+" 개 있습니다.");
//			cntBig=0;
//		}
//		System.out.println();
//
//		
//		
//		
//		
//		
////		upgrade -------------------------------
////		7. 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
////		   단, 거스름돈은 만천원이 최대 값이다. 
////		int money=4570;  // 가격
////		int pay = 10000;  //지불금액
//		System.out.println("===== 7번 문제 =====");
//		int money=4570;
//		int pay = 10000;
//		int change = pay-money;		// 5430
//		int thousand=0;
//		int hundred=0;
//		int ten=0;
//		int times = 3;
//		double number = Math.pow(10, times);	// 제곱 메소드, 리턴타입:double.
//		int intNum = (int)number;
//		for(int i=0;i<4;i++) {
//			for(int j=3;j>0;j--) {
//				number = Math.pow(10, j);
//				intNum = (int)number;
//				int changeNum = (change/intNum)%10;
//				if(j==3) {
//					thousand = changeNum;
//				}else if(j==2) {
//					hundred = changeNum;
//				}else if(j==1) {
//					ten = changeNum;
//				}
//			}
//		}
//		System.out.println("거스름돈: "+change);
//		System.out.println("천원"+thousand+"개"+" 백원"+hundred+"개"+" 십원"+ten+"개");
//		System.out.println();
//		
//		
//		
//		
//		
////		8.
////		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
////		애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
////		가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
////		제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
//		System.out.println("===== 8번 문제 ? =====");
//		
//		
//		
//		
//		
//		
//		
////		9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
////		 String ttt ="aabbbcccaaaaddbbbaaaaa";
//		String ttt ="aabbbcccaaaaddbbbaaaaa";
//		System.out.println("===== 9번 문제 ? =====");
//		
//		
//
//		
//		
//	
////		10 난건물주  <이중For사용>
////		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
////		int size=2;
////		arr 배열에서 0이 의미하는 것은 공터이다. 
////		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
////		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
////		size가 2일경우에 7개이다. 
//		System.out.println("===== 10번 문제 ? =====");
//		
//		
//		
//		
//		
////		11.
////		000*
////		00***
////		0*****
////		*******
////		0*****
////		00***
////		000*
//		System.out.println("===== 11번 문제 =====");
//		for(int i=0;i<8;i++) {
//			if(i<=3) {
//				for(int j=0;j<i+4;j++) {
//					if(i==0) {
//						if(j==0 || j==1 || j==2) {
//							System.out.print("0");
//						}else {
//							System.out.print("*");
//						}
//					}
//					if(i==1) {
//						if(j==0 || j==1) {
//							System.out.print("0");
//						}else {
//							System.out.print("*");
//						}
//					}
//					if(i==2) {
//						if(j==0) {
//							System.out.print("0");
//						}else {
//							System.out.print("*");
//						}
//					}
//					if(i==3) {
//						System.out.print("*");
//					}
//				}
//			}else if(i>3) {
//				for(int j=7;j>i-3;j--) {
//					if(i==4) {
//						if(j==7) {
//							System.out.print("0");
//						}else {
//							System.out.print("*");
//						}
//					}
//					if(i==5) {
//						if(j==7 || j==6) {
//							System.out.print("0");
//						}else {
//							System.out.print("*");
//						}
//					}
//					if(i==6) {
//						if(j==7 || j==6 || j==5) {
//							System.out.print("0");
//						}else {
//							System.out.print("*");
//						}
//					}
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("===================");
//		
//		
//		
//		
//		
////		12. 9번 문제에서 for문 2개만 사용하기 if문은 갯 수 상관없음.
//		System.out.println("===== 12번 문제 ? =====");
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
