package _10_Class_level2;

import java.util.Scanner;

//고객관리 클래스
public class MemberAdmin {
	//의존관계 설정, 중요한 것은 MemberOne 객체를 만든 것이 아니다.
	//MemberOne 객체의 주소값을 저장할 배열(길이5)를 생성한 것이다.
	//배열도 객체입니다.. mlist는 참조변수이고 MemberOne객체의 주소를 
	//저장한 배열의 주소를 저장하고 있다. ***
	MemberOne[] mlist = new MemberOne[5];
	
	MemberAdmin() {
//		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.고객관리");
			System.out.println("2.이벤트관리");
			System.out.println("9.프로그램 종료");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addUser();
			}else if(num == 2) {
				allListUser();
			}else if(num == 9) {
				break;	//while문 종료.
			}
		}
	}
	public boolean duplexIdCheck(String id) {
		for(int i=0;i<mlist.length;i++) {
			if(mlist[i] != null) {
				if(mlist[i].id.equals(id)) {
					return true;	// 중복 있음.
				}
			}
		}
		return false;
	}
	private void addUser() {
		Scanner in = new Scanner(System.in);
		MemberOne temp = new MemberOne();
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		if(duplexIdCheck(id)) {
			System.out.println("아이디 중복됨.");
		}else {
			temp.id = id;
			System.out.println("이름을 입력하세요.");
			String name = in.nextLine();
			temp.name = name;
			
			for(int i=0;i<mlist.length;i++) {
				if(mlist[i] == null) {
					mlist[i] = temp;
					break;
				}
			}
		}
		temp = null;	//temp에 저장된 주소값이 필요없어서 null처리.
						//Scanner에 필요한 자원 반납
	}
	private void allListUser() {
		// TODO Auto-generated method stub
		for(int i=0;i<mlist.length;i++) {
			if(mlist[i] != null) {
				mlist[i].prt();
			}
		}
	}
}
