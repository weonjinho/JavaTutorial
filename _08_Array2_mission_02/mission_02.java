package _08_Array2_mission_02;

public class mission_02 {

	public static void main(String[] args) {
	int[][] a = new int[4][5];
		
		int num =1;
		//2차원 배열의 값을 저장하는 코드.
		for(int 열=4;열>=0;열--) {
			for(int 행=0; 행<4;행++) {
				a[행][열]=num;
				num++;
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
