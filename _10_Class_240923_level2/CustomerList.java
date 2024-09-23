package _10_Class_240923_level2;

import java.util.Scanner;

import _10_Class_240923_level1.CustomerInfo;

public class CustomerList {
	Scanner in = new Scanner(System.in);
	CustomerInfo[] cInfoList = new CustomerInfo[5];
	public CustomerList() {
		while(true) {
			System.out.println("1.고객가입");
			System.out.println("2.정보보기");
			System.out.println("3.정보수정");
			System.out.println("4.정보삭제");
			System.out.println("5.시작 메뉴로 돌아가기");
			System.out.println("선택 > ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addInfo();
			}else if(selNum == 2) {
				allList();
			}else if(selNum == 3) {
				modInfo();
			}else if(selNum == 4) {
				delInfo();
			}else if(selNum == 5) {
				TotalMain emain = new TotalMain();
				emain.main(null);
			}else {
				break;
			}
		}
	}

	private void addInfo() {
		CustomerInfo cInfo = new CustomerInfo();
		System.out.println("가입하실 고객 아이디 입력하세요.");
		cInfo.setcId(in.nextLine()) ;
		System.out.println("고객 이름 입력하세요.");
		cInfo.setcName(in.nextLine());
		for(int i=0;i<cInfoList.length;i++) {
			if(cInfoList[i] == null) {
				cInfoList[i] = cInfo;
				break;
			}
		}
	}
	private void allList() {
		for(int i=0;i<cInfoList.length;i++) {
			if(cInfoList[i] != null) {
				cInfoList[i].prt();
			}
		}
	}
	private void modInfo() {
		//회원 이아디를 찾하서 회원 이름을 수정할 수 있게 할 생각입니다.
		for(int i=0;i<cInfoList.length;i++) {
			if(cInfoList[i] != null) {
				System.out.println("수정할 고객의 아이디 정보를 업력하세요.");
				String inputId = in.nextLine();
				if(inputId.equals(cInfoList[i].getcId())) {
					System.out.println("수정하실 이름을 입력하세요.");
					String newName = in.nextLine();
//					cInfoList[i].cName = newName;
					cInfoList[i].setcName(newName); //newName을 매개변수로 값을 setcName()메소드에 전달한다.
					break;
				}
			}
		}
	}
	private void delInfo() {
		//회원 아이디로 삭제할 회원의 정보를 찾는다.
		//그 회원에 정보에 주소값을 null로 바꾼다.
		for(int i=0;i<cInfoList.length;i++) {
			if(cInfoList[i] != null) {
				System.out.println("삭제할 회원의 아이디를 입력하세요.");
				String delId = in.nextLine();
				if(delId.equals(cInfoList[i].getcId())) {
					cInfoList[i] = null;
					break;
				}
			}
		}
	}
}
