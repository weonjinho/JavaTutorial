package School;

import java.util.ArrayList;
import java.util.Scanner;

// 교과목 관리 추상화 클래스
public class PartMge {
	
	private ArrayList<Part> plist = new ArrayList<>();
	//setter 필요없음.
	
	public ArrayList<Part> getPlist() {
		return plist;
	}
	
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록");
			System.out.println("3.전체보기");
			int selNum =in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				list();
			}else{
				break;
			}
		}
		
	}
	

	public void add() {
		//과목 등록.
		Scanner in = new Scanner(System.in);
		Part newTemp = new Part();
		System.out.println("과목명 입력");
		String partName = in.nextLine();
		newTemp.setPartName(partName);

		plist.add(newTemp);
	}
	public void list() {
		//전체 과목 리스트 보기.
		for(int i=0;i<plist.size();i++) {
			plist.get(i).prt();
		}
	}
}
