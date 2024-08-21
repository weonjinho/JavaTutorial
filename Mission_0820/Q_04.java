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
				maxNum = b[i];					// 최대값
				int temp = b[b.length-1];
				b[b.length-1] = b[i];
				b[i] = temp;
			}
		}
		System.out.println(Arrays.toString(b));
		
		
		
		// 2.
		
	}

}
