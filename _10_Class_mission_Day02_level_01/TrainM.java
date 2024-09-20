package _10_Class_mission_Day02_level_01;

import java.util.Scanner;

public class TrainM {
	Scanner in = new Scanner(System.in);
	TrainObj[] trainList = new TrainObj[10];
	public TrainM() {
		menu();
	}
	public void menu() {
		while(true) {
			System.out.println("1. 가치 시간 등록");
			System.out.println("2. 전체보기");
			System.out.println("3. 수정");
			System.out.println("선택 >>");
			int selNum = in.nextInt();
			in.nextLine();		
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
		System.out.println("등록기능");
		TrainObj train = new TrainObj();
		System.out.println("기차번호를 업력하세요.");
		train.trainNum = in.nextLine();
		System.out.println("기차시간을 입력하세요.");
		train.trainTime = in.nextLine();
		for(int i=0;i<trainList.length;i++) {
			if(trainList[i] == null) {
				trainList[i] = train;
				break;
			}
		}
	}
	public void allList() {
		System.out.println("전체보기");
		for(int i=0;i<trainList.length;i++) {
			if(trainList[i] != null) {
				trainList[i].prt();
			}
		}
	}
	public void modify() {
		System.out.println("수정");
		String sTNum = in.nextLine();
		
		for(int i=0;i<trainList.length;i++) {
			if(trainList[i] != null) {
				if(sTNum.equals(trainList[i].trainNum) ) {
					String newTTime = in.nextLine();
					trainList[i].trainTime = newTTime;
				}
			}
		}
	}
}


















