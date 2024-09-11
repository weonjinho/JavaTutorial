package _08_Array2_mission_02;

import java.util.Arrays;
import java.util.Scanner;

public class tmission_right {

	public static void main(String[] args) {
//		[0][0] --> [0][2] ---> i=0, j=j+2	---> (0, j+2)
//		[0][1] --> [1][2] ---> i=i+1, j=j+1 ---> (i+1,j+1)
//		[0][2] --> [2][2] ---> i=i+2, j=2	---> (i+2,2)
		int[][] a = {{1,1,0},{0,1,0},{0,1,1}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print("i:"+i+" ");
				System.out.print("j:"+j+"  ");
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
