package _08_Array2_mission;

public class mission04 {

	public static void main(String[] args) {
		int[][]a = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
//		문제4 : 전체 배열의 값 중 짝수는 모두 몇 개 인가?
		
//		<분석>
//		이 문제는 모든 행에 모든 열의 값이 짝수인지를 확인해야하기 때문에,
//		2중 for문을 사용해야한다.
//		i의 의미:배열 행의 인텍스.
//		j의 의미:행별 열의 인텍스.
		
//		<주의>
//		문제에서는 짝수의 갯수를 확인하고 있는데, 나는 짝수만 구하고 갯수는 안구했다.
//		문제를 조금 더 꼼꼼하게 읽을 필요가 있다.
		int cnt = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0) {
					System.out.print(a[i][j] + "\t");
					cnt++;
				}
			}
			System.out.println();
		}
		System.out.println("전체 배열의 값 중 짝수의 갯수: "+cnt);
	}

}
