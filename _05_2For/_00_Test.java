package _05_2For;

public class _00_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2중 for문:(중요하고 기본적!)
//		코테 전략:
//		서로 연관 관계가 있다면 2중for문을 사용하는것이 좋다.
//		시나리오1 : 1단을 모두 출력하시오. (면접 문제)
//		for(int i=1;i<5;i++) {
//			System.out.println("1x"+i+"="+(i*1));
//		}
//		System.out.println("--------------");
//		시나리오2 : 1단부터 4단까지 출력하시오.
//		단이 반복될때 마다 안에 무엇가도 반복되고 있다.
//		for(int dan = 1; dan<5; dan++) {
//			for(int i=1;i<5;i++) {
//				System.out.println(dan+"x"+i+"="+(dan*i));
//			}
//		}
		
//		-------------------------------------------------------------------------------
		
//		for(int i=0;i<5;i++) {
//			System.out.println("1*"+i+"="+(1*i));
//		}
//		
//		for(int dan = 1; dan<5;dan++) {
//			System.out.println(dan+"단");
//			for(int i=0;i<5;i++) {
//				System.out.println(dan+"*"+i+"="+(dan*i));
//			}
//		}
		
//		예제1:
//		***
//		***
//		***
//		***
//		을 출력하라.
//		1. 줄에서 * 3개가 반복 출력.
//		2. 줄이 반복된다.
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print("*");	   // 별 찍기 코드.
//			}
//			System.out.println();          // 줄바꿈 코드.
//		}
//		문제를 분석:
//		i를 무엇으로 볼것인가? --> i 의 변화에 따라 j 가 반복된다.
//		j를 무엇으로 볼것인가?
//		i=0        i=1       i=2        i=3
//		j=0,1,2    j=0,1,2   j=0,1,2    j=0,1,2
		
//		큰 틀 반복{
//		   작은 클 반복{}
//		}
		
//		예제1:
//		*
//		**
//		***
//		****
//		1. 줄을 출력.
//		2. 줄에서 열에 순서댜로 *를 출력한다.
//		i=0        i=1       i=2        i=3
//		j=0    	   j=0,1     j=0,1,2    j=0,1,2,3
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		에제2:
//		String id = "abc*";		// id
//		String sign = "abc*";	// 특수문자를 정의: 
//		문제: id에 특수문자가 있는가?
		// 시나리오:
//		id에서 문자를 가져온후 text변수에 저장한다.
//		text를 반복문을 이용해서 sign에 문자와 비교한다.
//		일치하는게 1개라도 있다면
//		"특수문자 있음."을 출력한다.
		String id = "abc*";
		String sign = "*^$";
		int cnt = 0;			// 특수문자 카운팅.
//		1. sign의 0번 문자부터 찾는다. --- 먼저
//		2. id의 0번 문자가 특수문자인가? --- 나중
//		i=0         i=1         i=2      
//		j=0,1,2,3   j=0,1,2,3   j=0,1,2,3
		for(int i=0;i<sign.length();i++) {
			for(int j=0;j<id.length();j++) {
				if(sign.charAt(i)==id.charAt(j)) {
					cnt++;
				}					
			}
		}
		if(cnt>0) {
			System.out.println("특수문자 있음.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
