package Mission_0820;

public class Q_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 팩토리얼의 합 구하기 (2중 for로 해결)
//		1부터 10까지 숫자의 각패토리얼의 합을 구하시오
//		예를들어 4의 팩토리얼은  1*2*3*4
//		      5의 팩토리얼은 1*2*3*4*5
		int num = 1;
		int sum = 0;
		for(int i=1;i<11;i++) {
			for(int j=1;j<i+1;j++) {
				num *= j;
			}
			sum += num;
			num=1;
		}
		System.out.println(sum);
	}

}
