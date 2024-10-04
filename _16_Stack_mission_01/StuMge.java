package _16_Stack_mission_01;

import java.util.ArrayList;
import java.util.Scanner;


public class StuMge {
	private int MAXSTUCNT = 10; 
	private ArrayList<JoinOne> jList = new ArrayList<JoinOne>();
	StuMge(){
		menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.학생 등록");
			System.out.println("2.학생 조회");
			System.out.println("3.학생 삭제");
			System.out.println("4.뒤로가기");
			System.out.println("선택 >");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addStu();
			}else if(num == 2) {
				selStu();
			}else if(num == 3) {
				delStu();
			}else {
				break;
			}
		}
	}
	private void addStu() {
		Scanner in = new Scanner(System.in);
		JoinOne j = new JoinOne();
		if(jList.size() >= MAXSTUCNT) {
			System.out.println("10명까지만 등록이 가능합니다.");
		}else {
			if(jList.size() >= 1) {
				System.out.println("등록할 학생의 아이디를 입력하세요.");
				String inputId = in.nextLine();
				for(int i=0;i<jList.size();i++) {
					if(inputId.equals(jList.get(i).getId())) {
						System.out.println("중복된 아이디입니다.");
						break;
					}else {
						System.out.println("중복 없음.");
						j.setId(inputId);
						System.out.println("등록할 학생의 이름을 입력하세요.");
						String inputName = in.nextLine();
						j.setName(inputName);
						System.out.println("등록할 학생의 전화번호를 입력하세요.");
						String inputTel = in.nextLine();
						j.setTel(inputTel);
						System.out.println("등록할 학생의 학년을 입력하세요.");
						String inputGrade = in.nextLine();
						j.setGrade(inputGrade);
						jList.add(j);
						break;
					}
				}
			}else {
				System.out.println("최초 학생");
				System.out.println("등록할 학생의 아이디를 입력하세요.");
				String inputId = in.nextLine();
				j.setId(inputId);
				System.out.println("등록할 학생의 이름을 입력하세요.");
				String inputName = in.nextLine();
				j.setName(inputName);
				System.out.println("등록할 학생의 전화번호를 입력하세요.");
				String inputTel = in.nextLine();
				j.setTel(inputTel);
				System.out.println("등록할 학생의 학년을 입력하세요.");
				String inputGrade = in.nextLine();
				j.setGrade(inputGrade);
				jList.add(j);
			}
		}
	}
	private void selStu() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("검색할 학생 이름을 입력하세요.");
		String input= in.nextLine();
		char inputName = '0';
		String strName = null;
		for(int i=0;i<input.length();i++) {
			inputName = input.charAt(i);
			strName = String.valueOf(inputName);
			for(int j=0;j<jList.size();j++) {
				String chkName = jList.get(i).getName();
				if(chkName.contains(strName)) {
					System.out.println("중복 부분이 있는 학생 이름: "+chkName);
				}
			}
		}
	}

	private void delStu() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 학생의 아이디을 입력하세요.");
		String del = in.nextLine();
		for(int i=0;i<jList.size();i++) {
			if(del.equals(jList.get(i).getId())) {
				jList.remove(i);
				break;
			}
		}
	}
}
