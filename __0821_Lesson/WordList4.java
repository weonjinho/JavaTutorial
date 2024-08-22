package __0821_Lesson;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordList4 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("몇 분에서 플레이 하시겠습니까?");
		int userCnt = sc.nextInt();
		String[] userArray = new String[userCnt];
		int[] userPoint = new int[userCnt];
		sc.nextLine();
		int roundPointCnt = 0;
		for(int q=0;q<userCnt;q++) {
			System.out.println("id를 입력하세요.");
			String uid = sc.nextLine();
			userArray[q] = uid;
			System.out.println(uid+" 님 환영합니다.");
			System.out.println("게임 진행을 원하면 Enter를 누르세요.");
			sc.nextLine();
			// 한글 단어 리스트:
			for(int j = 0; j < 3; j++) {
				String[] wordList = {
						"연못", "강물", "해변", "고요", "바위", "은하수", "산길", "낙엽", "그림자", "사랑",
						"파랑", "노래", "봄바람", "눈꽃", "별빛", "바람결", "햇빛", "하얀", "푸른", "가슴",
						"달빛", "비밀", "가로등", "기억", "연기", "파도", "은빛", "물결", "바다", "나뭇잎",
						"낮", "구름", "길", "여울", "초록", "흰", "노을", "나비", "산책", "아침",
						"빛", "별", "하늘", "가을", "겨울", "봄", "여름", "밤하늘", "꿈", "기다림",
						"추억", "소리", "시간", "달", "하루", "웃음", "돌", "새", "작은", "낮잠",
						"바람", "눈물", "희망", "봄꽃", "고양이", "나무", "햇살", "미소", "초원", "바다새",
						"은하", "무지개", "고요함", "동산", "별님", "달님", "바람개비", "푸르름", "햇빛", "구름사이",
						"여명", "파도소리", "바다빛", "산등성", "고갯길", "아지랑이", "낙조", "별똥별", "해돋이", "산새",
						"풀잎", "꽃향기", "숲속", "돌담", "해오라기", "비바람", "가로수", "석양", "고향", "산들바람",
						"햇살밭", "꽃길", "고드름", "이슬", "바람꽃", "산골", "은빛", "모래사장", "물방울", "새소리",
						"강가", "별무리", "구름다리", "달빛사이", "은하수길", "고요한밤", "하얀구름", "푸른하늘", "햇살길", "아침햇살",
						"이른아침", "구름산", "바람소리", "달그림자", "물안개", "숲속길", "바람결", "고요한산", "별나라", "강둑",
						"작은섬", "바람산", "고요한숲", "햇살속", "별빛길", "나무숲", "바다길", "푸른산", "파란하늘", "구름바람",
						"고요한강", "별빛바람", "산속길", "달빛산", "바다속", "은빛파도", "구름사이길", "별빛속", "바람길", "산속물결",
						"고요한바다", "햇빛숲", "푸른초원", "바람숲", "구름숲", "달빛길", "바람길사이", "햇살속길", "산속고요", "강물소리",
						"푸른바람", "고요한바람", "별빛사이길", "구름사이바람", "바다속길", "햇빛속바람", "고요한길", "은빛길", "푸른숲길", "별빛고요",
						"달빛고요", "산속길사이", "구름속바람", "햇살고요", "별빛속길", "달빛속길", "고요한은빛길", "바람속고요", "산속바람결", "푸른바람길"
				}; // 길이: 180
				
				// 인덱스 값으로 사용할 랜던 숫자 생성.
				int rIndex = r.nextInt(wordList.length-1);
				String word1Before = wordList[rIndex];	// 결합할 문자열의 한글 부분. (랜던으로 가져온 문자.)
				System.out.println("연습 문자: "+word1Before);
				// 입력전 시간 받아오기.
				long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
				// 사용자 입력.
				String userInputTxt = sc.nextLine();	// 사용자가 입력한 내용.(한글+특수문자)
				// 입력후 시간 받아오기.
				long afterTime = System.currentTimeMillis();
				long secDiffTime = (afterTime - beforeTime)/1000;
				System.out.println("입력시간(s) : "+secDiffTime);
				String koreanPart = "";					// 사용자 입력 한글 문자열 저장 변수. 
				String sign = "";						// 사용자 입력 특문 문자열 저장 변수.
				int bonusPointCnt = 0;
				int pointCnt = 0;
				System.out.println(ANSI_RED+word1Before+ ANSI_RESET);
				// 한글과 특수문자 분리.
				for(int i=0;i<userInputTxt.length();i++) {
					char text=userInputTxt.charAt(i);
					if((int)text < 127) {
						sign += text;			// 사용자 입력 특수문자 저장.
						System.out.println(ANSI_RED+sign+ ANSI_RESET);
//						if(sign.equals(word2Before)) {				// 정답일때.
////							pointCnt=5;	
//							signPointCnt += (sign.length())*1;
//							pointCnt = signPointCnt;
//							System.out.println(bonusPointCnt);
//						}else {										// 오답일때.
////							pointCnt=0;
//							for(int w=0;w<word2Before.length();w+=) {
//								
//							}
//						}
					}else {
						koreanPart += text;		// 사용자 입력  한글 저장.
						if(koreanPart.equals(word1Before)) {		// 정답일때.
							pointCnt=5;	
						}else {										// 오답일때.
							pointCnt=0;
						}
					}
				}
				// 오타가 존제 여부를 기준으로 점수 측정.
				// 오타 >=1, 이 문제에 점수는 0점.
				
		
				userPoint[q] += pointCnt;				// 문자당 정답시 받는 점수.
				System.out.println("획득 점수: "+pointCnt+" 점");
				System.out.println(userArray[q]+" 님의 총 확득 점수: "+userPoint[q]);
				System.out.println();
			}
			System.out.println("******* 다음 플레이어 차례입니다. *******");
			System.out.println();
		}
	}

}
