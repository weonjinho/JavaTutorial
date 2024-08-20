package Mission_0819;

public class Test08_09_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ttt ="aabbbbbbbcccccccccaaaaddbbbaaaaa";
		// ttt를 순회한다. (for 문 int i)
		// 첫번째 문자를 nowChar에 저장한다.
		// 사작점 알파벳의 길이를 구한다. (for 문 int j)
		// nowChar 랑 일치하는지 비교한다. ---> 일치 시: cnt+1
		//							---> 불일치 시: 안쪽 반복문을 빠져나간다.
		// 다음 알파벳으로 넘어가기 전에 현재 알파벳의 count값을 0으로 초기화 할것!
		// 비교가 끝난후: 
		//      1. 최대 터널길이의 maxCnt값을 cnt로 업데이트해준다.
		//		2. 최장 길이를 가진 알파벳을 maxChar에 업데이트한다.
		// 현재 count한 만큼 i를 빼준다. i++이 있기에 -1를 해준다. ( i=i+cnt-1 )
		int cnt = 0;
		int maxCnt = 0;
		char maxChar = '0';
		for(int i=0;i<ttt.length();i++) {
			char nowChar = ttt.charAt(i);
			cnt=0;
			for(int j=i;j<ttt.length();j++) {
				if(ttt.charAt(j)!=nowChar) {
					break;
				}else {
					cnt++;
				}
			}
			if(maxCnt < cnt) {
				maxCnt = cnt;
				maxChar = nowChar;
			}
		}
		System.out.println(maxCnt);
		System.out.println(maxChar);
	}

}
