package _16_Stack_mission;

import java.util.Scanner;

public class MainMenu {
	MainMenu(){
		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.학생 관리");
			System.out.println("2.교과목 관리");
			System.out.println("선택 >");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				stuMge();
			}else if(selNum == 2) {
				lessonMge();
			}else {
				break;
			}
		}
	}
	private void stuMge() {
		StuMge stu = new StuMge();
	}
	private void lessonMge() {
		LessonMge lesson = new LessonMge();
	}
}
