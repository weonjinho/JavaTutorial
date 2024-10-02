package _16_Stack_mission;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMge {
	private int MAXSTUCNT = 10; 
	private ArrayList<TotalOne> tList = new ArrayList<TotalOne>();
	StuMge(){
		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("--- 학생관리 페이지 ---");
			System.out.println("1.학생 정보 등록");
			System.out.println("2.학생 정보 조회");
			System.out.println("3.학생 정보 삭제");
			System.out.println("선택 > ");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addStu();
			}else if(num == 2) {
				selStu();
			}else  if(num == 3){
				delStu();
			}else {
				break;
			}
		}
		
	}
	
	//등록기능
	private void addStu() {
		Scanner in = new Scanner(System.in);
		TotalOne t = new TotalOne();
		if(tList.size() >= MAXSTUCNT) {
			System.out.println("10명까지만 등록이 가능합니다.");
		}else {
			if(tList.size() >= 1 ) {
				System.out.println("등록할 학생의 아이디를 입력하세요. 1");
				String inputId = in.nextLine();
				for(int i=0;i<tList.size();i++) {
					if(inputId.equals(tList.get(i).getStuId())) {
						System.out.println("중복된 아이디입니다.");
						break;
					}else{
						System.out.println("중복 X");
						t.setStuId(inputId);
						System.out.println("등록할 학생의 이름를 입력하세요.");
						String inputName = in.nextLine();
						t.setStuName(inputName);
						System.out.println("등록할 학생의 전화번호를 입력하세요.");
						String inputTel = in.nextLine();
						t.setStuTel(inputTel);
						System.out.println("등록할 학생의 학년를 입력하세요.");
						String inputGrade = in.nextLine();
						t.setStuGrade(inputGrade);
						tList.add(t);
						break;
					}
				}
			}else {
				System.out.println("최초 학생");
				System.out.println("등록할 학생의 아이디를 입력하세요.");
				String inputId = in.nextLine();
				t.setStuId(inputId);
				System.out.println("등록할 학생의 이름를 입력하세요.");
				String inputName = in.nextLine();
				t.setStuName(inputName);
				System.out.println("등록할 학생의 전화번호를 입력하세요.");
				String inputTel = in.nextLine();
				t.setStuTel(inputTel);
				System.out.println("등록할 학생의 학년를 입력하세요.");
				String inputGrade = in.nextLine();
				t.setStuGrade(inputGrade);
				tList.add(t);
			}
		}

	}
	
	//검색 기능
	private void selStu() {
		Scanner in = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요.");
		String input = in.nextLine();
		char inputName = '0';
		String strName = null;
		for(int j=0;j<input.length();j++) {
			inputName = input.charAt(j);
			strName = String.valueOf(inputName);
			for(int i=0;i<tList.size();i++) {
				String chkName = tList.get(i).getStuName();
				if(chkName.contains(strName)) {
					System.out.println("중복 부분 있는 이름 : "+chkName);
				}
			}
		}
	}
	
	//삭제기능
	private void delStu() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 아이디을 입력하세요.");
		String del = in.nextLine();
		for(int i=0;i<tList.size();i++) {
			if(del.equals(tList.get(i).getStuId())) {
				tList.remove(i);
				break;
			}
		}
	}
}
