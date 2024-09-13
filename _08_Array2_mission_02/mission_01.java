package _08_Array2_mission_02;

public class mission_01 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num =1;
		//2차원 배열의 값을 저장하는 코드
		for(int i=0;i<4;i++) {
			//i와 j값으로 배열을 순회하는 순서를 결정.
			//순회하면서 num의 값을 저장한 것.
			for(int j=0;j<5;j++) {
				a[i][j]=num;
				//저장했으니 num값을 증가시킨것.
				num++;
			}
		}

		
		for(int i=0; i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//값 확인용 for문
		//2차원 배열a의 값을 0번행부터 모두 출력.
//		for(int i=0; i<4;i++) {
//			//행 디버깅용 코드
////			System.out.println(">행"+행);
//			for(int j=0;j<5;j++) {
//				System.out.print(a[i][j]+" "); // "\t" 개행문자..검색..tab만큼 뜨워라.
//			}
//			System.out.println();
//		}
		
		
		
//		[주의]
//		for문을 분리하면 수정할때 다른 속성에 영향을 주지않는다.
//		if,for문 한개당 하가지 기능한 정의하고 작성 한다.
//		if,for문 등 작성할 때 한가지 기능만 정의하고 작성한다.
//		한 가지 기능만 정의하고 작성하는 개발자의 센스다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
