package Mission_0820;

import java.util.Arrays;

public class Q_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5.
//		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599}
//		int[] parking = new int[10];
//		   carnum배열의 인덱스가 0인 값부터 주차장에 들어온다. // carnum배열은 자동차 번호를 의미합니다. 
//		   parking의 인덱스 번호가 주차번호이다. 
//		   자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
//		   만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
//		   (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)
//		
//		   주차가 끝난 후 주차번호와 주차한 차량 번호를 출력하시오.
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		// 자동차의 마지막 번호 구하기:
		int num = 0;
		int lastNum = 0;
		for(int i=0;i<carnum.length;i++) {
			num = carnum[i];
			lastNum = num%10;
			parking[lastNum] = num;
			if(carnum[0]%10 == carnum[3]%10) {
				parking[2] = carnum[0];
				parking[3] = carnum[3];
			}
			if(carnum[8]%10 == carnum[9]%10) {
				parking[9] = carnum[8];
				parking[0] = carnum[9];
			}
		}
		System.out.println(Arrays.toString(parking));
	}
	
}