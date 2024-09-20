package _10_Class_mission_Day02_level_02;

import java.util.Scanner;

public class TrainM {
	TrainObj[] trainList = new TrainObj[4];
	Scanner in = new Scanner(System.in);
	public TrainM() {
		// TODO Auto-generated constructor stub
		menu();
	}
	public void menu() {
		while(true) {
			System.out.println("--- 매뉴 ---");
			System.out.println("1.등록");
			System.out.println("2.전체보기");
			System.out.println("3.수정");
			System.out.println("선택 >>");
			int selNum = in.nextInt();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				allList();
			}else if(selNum == 3) {
				modify();
			}else {
				break;
			}
		}
	}
	public void add() {
		System.out.println("정보 등록");
		TrainObj train = new TrainObj();
		String inputTNum = in.nextLine(); //기차번호 입력받는다.
		
		for(int i=0;i<trainList.length;i++) {
			if(trainList[i] != null) {
				if(inputTNum.equals(trainList[i].trainNum)) {
				//도착시간 입력.
					train.arriveTime = in.nextLine();
					
					
					
					
					
					
				}else {
					System.out.println("입력오류");
				}
			}
		}
		
		
		
		
	}
	public void allList() {
		System.out.println("전체보기");
	}
	public void modify() {
		System.out.println("수정");
	}
}
