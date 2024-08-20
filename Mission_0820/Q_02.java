package Mission_0820;

public class Q_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2
//		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
//		배열의 평균값을 구하시오. 소수점 표현하시오. 
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		System.out.println("평균값: "+avg);
	}

}
