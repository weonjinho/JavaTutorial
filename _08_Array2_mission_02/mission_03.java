package _08_Array2_mission_02;

public class mission_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][5];
		int num =1;
		
		//2차원 배열의 값을 저장하는 코드.
		for(int i=3;i>=0;i--) {
			//System.out.println("행"+행);
			for(int j=4;j>=0;j--) {
				//System.out.println("열"+열);
				a[i][j]=num;
				num++;
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		// a[행][열] = ++ㅜㅕㅡ;
//		이것은 단일연산자가 먼저 실행되고
		//대입연산자가 실행된다.
		//첫번째 case를 후위 단일 연산자라고 한다.
		//두번째 case를 전위 단일 연산자라고 한다.
//		System.out.println(i+"/"+j);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
