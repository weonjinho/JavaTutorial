package JavaProject_FlowerStore;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerMge {
	ArrayList<FlowerOne> fList = new ArrayList<>();
	FlowerMge(){
		menu();
	}
	private void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("--- 꽃 관리 메뉴 ---");
			System.out.println("1.꽃 등록");
			System.out.println("2.전체조회");
			System.out.println("3.개별조회");
			System.out.println("4.정보삭제");
			System.out.println("5.정보수정");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addFlower();
			}else if(selNum == 2) {
				allFlowerList();
			}else if(selNum == 3) {
				oneFlower();
			}else if(selNum == 4) {
				delFlower();
			}else if(selNum == 5) {
				modFlower();
			}else{
				break;
			}
		}
		
	}
	private void addFlower() { //최재환 --- 꽃 등록
		// TODO Auto-generated method stub
		FlowerOne flower = new FlowerOne();
		Scanner in = new Scanner(System.in);
		System.out.println("등록할 꽃의 이름을 입력하세요.");
		String inputName = in.nextLine();
		flower.setfName(inputName);
		
		System.out.println("등록할 꽃의 개화시기를 입력하세요.");
		String inputFSeason = in.nextLine();
		flower.setfSeason(inputFSeason);
		
		System.out.println("등록할 꽃의 품종를 입력하세요.");
		String inputFKind = in.nextLine();
		flower.setfKind(inputFKind);
		
		System.out.println("등록할 꽃의 소개글를 입력하세요.");
		String inputFIntro  = in.nextLine();
		flower.setfIntro(inputFIntro);
		
		System.out.println("오늘의 날짜를 입력하세요.");
		String inputToday = in.nextLine();
		flower.setToday(inputToday);
		
		System.out.println("등록할 꽃의 입고날짜를 입력하세요.");
		String inputFInDate = in.nextLine();
		flower.setInDate(inputFInDate);
		
		System.out.println("등록할 꽃의 화기를 입력하세요.");
		int inputFKeepDate = in.nextInt();
		in.nextLine();
		flower.setKeepDate(inputFKeepDate);
		// 페기날짜
		System.out.println("페기날짜");
		String newFDropDate = flower.dropDateCal(inputFInDate,  inputFKeepDate);
		System.out.println("newFDropDate: "+newFDropDate);
		flower.setDropDate(newFDropDate);
		
		fList.add(flower);
	}
	private void allFlowerList() { //최재환 --- 전체조회
		// TODO Auto-generated method stub
		for(FlowerOne f:fList) {
			f.prt();
		}
	}
	private void oneFlower() { //최재환 --- 개별조회
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("조회할 꽃의 이름을 입력하세요.");
		String inputFName = in.nextLine();
		int idx = findIdx(inputFName);
		if(idx != -1) {
			fList.get(idx).prt();
		}
	}
	private void delFlower() { //원진호 --- 정보삭제
		//입력 받은 꽃 이름을 기준으로 꽃 정보를 검색한다.
		Scanner in = new Scanner(System.in);
		String inputFName = in.nextLine(); 
		int idx = findIdx(inputFName);
		if(idx != -1) {
			fList.remove(idx);
		}
		
	}
	private void modFlower() { //원진호 --- 정보수정
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		System.out.println("수정할 꽃의 이름을 입력하세요.");
		String fName = in.nextLine();
		int idx = findIdx(fName);
		if(idx != -1) {
			System.out.println("수정할 꽃의 이름을 입력하세요.");
			String newFName = in.nextLine();
			fList.get(idx).setfName(newFName);
			
			System.out.println("수정할 꽃의 품종을 입력하세요.");
			String newFKind = in.nextLine();
			fList.get(idx).setfKind(newFKind);
			
			System.out.println("수정할 꽃의 설명글을 입력하세요.");
			String newFIntro = in.nextLine();
			fList.get(idx).setfIntro(newFIntro);
			
			System.out.println("수정할 꽃의 입고날짜 정보을 입력하세요.");
			String newFInDate = in.nextLine();
			fList.get(idx).setInDate(newFInDate);
			
			System.out.println("수정할 꽃의 회기을 입력하세요.");
			int newFKeepDate = in.nextInt();
			in.nextLine();
			fList.get(idx).setKeepDate(newFKeepDate);
			
		}
	}
	
	public void cntDropFlower( String InDate, String DropDate ) { //원진호 --- 패기 꽃 갯수 count.
		// 입고날짜 ---> 뒤 2자리 절삭 ---> 숫자로 전환 ---> int keepDay = inDay + 화기
		//		  ---> 앞 2자리 절삭 ---> 숫자로 전환 ---> int inMonth
		
		// 패기날짜 ---> 뒤 2자리 절삭 ---> 숫자로 전환 ---> int dropDay
		// 	      ---> 앞 2자로 절삭 ---> 숫자로 전환 ---> int dropMonth
		
		// 조건식 : inMonth == dropMonth ---> 조건식 : keepDay > dropDay ---> 패기 count + 1;
		
	}
	
	public int findIdx(String fName) { //원진호 --- 검색 메소드.
		for(int i=0;i<fList.size();i++) {
			if(fList.get(i).fName.equals(fName)) {
				return i;
			}
		}
		return -1;
	}
	
	
}
