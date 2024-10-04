package School;

import java.util.ArrayList;
import java.util.Scanner;

//클래스 추상화 : 요구사항의 학생을 멤버변수와 메소드로 정의.
public class Stu {
	//멤버변수 선언 : 아이디, 이름, 전화번호, 학년
	private String id = null;
	private String name = null;
	private String tel = null;
	private int grade = -1;
	
	private ArrayList<Part> myList = new ArrayList<>();
	private PartMge partMge = null;
	
	
	public void menu(PartMge pmge) {
		partMge = pmge;
		Scanner in = new Scanner(System.in);
		while(true) {
			//수강신청은 학생이 하는게 맞다.
			System.out.println("1.수강신청");
			//"신청목록"고 한명의 학생의 신청목록입니다.
			System.out.println("2.신청목록");
			int selNum =in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				list();
			}else {
				break;
			}
		}
	}
	
	
	private void add() {
		Scanner in = new Scanner(System.in);
		//교과목의 리스트를 보여줘야 하는데, 이 리스트는 PartMge에 있음.
		ArrayList<Part> getList = partMge.getPlist();
		for(int i=0;i<getList.size();i++) {
			System.out.println("과목번호 : "+i);
			getList.get(i).prt();
		}
		System.out.println("번호선택");
		int choiceNum = in.nextInt();
		in.nextLine();
//		myList.add(getList.gt(ChoiceNum));
	}


	private void list() {
		// TODO Auto-generated method stub
		for(int i=0;i<myList.size();i++) {
			myList.get(i).prt();
		}
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void prt() {
		System.out.println(id);
		System.out.println(name);
	}
	
	
	
}
