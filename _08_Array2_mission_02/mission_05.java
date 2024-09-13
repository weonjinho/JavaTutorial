package _08_Array2_mission_02;

public class mission_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][5];
		int num =1;
		
//		변수4개 만들기
		int 행최소값=0;
		int 행최대값=3;
		int 열최소값=0;
		int 열최대값=4;
		
//		맨 위에 부분 숫자 채우기
//		맨 위는 행최소값0 열최소값 0 열최대값4
//		맨 위(두번째는 행최소값 1, 열최소값 1 열최대값 3)
		
		for(int j=0;j<2;j++) {
			for(int i=열최소값;i<=열최대값;i++) {
				a[행최소값][i]=num++;
			}
			//위 반복문이 완료되었다면 0번행은 채울 필요없다.
			//행의 최소값을 증가시켜 버린다.
			행최소값++;
			for(int i=행최소값;i<=행최대값;i++) {
				a[i][열최대값]=num++;
			}
			열최대값--;
			
			for(int i=열최대값;i>=열최소값;i--) {
				a[행최대값][i]=num++;
			}
			열최소값++;	//행 1 2, 열은 0 3
			
			
			행최대값--;	//행의 최소값 1 2,열은 0 3
			for(int i=행최대값;i>=행최소값;i--) {
				a[i][열최소값]=num++;
			}
		}
		
		
		//2차원 배열 a의 값을 0
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
