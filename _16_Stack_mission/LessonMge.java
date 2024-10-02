package _16_Stack_mission;

import java.util.Scanner;

public class LessonMge {
	LessonMge(){
		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("--- 교과목 관리 페이지 ---");
			System.out.println("1.등록");
			System.out.println("2.조회");
			System.out.println("선택 > ");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addLesson();
			}else if(num == 2) {
				selLesson();
			}else {
				break;
			}
		}
	}
	private void addLesson() {
		
	}
	private void selLesson() {
		
	}
}
