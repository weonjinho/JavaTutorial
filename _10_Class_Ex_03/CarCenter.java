package _10_Class_Ex_03;

import java.util.Scanner;

public class CarCenter {
	Scanner in = new Scanner(System.in);
	CarOne[] carList = new CarOne[7];
	CarCenter(){
		while(true) {
			menu();
			System.out.println("매뉴 입력");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				select();
			}else if(selNum == 3) {
				allList();
			}else if(selNum == 4) {
				delete();
			}
		}
	}
	public void menu() {
		System.out.println("1.등록");
		System.out.println("2.조회");
		System.out.println("3.전체보기");
		System.out.println("4.삭제");
	}
	public void add() {
		CarOne car = new CarOne();
		System.out.println("등록할 차 번호를 입력하세요.");
		car.carNum = in.nextLine();
		System.out.println("등록할 소유자 이름을 입력하세요.");
		car.carUser = in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i] == null) {
				carList[i] = car;
				break;
			}
		}
	}
	public void select() {
		//차 번호로 소유자 이름 조회.
		System.out.println("조회할 차 번호를 입력하세요.");
		String inputCNum = in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i] != null) {
				if(inputCNum.equals(carList[i].carNum)) {
					carList[i].prt();
				}
			}
		}
	}
	public void allList() {
		for(int i=0;i<carList.length;i++) {
			if(carList[i] != null) {
				carList[i].prt();
			}
		}
	}
	public void delete() {
		
	}
}
