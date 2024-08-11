package WeonMathFiles;

public class FindMaxValue {

	public static void main(String[] args) {
		// 배열 중에서 최대값 찾는법.
		int[] a = {30, 40, 50, 55, 65};
		// 최대값 찾기
		int maxValue = 0;				// 엄청 작은 숫자를 대입한다.
		for(int i=0;i<a.length;i++) {
			if(maxValue < a[i]) {		// a[i]가 그 숫자보다 크면 a[i]를 maxValue에 대입한다.
				maxValue = a[i];
			}
		}
		System.out.println("최대값은: "+maxValue+" 입니다.");

	}

}
