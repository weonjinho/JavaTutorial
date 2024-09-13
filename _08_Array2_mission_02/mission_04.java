package _08_Array2_mission_02;

public class mission_04 {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num =1;
		for(int i=0;i<8;i++) { //
			System.out.println(i+"번째 채우기를 합니다.");
			int newCol=i;
			for(int j=0;j<=i;j++) {
				if(j>3) continue;	//if절에서 한줄이면 괄호x
				System.out.println("j<행>"+j+"/newCol열"+newCol);
				newCol--;
			}
		}
	}
}


