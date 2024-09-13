package _08_Array2_mission_02;

public class tetris_mission_left {

	public static void main(String[] args) {
		int[][] b = {{1,1,0},{0,1,0},{0,1,1}};
//		1 1 0 ---> 0 0 1
//		0 1 0 	   1 1 1
//		0 1 1      1 0 0
		
//		원본 블록 좌표:
//		(0,0)(0,1)(0,2) 
//		(1,0)(1,1)(1,2)
//		(2,0)(2,1)(2,1)
		
//		좌 회전 후 좌표:
//		(2,0)(1,0)(0,0)	---> (i-1,j)
//		(2,1)(1,1)(0,1)
//		(2,2)(1,2)(0,2)
		
		
		
//		for(int i=2;i>=0;i--) {
//			System.out.print(i+":"+0+" ");
//		}
//		System.out.println();
//		for(int i=2;i>=0;i--) {
//			System.out.print(i+":"+1+" ");
//		}
//		System.out.println();
//		for(int i=2;i>=0;i--) {
//			System.out.print(i+":"+2+" ");
//		}
//		System.out.println();
		
		int k=0;
		for(int i=0;i<b.length;i++) {
			for(int j=2;j>=0;j--) {
//				System.out.print(j+":"+k+" ");
				System.out.print(b[j][k]+" ");
			}
			k++;
			System.out.println();
		}
		
	}

}
