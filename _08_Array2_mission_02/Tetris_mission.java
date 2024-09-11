package _08_Array2_mission_02;

import java.util.Arrays;
import java.util.Scanner;

public class Tetris_mission {

	public static void main(String[] args) {
//		회전 전
//		[0][0]	[0][1]	[0][2]
//		[1][0]	[1][1]	[1][2]
//		[2][0]	[2][1]	[2][2]
//		1:[0][0], [0][1], [1][1], [2][1], [2][2]
		
//		회전 후
//		[0][0]	[0][1]	[0][2]
//		[1][0]	[1][1]	[1][2]
//		[2][0]	[2][1]	[2][2]	
//		1:[0][2], [1][0], [1][1], [1][2], [2][0]
		
//		회전 전 표기된 좌표값:	
		int[][] before = {{1,1,0},{0,1,0},{0,1,1}};
//		우회전 후 표기된 좌표값:
//		int[][] right = {{0,0,1},{1,1,1},{1,0,0}};
//		좌회전 후 표기된 좌표값:
//		int[][] left = {{0,0,1},{1,1,1},{1,0,0}};
		
//		for(int i=0;i<before.length;i++) {
//			for(int j=0;j<before[0].length;j++) {
//				if(i!=1 || j!=1) {
//					if(before[i][j]==1) {
//						before[i][j]=0;
//					}else if(before[i][j]==0) {
//						before[i][j]=1;
//					}
//				}
//			}
//			System.out.println();
//		}
//		System.out.println(Arrays.deepToString(before));
		
		
//		회전할 방향을 입력 받는다.(r/l)
//		회전후 표기된 값의 좌표를 출력하세요.
		Scanner move = new Scanner(System.in);
		
		for(int i=0;i<before.length;i++) {
			for(int j=0;j<before[0].length;j++) {
				System.out.print(before[i][j]+" ");
			}
			System.out.println();
		}
		while(true) {
			System.out.println("회전할 방향을 입력하세요:r/l");
			String order = move.nextLine();
			if(order.equals("r")) {
				System.out.println("오른쪽");
				for(int i=0;i<before.length;i++) {
					for(int j=0;j<before[0].length;j++) {
						if(i!=1 || j!=1 ) {
							if(before[i][j]==1) {
								before[i][j]=0;
								System.out.print(before[i][j]+" ");
							}else if(before[i][j]==0) {
								before[i][j]=1;
								System.out.print(before[i][j]+" ");
							}
						}
					}
						System.out.println();
				}
				System.out.println("우회전 후 표시된 값은: "+Arrays.deepToString(before)+"입니다.");
			}else if(order.equals("l")) {
				System.out.println("왼쪽");
				for(int i=0;i<before.length;i++) {
					for(int j=0;j<before[0].length;j++) {
						if(i!=1 || j!=1) {
							if(before[i][j]==1) {
								before[i][j]=0;
								System.out.print(before[i][j]+" ");
							}else if(before[i][j]==0) {
								before[i][j]=1;
								System.out.print(before[i][j]+" ");
							}
						}
					}
					System.out.println();
				}
				System.out.println("좌회전 후 표시된 값은: "+Arrays.deepToString(before)+"입니다.");
			}else if(order.equals("stop")) {
				System.out.println("게임종료");
				break;
			}
		}
		
		

		
	}

}
