package _08_Array2_mission_03;

public class mission_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[4][5];
		int num=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
//				System.out.print(i+"/"+j+" ");
				a[i][j]=num++;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
