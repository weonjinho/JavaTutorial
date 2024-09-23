package _10_Class_240923_level2;

import java.util.Scanner;

public class EventList {
	
	Scanner in = new Scanner(System.in);
	EventInfo[] eList = new EventInfo[5];
	public EventList() {
		// TODO Auto-generated constructor stub
		while(true) {
			System.out.println("1.이벤트 등록");
			System.out.println("2.이벤트 전체보기");
			System.out.println("3.시작 메뉴로 돌아가기");
			System.out.println("선택 >");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				eAdd();
			}else if(selNum == 2) {
				eAllList();
			}else if(selNum == 3) {
				TotalMain emain = new TotalMain();
				emain.main(null);
			}else {
				break;
			}
		}
	}

	private void eAllList() {
		// TODO Auto-generated method stub
		for(int i=0;i<eList.length;i++) {
			if(eList[i] != null) {
				eList[i].ePrt();
			}
		}
	}

	private void eAdd() {
		// TODO Auto-generated method stub
		EventInfo event = new EventInfo();
		System.out.println("등록할 이벤트 제목를 입력하세요.");
//		event.eTitle = in.nextLine();
		event.seteTitle(in.nextLine());
		System.out.println("등록할 이벤트 내용를 입력하세요.");
//		event.eContent = in.nextLine();
		event.seteContent(in.nextLine());
		for(int i=0;i<eList.length;i++) {
			if(eList[i] == null) {
				eList[i] = event;
				break;
			}
		}
	}
}
