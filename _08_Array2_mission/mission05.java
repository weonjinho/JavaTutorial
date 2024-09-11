package _08_Array2_mission;

public class mission05 {

	public static void main(String[] args) {
		int[][]a = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
//		문제5:전체 배열의 값 중 홀수를 0으로 마스킹 하고, 마스킹 된 결과 2차원 배열을 출력하시오.
//		출력은
//		0 2 0 4 0
//		6 0 8 0 10
//		이 와 같은 패턴으로 모두 출력되어야 한다.
		
//		<분석>
//		1. 전체 배열 중 홀수를 찾는다.
//		2. 찾은 배열 위치에 0을 대입한다.
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				//홀수일때
				if(a[i][j]%2!=0) {
					//0을 대입하는 방식으로 마스킹 진행.
					a[i][j] = 0;
					System.out.print(a[i][j]+"\t");
				//짝수일때
				}else {
					//값 출력.
					System.out.print(a[i][j]+"\t");
				}
			}
			//줄바꿈 코드.
			System.out.println();
		}
		
		
	}

}
