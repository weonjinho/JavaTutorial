package WeonMathFiles;

public class FindMinValue {

	public static void main(String[] args) {
		// 배열 중에서 최저값 찾는법.
		int[] a = {30, 40, 50, 55, 65};
		// 최저값 찾기
		int minValue = 10000;			// 엄청 큰 숫자를 대입한다.
		for(int i=0;i<a.length;i++) {
			if(minValue > a[i]) {		// a[i]가 그 숫자보다 작으면 a[i]를 maxValue에 대입한다.
				minValue = a[i];
			}
		}
		System.out.println("최저값은: "+minValue+" 입니다.");
	}

}
