package _13_ArrayList_mission_javaWord;

import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
	ArrayList<WordOne> wList = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	WordList(){
		while(true) {
			System.out.println("1.단어등록");
			System.out.println("2.전체조회");
			System.out.println("3.단어삭제");
			System.out.println("4.단어수정");
			System.out.println("선택 > ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addWord();
			}else if(selNum == 2) {
				allWordList();
			}else if(selNum == 3) {
				delWord();
			}else if(selNum == 4) {
				modWord();
			}else {
				break;
			}
		}
	}
	
	
	private void addWord() {
		//새로운 영단어 & 한글단어 추가.
		WordOne word = new WordOne();
		System.out.println("새로 추가할 영단어를 업력하세요.");
		String newEngWord = in.nextLine();
		word.engWord = newEngWord;
		System.out.println("새로 추가할 한글단어를 업력하세요.");
		String newKorWord = in.nextLine();
		word.korWord = newKorWord;
		//추가기능:
		//원하는 위치에 단어 추가하기 기능.
		//기존 모든 단어 리스트를 보여준다.
		//어디다 추가할 인텍스 값을 입력받는다.
		//add(index,word);
		if(wList.size() == 0) {
			wList.add(word);
			System.out.println("--- 현재 단어 리스트 ---");
			allWordList();
		}else if(wList.size() > 0){
			System.out.println("추가할 위치를 지정할 수 있습니다.");
			System.out.println("원하시는 인덱스 변호를 입려하세요. (0부터 시작)");
			int addIndex = in.nextInt();
			in.nextLine();
			wList.add(addIndex, word);
		}
		
	}
	private void allWordList() {
		//전체보기
		for(int i=0;i<wList.size();i++) {
			wList.get(i).prt();
		}
	}
	private void delWord() {
		//영어단어로 단어삭제.
		System.out.println("삭제할 단어의 영어단어를 입력하세요.");
		String delEngWord = in.nextLine();
		for(int i=0;i<wList.size();i++) {
			if(wList.get(i).engWord.equals(delEngWord) ) {
				String a = wList.get(i).engWord;
				wList.remove(i); //영어,한글 단어 모두삭제.
				System.out.println(a+" 삭제완료!");
			}
		}
	}
	private void modWord() {
		//영어단어로 단어수정.
		System.out.println("수정할 단어의 영어단어를 입력하세요.");
		String modEngWord = in.nextLine();
		for(int i=0;i<wList.size();i++) {
			if(wList.get(i).engWord.equals(modEngWord)) {
				//수정 후 영어단어 & 한글단어를 입력 받는다.
				System.out.println("수정 후 새로운 영어단어를 입력하세요.");
				String modNewEngWord = in.nextLine();
				wList.get(i).engWord = modNewEngWord;
				System.out.println("수정 후 새로운 한글단어를 입력하세요.");
				String modNewKorWord = in.nextLine();
				wList.get(i).korWord = modNewKorWord;
				break;
			}
		}
	}
}













