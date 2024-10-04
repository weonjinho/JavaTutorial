package School;

import java.util.ArrayList;
import java.util.Scanner;

//추상화 : 요구사항에서 학생을 관리하는 내용을 추상화.
public class StuMge {
	private ArrayList<Stu> slist = new ArrayList<>();
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.전체보기");
			System.out.println("4.삭제");
			int selNum =in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 3) {
				list();
			}else if(selNum == 4) {
				delete();
			}else {
				break;
			}
		}
		
	}
	private void list() {
		//전체 학생 리스트 보기.
		for(int i=0;i<slist.size();i++) {
			slist.get(i).prt();
		}
	}
	private void add() {
		//학생 등록.
		Scanner in = new Scanner(System.in);
		Stu newTemp = new Stu();
		System.out.println("아이디 입력");
		String id = in.nextLine();
		int resultValue = findID(id);
		if(resultValue == -1) {
			newTemp.setId(id);
			System.out.println("이름 입력");
			String name = in.nextLine();
			newTemp.setName(name);
			slist.add(newTemp);
		}else {
			System.out.println(id+" 는 사용중");
		}
	}
	
	private void search() {
		//학생 이름으로 검색.
		
	}
	
	
	//아이디를 검색하는 메소드.
//	private ? findID( ? ){
	private int findID(String d) {
		for(int i=0;i<slist.size();i++) {
			if(slist.get(i).getId().equals(d)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public Stu loginID(String id) {
		int idx = findID(id);
		if(idx != -1) {
			return slist.get(idx);
		}
		return null;
	}
	
	
	
	
	private void delete() {
		//학생 아이디로 삭제.
		Scanner in = new Scanner(System.in);
		System.out.println("삭제 아이디 입력");
		String delId = in.nextLine();
		int returnValue = findID(delId);
		//for문은 id를 찾는 반복문.
		//아이디를 찾는 다는 것은. 검색이나 입력해서도 응용할 수 있다.
		//그래서 이 코드의 재사용성을 높이기 위해서 메소드 분리.
		if(returnValue != -1) {
			System.out.println("일치한 값 있음.");
			slist.remove(returnValue);
			System.out.println("삭제 됨");
		}
	}
}
