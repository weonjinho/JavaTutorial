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
	
	//꽃 등록 메소드
	private void addFlower() { 
		FlowerOne flower = new FlowerOne();
		Scanner in = new Scanner(System.in);
		//꿏 이름
		String inputName = null;
		while(true) {
			System.out.println("등록할 꽃의 이름을 입력하세요.");
			inputName = in.nextLine();
			if(inputName.length() == 0) {
				System.out.println("꽃의 꽃의 이름은 비여있을수 없습니다.");
			}else {
				flower.setfName(inputName);
				break;
			}
		}
		
		
		//개화시기
		String inputFSeason = null;
		while(true) {
			System.out.println("등록할 꽃의 개화시기를 입력하세요.");
			inputFSeason = in.nextLine();
			if(inputFSeason.length() == 0) {
				System.out.println("꽃의 꽃의 개화시기는 비여있을수 없습니다.");
			}else {
				flower.setfSeason(inputFSeason);
				break;
			}
		}
		

		//품종
		String inputFKind = null;
		while(true) {
			System.out.println("등록할 꽃의 품종를 입력하세요.");
			inputFKind = in.nextLine();
			if(inputFKind.length() == 0) {
				System.out.println("꽃의 품종은 비여있을수 없습니다.");
			}else {
				flower.setfKind(inputFKind);
				break;
			}
		}
		

		//꽃 소개글
		String inputFIntro = null;
		while(true) {
			System.out.println("등록할 꽃의 소개글를 입력하세요.");
			inputFIntro  = in.nextLine();
			if(inputFIntro.length() == 0) {
				System.out.println("소개글을 비여있을수 없습니다.");
			}else {
				flower.setfIntro(inputFIntro);
				break;
			}
		}
		
		
		//입고날짜
		String inputFInDate = null;
		while(true) {
			System.out.println("꽃의 입고날짜 정보을 입력하세요.(예:0927)");
			inputFInDate = in.nextLine();
			if(inputFInDate.length() == 0 || inputFInDate.length() != 4) {
				System.out.println("다시 날짜를 4자리로 입력하세요.");
			}else {
				flower.setInDate(inputFInDate);
				break;
			}
		}
		
		
		//화기(유효기간)
		int inputFKeepDate = 0;
		while(true) {
			System.out.println("등록할 꽃의 화기를 입력하세요.(1~30일까지 입력가능.)");
			inputFKeepDate = in.nextInt();
			in.nextLine();
			if(inputFKeepDate <= 0 && inputFKeepDate > 30) {
				System.out.println("화기를 다시입력하세요.");
			}else {
				flower.setKeepDate(inputFKeepDate);
				break;
			}
		}

		//현재날짜
		String nowDate = flower.calNowDate();
		System.out.println("오늘 날짜: "+nowDate);
		flower.setToday(nowDate);
		
		
		//페기날짜
		String newFDropDate = flower.dropDateCal(inputFInDate,  inputFKeepDate);
		System.out.println("등록한 날짜: "+inputFInDate);
		System.out.println("유효기간: "+inputFKeepDate);
		System.out.println("페기날짜: "+newFDropDate);
		flower.setDropDate(newFDropDate);
		
		
		//페기할 꽃의 갯수
		int cntTrashFlower = flower.calTrashFlower(nowDate, newFDropDate);//페기할 꽃 count.
		System.out.println("페기할 꽃의 갯수: "+ cntTrashFlower);
		flower.setTrashFlower(cntTrashFlower);
		
		
		//재고수량
		int inputFStock = 0;
		while(true) {
			inputFStock=flower.stockNum(flower.fStock, cntTrashFlower);
			System.out.println("현재 재고 수량입니다.: "+inputFStock);
			flower.setfStock(inputFStock);
			break;
		}
		
		
		//배열의 저장.
		fList.add(flower);
	}
	
	//전체조회 메소드
	private void allFlowerList() { 
		for(FlowerOne f:fList) {
			f.prt();
		}
	}
	
	//개별조회 메소드
	private void oneFlower() { 
		Scanner in = new Scanner(System.in);
		System.out.println("조회할 꽃의 이름을 입력하세요.");
		String inputFName = in.nextLine();
		int idx = findIdx(inputFName);
		if(idx != -1) {
			fList.get(idx).prt();
		}
	}
	
	//정보삭제 메소드
	private void delFlower() { 
		//입력 받은 꽃 이름을 기준으로 꽃 정보를 검색한다.
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 꽃 이름을 입력하세요.");
		String inputFName = in.nextLine(); 
		int idx = findIdx(inputFName);
		if(idx != -1) {
			fList.remove(idx);
		}
	}
	
	//정보수정 메소드
	private void modFlower() { 
		Scanner in = new Scanner(System.in);
		FlowerOne flower = new FlowerOne();
		System.out.println("수정할 꽃의 이름을 입력하세요.");
		String fName = in.nextLine();
		int idx = findIdx(fName);
		if(idx != -1) {
			String newFName = null;
			while(true){
				System.out.println("수정된 꽃의 이름을 입력하세요.");
				newFName = in.nextLine();
				if(newFName.length() == 0) {
					System.out.println("이름 수정은 넘기셨습니다.");
					break;
				}else {
					fList.get(idx).setfName(newFName);
					break;
				}
			}
			
			String newFKind = null;
			while(true) {
				System.out.println("수정된 꽃의 품종을 입력하세요.");
				newFKind = in.nextLine();
				if(newFKind.length() == 0) {
					System.out.println("꽃의 품종는 넘기셨습니다.");
					break;
				}else {
					fList.get(idx).setfKind(newFKind);
					break;
				}
			}
			
			String newFIntro = null;
			while(true) {
				System.out.println("수정된 꽃의 설명글을 입력하세요.");
				newFIntro = in.nextLine();
				if(newFIntro.length() == 0) {
					System.out.println("꽃의 설명글 수정을 넘기셨습니다.");
					break;
				}else {
					fList.get(idx).setfIntro(newFIntro);
					break;
				}
			}

			String newFInDate = null;
			while(true) {
				System.out.println("수정된 꽃의 입고날짜 정보을 입력하세요.(예:0927)");
				newFInDate = in.nextLine();
				if(newFInDate.length() == 0 || newFInDate.length() != 4) {
					System.out.println("다시 날짜를 4자리로 입력하세요.");
				}else {
					fList.get(idx).setInDate(newFInDate);
					break;
				}
			}
			
			int newFKeepDate = 0;
			while(true) {
				System.out.println("수정된 꽃의 회기을 입력하세요.");
				newFKeepDate = in.nextInt();
				in.nextLine();
				if(newFKeepDate == 0) {
					System.out.println("회기는 수정을 넘기셨습니다.");
					break;
				}else {
					fList.get(idx).setKeepDate(newFKeepDate);
					break;
				}
			}
			String newFDropDate = flower.dropDateCal(newFInDate,  newFKeepDate);
			System.out.println("등록한 날짜: "+newFInDate);
			System.out.println("유효기간: "+newFKeepDate);
			System.out.println("페기날짜: "+newFDropDate);
			fList.get(idx).setDropDate(newFDropDate);
			
		}
	}

	//검색 메소드
	public int findIdx(String fName) { 
		for(int i=0;i<fList.size();i++) {
			if(fList.get(i).fName.equals(fName)) {
				return i;
			}
		}
		return -1;
	}
	
	
}
