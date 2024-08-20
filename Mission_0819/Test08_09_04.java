package Mission_0819;

public class Test08_09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ttt ="aabbbbbbbcccccccccaaaaddbbbaaaaa";
		int cnt = 0;  // 현재 알파벳의 길이.
		int maxCnt = 0; // 가장 긴 터널의 길이. 
		char maxChar = '0';	// 가장 긴 터널을 가진 알파벳.
		for(int i=0;i<ttt.length();i++) {
			char nowChar = ttt.charAt(i);
			cnt = 0;
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
			i = i+cnt-1;
		}
		System.out.println(maxChar+" / "+maxCnt);
	}

}
