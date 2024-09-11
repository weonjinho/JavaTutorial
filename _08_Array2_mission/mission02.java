package _08_Array2_mission;

public class mission02 {

	public static void main(String[] args) {
//		2.2차원 배열 a의 3번째 행에서 짝수의 값만 출력하시오.
		int[][]a = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
//		<분석>
//		이 문제도 행이 3번째 즉 i=2로 고정됐다.
//		반복문으로 3번째 행(i=2)에 길이만큼 반복해서 그중 짝수를 출력하면 될것같다.
		for(int i=0;i<a[2].length;i++) {
			if(a[2][i]%2==0) {
				System.out.print(a[2][i]+" ");
			}
		}
	}

}
