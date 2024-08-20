package Mission_0819;

public class Test05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용> ***
//		 String ttt ="aabbbcccaaaaddbbbaaaaa";
//		탐색 기능에서 자주사용한다.
		String ttt ="aabbbbbbbcccccccccaaaaddbbbaaaaa";
		char maxChar='0' ;
		int cnt = 0;
		int maxCnt = 0;
		for(int i=0;i<ttt.length();i++) {
			char nowchar = ttt.charAt(i);
			cnt = 0;	
			for(int j=i;j<ttt.length();j++) { 
				if(ttt.charAt(j)!=nowchar) {
					break;
				}else {
					cnt++;
				}
			}
			if(maxCnt < cnt) {
				maxCnt = cnt;
				maxChar = nowchar;
			}
			i = i+cnt-1;
		}
		System.out.println("최대길이: "+maxCnt);
		System.out.println("최대길이 알파벳:" + maxChar);
		}
	}


