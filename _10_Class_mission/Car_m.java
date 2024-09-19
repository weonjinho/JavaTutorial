package _10_Class_mission;

import java.util.Arrays;
import java.util.Scanner;

public class Car_m {
	Car_Obj[] carList = new Car_Obj[7]; // 7대 까지 등록 가능.
	Scanner in = new Scanner(System.in);
	Car_m(){
		while(true) {
			System.out.println("자동차 관리");
			System.out.println("1.등록");
			System.out.println("2.조회");
			System.out.println("3.삭제");
			System.out.println("4.전체보기");
			System.out.println(" 선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				select();
			}else if(selNum == 3) {
				delete();
			}else if(selNum == 4) {
				allList();
			}else {
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}
	public void add() {
		System.out.println("등록");
		Car_Obj car = new Car_Obj();
		System.out.println("차량 번호 입력");
		car.carNum = in.nextLine();
		System.out.println("소유자 정보 입력");
		car.ownerName = in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i] == null) {
				carList[i] = car;
				break;
			}
		}
	}
	public void select() {
		System.out.println("조회");
		System.out.println("조회할 차랑의 번호/소유자 이름를 입력하세요.");
		String selectInfo = in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i] != null) {
				if(!selectInfo.equals(carList[i].carNum) && !selectInfo.equals(carList[i].ownerName)) {
					continue;
				}else {
					carList[i].prt();
				}
		
			}
			
		}
	}
	public void delete() {
		System.out.println("삭제");
		System.out.println("삭제할 차랑의 번호/소유자 이름를 입력하세요.");
		String deleteInfo = in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i] != null) {
				if(!deleteInfo.equals(carList[i].carNum) && !deleteInfo.equals(carList[i].ownerName)) {
					continue;
				}else {
					carList[i].carNum = null;
					carList[i].ownerName = null;
				}
			}
		}
	}
	public void allList() {
		System.out.println("전체보기");
		for(int i=0;i<carList.length;i++) {
			if(carList[i] != null) {
				carList[i].prt();
			}
		}
	}
}
