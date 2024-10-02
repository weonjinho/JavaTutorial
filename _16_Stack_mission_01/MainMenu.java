package _16_Stack_mission_01;

import java.util.Scanner;

public class MainMenu {
	private JoinMge join = null;
	private LoginMge login = null;
	MainMenu(){
		if(join == null) {
			join = new JoinMge();
		}
		if(login == null) {
			login = new LoginMge();
			
			
		}
		
		login.j = join;
		
		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.학생관리");
			System.out.println("4.교과목 관리");
			System.out.println("선택 > ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				//회원가입 클래스
				 join.menu();
			}else if(selNum == 2) {
				//로그인 클래스
				LoginMge l = new LoginMge();
				l.menu();
			}else if(selNum == 3) {
				//학생관리 클래스
			}else if(selNum == 4) {
				//교과목 클래스
			}else {
				break;
			}
		}
	}
}

