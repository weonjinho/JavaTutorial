package _10_Class_240923_level2;

import java.util.Scanner;

public class TotalMain {
	CustomerList[] cArray = new CustomerList[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("사용할 프로그램을 선택하세요.");
		System.out.println("1.고객관리 프로그램");
		System.out.println("2.이벤트 관리 프로그램");
		int selNum = in.nextInt();
		in.nextLine();
		if(selNum == 1) {
			cList();
		}else if(selNum == 2){
			eList();
		}else {
			System.out.println("다시 입력하세요.");
		}
		
	}
	

	public static void cList() {
		System.out.println("--- 고객 관리 프로그램 ---");
		CustomerList c = new CustomerList();
	}
	public static void eList() {
		System.out.println("--- 이벤트 관리 프로그램 ---");
		EventList e = new EventList();
	}




	

}
;
