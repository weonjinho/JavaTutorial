package _08_Array2_mission;

import java.util.Arrays;

public class mission06 {

	public static void main(String[] args) {
		  int[][]a = {{1,2,3,4,5},
		            {6,7,8,9,10},
		            {11,12,13,14,15},
		            {16,17,18,19,20},
		            {21,22,23,24,25}};
//	      문제6:2차원 배열의 모든 값을 출력하시오.
//	      출력할 때는 행의 번호는 내림차순, 열의 번호도 내림차순으로 출력하시오.
		  
		  
//		  행을 내림차순으로 정렬한다
//		  최대값의 index번호를 저장할 변수.
//	      int maxNumIndex = 0;
//	      for(int i=0;i<a.length;i++) {
//	         for(int j=0;j<a[i].length;j++) {
//	            for(int k=0;k<a[i].length;k++) {
//	               maxNumIndex = 0;
//	               for(int x=0;x<a[i].length-k;x++) {
//	                  if(a[i][maxNumIndex]>a[i][x]) {
//	                     maxNumIndex = x;
//	                  }
//	                  int temp = a[i][a[i].length-1-k];
//	                  a[i][a[i].length-1-k] = a[i][maxNumIndex];
//	                  a[i][maxNumIndex] = temp;
//	               }
//	            }
//	         }
//	      }
//	      int maxNumIndex2 = 0;
//	      for(int i=0;i<a.length;i++) {
//	         for(int j=0;j<a[i].length;j++) {
//	            for(int k=0;k<a[j].length;k++) {
//	               maxNumIndex2 = 0;
//	               for(int x=0;x<a[j].length-k;x++) {
//	                  if(a[maxNumIndex2][j] > a[x][j]) {
//	                     maxNumIndex2 = x;
//	                  }
//	                  int temp = a[a[i].length-1-k][j];
//	                  a[a[i].length-1-k][j] = a[maxNumIndex2][j];
//	                  a[maxNumIndex2][j] = temp;
//	               }
//	            }
//	         }
//	      }
//	      System.out.println(Arrays.deepToString(a));

	}

}
