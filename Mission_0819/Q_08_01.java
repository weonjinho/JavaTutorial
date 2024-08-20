package Mission_0819;

public class Q_08_01 {

	public static void main(String[] args) {
//		8.
//		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
//		애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
//		가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
//		제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		
		
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int cnt = 0;				// 현재 숫자의 길이.
		int removeSize = 3;			// 제거할 캐릭터의 길이.
		int removeNum = 0;			// 제거할 숫자.
		int removeNumCnt = 0;		// 제거할 숫자의 갯수.
		int startIndex = 0;			// 제거할 숫자의 시작위치 인덱스.
		int temp = 0;				// 비교를 위한 변수.
		for(int i=0;i<pang.length;i++) {
			temp = pang[i];
			cnt = 0;
			for(int j=i;j<pang.length;j++) {
				if(pang[j]!=temp) {
					break;
				}else {
					cnt++;
				}
			}
			if(cnt >= removeSize) {
				removeNum = temp;
				removeNumCnt = cnt;
				startIndex = i;
				System.out.println("캐릭터 번호: "+temp);
				System.out.println("갯수: "+removeNumCnt);
				System.out.println("시작위치 인덱스: "+startIndex);
				System.out.println();
			}
			i = i+cnt-1;
		}
		
		
	}

}
