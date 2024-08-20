package Mission_0819;

public class Q_04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*******
//		0*****
//		00***
//		000*
		// 상황을 "*"과"0"으로 나눌 수 있다.
		// "*"일때 조건은:
		// "0"일때 조건은:
		
		// 모양을 만든다.
		
		
		
		for(int i=0;i<4;i++) {
//			for(int j=0;j<(4-i)+3;j++) {
			for(int j=0;j<7-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
