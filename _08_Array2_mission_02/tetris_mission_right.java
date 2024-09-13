package _08_Array2_mission_02;

import java.util.Arrays;

public class tetris_mission_right {
	public static void main(String[] args) {
		int[][] b = {{1,1,0},{0,1,0},{0,1,1}};
//				1번째 행
//				//0,0 ---> 0,2		//i==0, j==0 ---> i==0, j==2	---> 1번째 행: (0,2) (1,2) (2,2)
//				//0,1 ---> 1,2		//i==0, j==1 ---> i==1, j==2
//				//0,2 ---> 2,2		//i==0, j==2 ---> i==2, j==2
		
//				2번째 행
//				//1,0 ---> 0,1		//i==1, j==0 ---> i==0, j==1    ---> 2번째 행: (0,1) (1,1) (2,1)
//				//1,1 ---> 1,1		//i==1, j==1 ---> i==1, j==1
//				//1,2 ---> 2,1		//i==1, j==2 ---> i==2, j==1
		
//				3번째 행
//				//2,0 ---> 0,0		//i==2, j==0 ---> i==0, j==0    ---> 3번째 행: (0,0) (1,0) (2,0)
//				//2,1 ---> 1,0		//i==2, j==1 ---> i==1, j==0
//				//2,2 ---> 2,0		//i==2, j==2 ---> i==2, j==0
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
//		2:0 2:1 2:2 
//		1:0 1:1 1:2 
//		0:0 0:1 0:2
//		for(int j=2;j>=0;j--) {					
//			for(int i=0;i<b.length;i++) {
//				System.out.print(j+":"+i+" ");
//			}
//			System.out.println();
//		}
		
		
		
//	|   0:2 0:1 0:0  ---> (0,2) (1,2) (2,2) ---> 다각선으로 뒤집기. (x)
//	|	1:2 1:1 1:0 	  (0,1) (1,1) (2,1)
//	^	2:2 2:1 2:0       (0,0) (1,0) (2,0)
//		for(int i=0;i<b.length;i++) {
//			for(int j=2;j>=0;j--) {
//				System.out.print(i+":"+j+" ");
////				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		0:2 1:2 2:2 
//		0:1 1:1 2:1 
//		0:0 1:0 2:0 
		
//		for(int i=0;i<b.length;i++) {
//			System.out.print(i+":"+2+" ");
//		}
//		System.out.println();
//		
//		for(int i=0;i<b.length;i++) {
//			System.out.print(i+":"+1+" ");
//		}
//		System.out.println();
//		
//		for(int i=0;i<b.length;i++) {
//			System.out.print(i+":"+0+" ");
//		}
		
		
		
		
//		0:2 1:2 2:2 
//		0:1 1:1 2:1 
//		0:0 1:0 2:0 
//		int k=2;
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<b.length;j++) {
//				System.out.print(j+":"+k+" ");
//			}
//			k--;
//			System.out.println();
//		}
		
		
//		우회전 끝!
//		0 0 1 
//		1 1 1 
//		1 0 0 
		int k=2;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
//				System.out.print(b[j][k]+" * ");
//				System.out.print(b[i][j]+" - ");
//				여기서 출력만 하지말고 배열의 값을 바꿔버리자.
//				b[j][k] ---> b[i][j] 
//				2차원 배열에서 값을 서로 바꿀때 temp함수를 이렇게 시용하면 왜 안될까?
//				int temp = b[j][k];
//				b[j][k]=b[i][j];
//				b[i][j]=temp;
				System.out.print("i:"+i);
				System.out.print("j:"+j);
				System.out.print("k:"+k+" ");
			}
			k--;
			System.out.println();
		}
		System.out.println(Arrays.deepToString(b));
	}
}
