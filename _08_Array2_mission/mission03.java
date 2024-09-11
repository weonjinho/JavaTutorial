package _08_Array2_mission;

public class mission03 {

	public static void main(String[] args) {
		
		int[][]a = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
//		문제3: 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시오. 3 8 13 18 23

//		<분석>
//		이 문제에서 열의 index(j)는 2로 고정되있으며,2중 for문 사용할 필요는 없다.
//		반복 횟수는 a의 행의 길이 만큼이다.
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i][2]);
		}
	}

}
