package _17_School;

import java.util.Scanner;

public class MainMenu {
	private StuMge stu = null;
	private PartMge part = null;
	MainMenu(){
		if(stu == null) {
			stu = new StuMge();
		}
		if(part == null) {
			part = new PartMge();
		}
		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.학생관리");
			System.out.println("2.교과목관리");
			System.out.println("3.로그인");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				stu.menu();
			}else if(num == 2) {
				part.menu();
			}else if(num == 3) {
				
			}else {
				break;
			}
		}
	}
}
