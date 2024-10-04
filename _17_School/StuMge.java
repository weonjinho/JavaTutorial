package _17_School;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMge {
	private ArrayList<Stu> sList = new ArrayList<>();
	StuMge(){
		
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.학생 등록");
			System.out.println("2.학생 검색");
			System.out.println("3.학생 삭제");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addStu();
			}else if(num == 2) {
				searchStu();
			}else if(num == 3) {
				deleteStu();
			}else {
				break;
			}
		}
	}
	private void addStu() {
		//학생 등록
		Scanner in = new Scanner(System.in);
		Stu s = new Stu();
		System.out.println("학생 아이디 입력하세요.");
		String id = in.nextLine();
		s.setId(id);
		System.out.println("학생 이름을 입력하세요.");
		String name = in.nextLine();
		s.setName(name);
		System.out.println("학생의 전화번호를 입력하세요.");
		String tel = in.nextLine();
		s.setTel(tel);
		System.out.println("학생의 학년을 입력하세요.");
		int grade = in.nextInt();
		in.nextLine();
		s.setGrade(grade);
		
		sList.add(s);
	}
	private void searchStu() {
		//이름으로 학생 정보 검색
		Scanner in = new Scanner(System.in);
		System.out.println("검색할 학생의 이름을 입력하세요.");
		String name = in.nextLine();
		for(int i=0;i<sList.size();i++) {
			if(sList.get(i).getName().equals(name)) {
				sList.get(i).prt();
			}
		}
	}
	private void deleteStu() {
		//아이디로 학생 정보 삭제
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 학생의 아이디을 입력하세요.");
		String id = in.nextLine();
		for(int i=0;i<sList.size();i++) {
			if(sList.get(i).getId().equals(id)) {
				sList.remove(i);
			}
		}
	}
}


























