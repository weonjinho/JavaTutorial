package Mission_0820;

import java.util.Arrays;

public class Q_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. int[] b = {93,45,83,58,75,56}
//		다음조건에 따라 오름차순으로 정렬하시오.
//		1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
//		2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
//		3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
//		오름차순으로 정렬이 될때 까지 반복한다.
		// 1.
		int[] b = {93,45,83,58,75,56};
		int maxNum = 0;
		for(int i=0;i<b.length;i++) {
			if(maxNum < b[i]) {
				maxNum = b[i];
				int temp = 0;
				temp = b[b.length-1];
				b[b.length-1] = b[i];
				b[i] = temp;
			}
		}
		System.out.println(Arrays.toString(b));
		// 2.
		int maxNum2 = 0;
		int num = 0;
		for(int i=0;i<b.length-1;i++) {
			if(maxNum2 < b[i]) {
				maxNum2 = b[i];
				num = b[b.length-2];
				int temp = b[i];
				b[i] = b[b.length-2];
				b[b.length-2] = temp;
			}
		}
		System.out.println(maxNum2);
		System.out.println(num);
		System.out.println(Arrays.toString(b));
	}

}
