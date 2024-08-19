package Mission_0819;

public class Test01 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+3;j++) {
				if(i==0) {
					if(j==0 || j==1 || j==2) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
				if(i==1) {
					if(j==0 || j==1) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
				if(i==2) {
					if(j==0) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
				if(i>2) {
					System.out.print("*");
				}
			}
			System.out.println("*");
		}
	}

}
