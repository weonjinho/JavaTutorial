package _16_Stack_mission_01;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginMge {
//	private ArrayList<JoinOne> jList = new ArrayList<JoinOne>();
	JoinMge j = null;
	LoginMge(){
//		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.로그인 하기");
			System.out.println("2.뒤로 가기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				login();
			}else {
				break;
			}
		}
	}
	public void login() {
		Scanner in = new Scanner(System.in);
//		JoinOne j = new JoinOne();		
		System.out.println("--- 현재 회원 리스트 ---");
		for(int i=0;i<j.jList.size();i++) {
			j.jList.get(i).prt();
		}
		
		
		System.out.println("회원 아이디를 입력하세요.");
		String inputId = in.nextLine();
		System.out.println("회원의 비밀번호를 입력하세요.");
		String inputPw = in.nextLine();
		
		for(int i=0;i<j.jList.size();i++) {
			if(inputId.equals(j.jList.get(i).getId())) {
				//비밀번호 확인
				if(inputPw.equals(j.jList.get(i).getPw())){
					System.out.println("로그인 성공!!!");
				}else {
					System.out.println("비밀번호 입력 오류!");
				}
			}else {
				System.out.println("로그인하신 회원의 ID가 잆습니다.");
			}
		}
	
	}
}
