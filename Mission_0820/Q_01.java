package Mission_0820;

public class Q_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
//		int[] arr = {3,45,26,50,74};
//		int a = 5;
//		a로 나누어 떨어지는 배열의 값을 모두 출력하시오.
		int[] arr = {3,45,26,50,74};
		int a = 5;
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			if(temp%a==0) {
				System.out.println(temp);
			}
		}
	}

}
