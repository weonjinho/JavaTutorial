package Mission_0820;

import java.util.Scanner;

public class Q_0607 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		<이번 저희회사에서는 회원관리 프로젝트를 담당하게 되었습니다.
//		회원관리 프로젝트 중 회원의 아이디 유효성 체크를 미션으로 드립니다>

//		6.
//		키보드로 아이디를 입력받는다.
//		입력 받은아이디에 특수 문자가 포함 되었는지 확인한다. (유효성)
//		특수 문자는 @한개로 정의한다.
//		특수문자가 몇 개 포함되었는지 출력합니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요.");
		String id = sc.next();
		sc.nextLine();
		int cnt = 0;
		for(int i=0;i<id.length();i++) {
			if(id.charAt(i)=='@') {
				cnt++;
			}
		}
		System.out.println("특수문자가: "+cnt+" 개 있음.");
		
		
		
		
//		7.
//		키보드로 아이디를 입력 받는다.
//		입력 받은 아이디에 특수문자가 포함되었는지 확인한다. (유효성)
//		특수문자는 String sign="!@#$%^&*"로 정의한다.
//		특수문자가 몇 개 포함되었는지 출력합니다. 
		String sign="!@#$%^&*";
		char mark = '!';
		int cntMark = 0;
		for(int i=0;i<sign.length();i++) {
			mark = sign.charAt(i);
			for(int j=0;j<id.length();j++) {
				if(id.charAt(j)==mark) {
					cntMark++;
				}
			}
		}
		System.out.println("특수문자가: "+cntMark+" 개 있음.");
		
		
		
		
		
		
		
		
		
		
	}

}
