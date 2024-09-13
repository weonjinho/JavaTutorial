package _08_Array2_mission;

import java.util.Random;
import java.util.Scanner;

public class anyPang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int[][] pang= {
				{1,1,0,2},
				{3,2,2,2},
				{0,3,3,2},
				{4,4,4,4},
				{2,4,3,1},
				{2,4,1,3}};		
		for(int i=0;i<pang.length;i++) {
			System.out.println(i+"번 행:");
			for(int j=0;j<pang[0].length;j++) {
				System.out.print(pang[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("행번호를 입력하세요.");
		int row = in.nextInt();
		in.nextLine();
		System.out.println("열번호를 입력하세요.");
		int col = in.nextInt();
		in.nextLine();
		
		int number = pang[row][col];
		int numberLength = 0;
		int numberLeftCol = col;
		
	}

}
