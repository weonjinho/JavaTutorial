package _10_Class_Ex_02;

import java.util.Scanner;

public class CarCenter {
	Scanner in = new Scanner(System.in);
	CarOne[] carList = new CarOne[7];
	public CarCenter() {
		// TODO Auto-generated constructor stub
		while(true) {
			menu();
			System.out.println("선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				modify();
			}else if(selNum == 3) {
				allList();
			}else {
				break;
			}
		}
	}
	public void menu() {
		System.out.println("1.등록");
		System.out.println("2.수정");
		System.out.println("3.전체보기");
		System.out.println("5.종료");
	}
	public void add() {
		//새로운 차를 만든다.
		//차에다 값을 저장한다.
		//차를 배열에 등록한다.
		CarOne car = new CarOne();
		System.out.println("등록할 차번호를 입력하세요.");
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
	public void allList() {
		//메소드의 정의는 정의가 구체적인것이 좋다.
		//carList배열 참조변수의 0번부터 순회하면서
		//저장된 주소값을 참조하여 carOne객체의 정보를 출력.
		for(int i=0;i<carList.length;i++) {
			if(carList[i] != null) {
				carList[i].prt();
			}
		}
	}
		public void modify() {
		//시나리오 정의
		//번호로 수정할 자동차 객체를 찾는다.
		//번호는 수정이 불가능 / 삭제만 할 수 있고, 소유자만 수정이 가능.
		System.out.println("수정할 차의 번호를 입력받는다.");
		String modNumber = in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i] != null) {
				if(carList[i].carNum.equals(modNumber)) {
					System.out.println("변경될 소유자의 이름을 입력");
					String newUser = in.nextLine();
					carList[i].carUser = newUser;
					break;
				}
			}
		}
	}
	
}













