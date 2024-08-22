package __0821_Lesson;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class miniProject02 {
	
    public static final String Reset = "\u001B[0m";
    public static final String Red = "\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Blue = "\u001B[34m";
    
	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("환영합니다.");
		System.out.println("몇명이서 진행하나요?(숫자 입력)");
		int userCnt = in.nextInt();
		in.nextLine();
		String[] userId = new String[userCnt]; // 아이디를 저장할 배열
		double[] userSpeed = new double[userCnt]; // 속도를 저장할 배열
		double[] userCorrect = new double[userCnt]; // 정확도를 저장할 배열
		int[] userPoint = new int[userCnt]; // 점수를 저장할 배열
		int[] scoreRankingList = new int[userCnt];	// 사용자 순서대로 입력된 변수의 배열.
		int[] scoreRankingCopy = new int[userCnt];
		
		for(int i = 0; i < userCnt; i++) {
			int score = 0; // 기본 점수
			int bScore = 0; // 보너스 점수
			int missCnt = 0; // 오답 카운트
			int txtMissCnt = 0;// 문제별 오타 카운트
			int totalScore = 0; // 총 점수
			String accTxt = ""; // 전체 텍스트 누적 변수.
			double questionCnt = 0;
			double accSpeed = 0;	// 소요시간 누적 변수.
			
			System.out.println((i+1) + "번째 ID를 입력해주세요");
			userId[i] = in.nextLine();
			String[] korArr = {
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
			};
			String[] signArr = new String[200];
			String sign = "~?!@#$%^&*()-_+=[]{}<>";
			String word2 = "";
			// 특수문자 배열에 집어넣기
			for(int j = 0; j < signArr.length; j++) {
				for(int k = 0; k < 3; k++) {
					word2 += sign.charAt(r.nextInt(sign.length()));
				}
				signArr[j] = word2;
				word2 = "";
			}
			for(int j = 0; j < 3; j++) {
				
				// 오답율 : 1-(오답 개수 / 전체 문제 객수)*100.
				
				String korWord = ""; // korArr에서 무작위로 받을 값
				String signWord = ""; // signArr에서 무작위로 받을 값
				String gameTxt = ""; // korWord + signWord
				// 원진호_추가_0822
				char errKorTxt = '0';	// 오답 한글.
				char errSignTxt = '0';	// 오답 특수문자.
				// -- 추가끝
				korWord = korArr[r.nextInt(korArr.length)];
				signWord = signArr[r.nextInt(signArr.length)];
				gameTxt = korWord + signWord;
				System.out.println(gameTxt);
				long beforeTime = System.currentTimeMillis();
				String userTxt = in.nextLine(); // 값을 입력받을 변수
				long afterTime = System.currentTimeMillis();
				long secDiffTime = (afterTime - beforeTime)/1000;
				String userKorTxt = ""; // 입력받은 값에 한글만 저장할 변수
				String userSignTxt = ""; // 입력받은 값에 특수문자만 저장할 변수
				questionCnt++;
				accSpeed += secDiffTime;	// 시간 차를 accSpeed에 저장.
				accTxt += gameTxt;
				// 원진호 작성 _20240821
				for(int k = 0; k < userTxt.length(); k++) {
					// m번째 글자가 아스키코드 값 127보다 작으면
					if(userTxt.charAt(k) < 127) {
						// 사용자가 입력한 특수문자 저장
						userSignTxt += userTxt.charAt(k);
					}else {
						// 사용자가 입력한 한글 저장.
						userKorTxt += userTxt.charAt(k);
//						errKorTxt = userTxt.charAt(k);
					}
				}
				if(korWord.equals(userKorTxt)) {
					score += 10;	// 한글 정답시 10점 추가.
				}else {
					// 원진호_0822_수정.
					for(int k = 0; k < korWord.length(); k++) {
						if(userKorTxt.charAt(k) != korWord.charAt(k)) {
							missCnt++;		// 오타 갯수 +1
							errKorTxt = korWord.charAt(k);
						}
					}
					for(int k = 0; k < signWord.length(); k++) {
						if(userSignTxt.charAt(k) == signWord.charAt(k)) {
							bScore++;		// 보너스 점수 +1
						}else {
							missCnt++;		// 오답 점수 +1
							errSignTxt = signWord.charAt(k);	
							System.out.println("errSignTxt:"+errSignTxt);
						}
					}
					score += 0;		// 오답시 0점.
					txtMissCnt++;
					// 원진호_0822_추가
					System.out.println(Red + errKorTxt + Reset); 
					System.out.println(Red + errSignTxt + Reset);
					// --- 추가 끝
				}
				userSpeed[i] = Math.round((accSpeed / questionCnt) * 1000) / 1000.0; // 소수점 3자리까지 끊어쓰기
				userCorrect[i] = Math.round(((1 - (double) missCnt / accTxt.length()) * 1000) * 1000) / 1000.0; // 소수점 3자리까지 끊어쓰기
				userPoint[i] =  score + bScore; // 추가로 타자속도와 정확도에 대한 점수 기준을 찾고 그것에 대해 점수 추가
				System.out.print("시간 : "+secDiffTime + "초 / ");
				System.out.print("오타 : " + txtMissCnt + "자 / ");
				System.out.print("점수 : "+ score);
				System.out.println();
				txtMissCnt=0;
			}
			totalScore = userPoint[i];
			System.out.println("타자속도 : " + userSpeed[i]);
			System.out.println("정확도 : " + userCorrect[i]);
			System.out.println("총 점수 : " + totalScore);
			System.out.println("총 오타 : " + missCnt + "자 / ");
			
			// 사용자별 총점수 저장 배열 추가 위치.(원)
			for(int n=i;n<totalScore;n++) {
				System.out.println("totalScore: "+totalScore);
				scoreRankingList[n] = totalScore;
				break;
			}
			System.out.println("scoreRankingList 입력여부 확인:"+Arrays.toString(scoreRankingList));
			// --- 추가끝
			for(int k=0;k<userCnt;k++) {
				scoreRankingCopy[k] = scoreRankingList[k];
			}
			System.out.println(Arrays.toString(scoreRankingCopy));
			int max = 0;
			for(int k=0;k<scoreRankingCopy.length;k++) {
				max = 0;
				for(int j=0;j<scoreRankingCopy.length-k;j++) {
					if(scoreRankingCopy[max]>scoreRankingCopy[j]) {
						max = j;
					}
				}
				System.out.println(scoreRankingCopy[max]);
				int temp = scoreRankingCopy[scoreRankingCopy.length-1-k];
				scoreRankingCopy[scoreRankingCopy.length-1-k]=scoreRankingCopy[max];
				scoreRankingCopy[max] = temp;
			}
			
		}
			
			System.out.println("scoreRankingList: "+Arrays.toString(scoreRankingList));
			System.out.println("scoreRankingCopy: "+Arrays.toString(scoreRankingCopy));
			int maxNum = 0;
			int maxIndex = 0;
			int x = 0;
			int[] indexArray = new int[userCnt];
			for(int k=0;k<scoreRankingCopy.length;k++) {
				if(maxNum < scoreRankingList[k]) {
					maxNum = scoreRankingList[k];
					maxIndex = k;
					System.out.println("maxNum:"+maxNum);
					System.out.println("maxIndex: "+maxIndex);
				}
				if(k==scoreRankingList.length-1) {
					indexArray[x] = maxIndex;
					x++;
					scoreRankingList[maxIndex]=0;
					maxNum=0;
					k= -1;
				}
				if(x==userCnt) {
					break;
				}
			}
			System.out.println("사용자 점수 순위:"+Arrays.toString(indexArray));
	}

}
