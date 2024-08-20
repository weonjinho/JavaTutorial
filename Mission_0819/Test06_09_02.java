package Mission_0819;

public class Test06_09_02 {
	public static void main(String[] args) {
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int cnt = 0;		// a 길이중 가장 긴 길이.
		int maxCnt = 0;		// 현재의 a 의 길이.
		for(int i=0;i<ttt.length();i++) {
			char temp = ttt.charAt(i);
			cnt = 0;	// cnt 초기화 !!!
			if(temp=='a') {
				for(int j=i;j<ttt.length();j++) {
					if(ttt.charAt(j)!='a') {
						break;
					}else {
						cnt++;
					}
				}
				if(maxCnt < cnt) {
					maxCnt = cnt;
				}
				i = i+cnt-1;
			}
		}
		System.out.println(maxCnt);
	}
}
