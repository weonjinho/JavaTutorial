package _16_Stack_mission_01;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinMge {
	ArrayList<JoinOne> jList = new ArrayList<JoinOne>();
	JoinMge(){
		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 뒤로 가기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				joinMember();
			}else if(selNum == 2) {
				allMemberList();
			}else {
				break;
			}
		}
	}
	
	public void joinMember() {
		Scanner in = new Scanner(System.in);
		JoinOne j = new JoinOne();
		System.out.println("회원가입 페이지입니다.");
		System.out.println("가입할 아이디를 입력하세요.");
		String inputId = in.nextLine();
		j.setId(inputId);
		System.out.println("가입할 이이디의 비밀번호를 입력하세요.");
		String inputPw = in.nextLine();
		j.setPw(inputPw);
		System.out.println("가입할 회원의 이름을 입력하세요.");
		String inputName = in.nextLine();
		j.setName(inputName);
		System.out.println("가입할 회원의 전화번호을 입력하세요.");
		String inputTel = in.nextLine();
		j.setTel(inputTel);
		System.out.println("가입할 회원의 학년을 입력하세요.");
		String inputGrade = in.nextLine();
		j.setGrade(inputGrade);
		
		jList.add(j);
	}
	public void allMemberList() {
		for(int i=0;i<jList.size();i++) {
			jList.get(i).prt();
		}
	}
}
