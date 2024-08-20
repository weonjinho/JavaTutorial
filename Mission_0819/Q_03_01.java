package Mission_0819;

public class Q_03_01 {
	public static void main(String[] args) {
//		3.
//		000*
//		00***
//		0*****
//		*******
		
		// step1:
		// "0"인 상황과 "*"인 상황으로 조건을 나눈다.
		// step2:
		// "0"인 상황은 어떤 조건인가?
		// i=0	j<4 ---> j < 라인수 - i
		// i=1	j<3
		// i=2	j<2
		
		// i=3	없음(그래서 (4-i)에 -1한거임.)
		// "*"인 상황은 어떤 조건인가?
		// "0"이 아닌 상황.
		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<i+4;j++) {
////				if(j >= 4-i-1) {
////					System.out.print("*");
////				}else {
////					System.out.print("0");
////				}
////				System.out.print(j);
////				0123 	---> 000*	 ---> 0:(0,1,2);  *:3
////				01234 	---> 00***   ---> 0:(0,1);	  *:2,3,4
////				012345 	---> 0*****  ---> 0:(0);      *:1,2,3,4,5
////				0123456 ---> ******* ---> 0:(없음);	  *:0,1,2,3,4,5,6
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+4;j++) {	// 규칙: j < i+(첫줄 별의 개수)
				if(j < 4-i-1) {			// (4-i)-1: 여기서 -1를 마지막 줄을 거외한다는 의미이다.
					System.out.print("0");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
}
