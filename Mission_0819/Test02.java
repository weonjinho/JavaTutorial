package Mission_0819;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			for(int j=7;j>i;j--) {
				if(i==0) {
					System.out.print("*");
				}
				if(i==1) {
					if(j==7) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
				if(i==2) {
					if(j==7 || j==6) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
				if(i==3) {
					if(j==7 || j==6 || j==5) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}

}
