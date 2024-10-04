package _17_School;

import java.util.ArrayList;
import java.util.Scanner;

public class PartMge {
	private ArrayList<Part> pList = new ArrayList<>();
	PartMge(){
		
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.교과목 등록");
			System.out.println("2.전체 교과목 리스트 보기");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addPart();
			}else if(num == 2) {
				allPartList();
			}else {
				break;
			}
		}
	}
	private void addPart() {
		//교과목 등록
		Scanner in = new Scanner(System.in);
		Part p = new Part();
		System.out.println("등록할 과목명 입력");
		String name = in.nextLine();
		p.setPartName(name);
		System.out.println("등록할 강의실 입력");
		String room = in.nextLine();
		p.setClassName(room);
		System.out.println("등록할 교수님 이름 입력");
		String pName = in.nextLine();
		p.setPartPro(pName);
		pList.add(p);
	}
	private void allPartList() {
		//전체 교과목 리스트 보기
		for(int i=0;i<pList.size();i++) {
			pList.get(i).prt();
		}
	}
}
