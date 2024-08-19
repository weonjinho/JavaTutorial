package Mission_0819;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<8;i++) {
			if(i<=3) {
				for(int j=0;j<i+4;j++) {
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
					if(i==3) {
						System.out.print("*");
					}
				}
			}else if(i>3) {
				for(int j=7;j>i-3;j--) {
					if(i==4) {
						if(j==7) {
							System.out.print("0");
						}else {
							System.out.print("*");
						}
					}
					if(i==5) {
						if(j==7 || j==6) {
							System.out.print("0");
						}else {
							System.out.print("*");
						}
					}
					if(i==6) {
						if(j==7 || j==6 || j==5) {
							System.out.print("0");
						}else {
							System.out.print("*");
						}
					}
				}
			}
			System.out.println();
		}
	}

}
