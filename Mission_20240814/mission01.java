package Mission_20240814;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mission01 {

	public static void main(String[] args) {
//		0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		Scanner rr = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요: ");
//		int k = rr.nextInt();
//		rr.nextLine();
//		if(k%2==1) {
//			System.out.println("홀수입니다.");
//		}else {
//			System.out.println("짝수입니다.");
//		}
		
//		1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
//		System.out.println("첫번째 숫자 입력: ");
//		int firstNum = rr.nextInt();
//		rr.nextLine();
//		System.out.println("첫 수자:"+firstNum);
//		int secNum  = rr.nextInt();
//		rr.nextLine();
//		System.out.println("두번째: "+secNum);
//		int sum = firstNum+secNum;
//		System.out.println("합계: "+sum);
		
//		2. 행운의 숫자 인지를 판별해 보자
//		   1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
//		   이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		Random rNum = new Random();
//		int rNum1 = rNum.nextInt(100)+1;
//		System.out.println(rNum1);
//		if(rNum1%7==0) {
//			System.out.println("행운숫자");
//		}else {
//			System.out.println("조심해야하는 숫자");
//		}
		
		
//		3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
//		  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
//		 continue사용.
		for(int i=1;i>0;i++) {
			int rNum2 = rNum.nextInt(100)+1;
//			System.out.println("뽑은 숫자: "+rNum2);
			if(rNum2%7!=0) {
				continue;
			}else if(rNum2%7==0){
				System.out.println(i+"번째 실행후 나온 결과입니다.");
				System.out.println("행운숫자"+rNum2+"입니다.");
				break;	// 무한루프 방지.
			}
		}
		
		
//		4. . 숫자 10개를 저장할수 있는 배열을 만들고
//		   0부터 99숫자중 랜덤으로 10개를 뽑습니다.
//		   이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
//		  0번째 번호 98이라면   0번 인덱스에 저장
//		  1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
//		  2번째 번호 88이라면   2번  인덱스에 저장
//			int[] numbers = new int[10];
//			for(int i=0;i<numbers.length;i++) {
//				int rNum3 = rNum.nextInt(100);
//				if(rNum3%2!=0) {
//					continue;
//				}
//				numbers[i] = rNum3;
//				
//			}
//			System.out.println(Arrays.toString(numbers));
		
		
// --------------------------------------------------------------------------------
//			5.
//			로또번호를 자동으로 생성하는 게임을 작성하시오.
//			중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
//			Random r = new Random();
//			int[] lotto = new int[6];
//			for(int i=0;i<lotto.length;i++) {
//				int num = r.nextInt(45)+1;
//				lotto[i] = num;
//			}
//			System.out.println(Arrays.toString(lotto));
//			for(int i=0;i<lotto.length;i++) {
//				System.out.println("로또 번호: "+lotto[i]);
//			}
			
			
			
//			6. 
//			컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//			컴퓨터는 랜덤으로 로또 번호를 10번 뽑는다.
//			가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//			오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
//			int num=0;
//			int[] cntArray = new int[45];		// cnt값을 담을 배열 생성.
//			for(int i=0;i<10000;i++) {		
//				num = r.nextInt(45)+1;
//				cntArray[num-1]++;
//			}
//			int maxNum = 0;
//			int maxIndex = 0;
//			for(int i=0;i<cntArray.length;i++) {	// 45개 칸 중 최대값 찾기.
//				if(cntArray[i]>maxNum) {
//					maxNum = cntArray[i];
//					maxIndex = i+1;				// 로또번호==가장 큰 숫자의 index + 1
//				}
//			}
//			System.out.println(Arrays.toString(cntArray));
//			System.out.println(maxNum+" / "+maxIndex);
					
			
//			7. int jobTime ={40,32,4,16,5,8};
//			위 배열에서 인덱스를 사람의 번호로 가정한다.
//			jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
//			작업장을 사용할 수 있는 시간은 최대  4시간이다.
//			작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
//			다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
//			0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
//			실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
			
			
			
			
//			8.
//			// 배열 저장 변수
//					int[] lotto = new int[6];
//					// 키보드로 부터 입력받기 위한 객체 만들기.
//					Scanner in = new Scanner(System.in); // ctrl shift o
//					// 0번째 번호부터 로또 번호 입력받기
//					for (int i = 0; i < lotto.length; i++) {
//						System.out.println((i + 1) + "번 입력하세요");
//						int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
//						in.nextLine();  // 버퍼 지우기
//						lotto[i] = k;
//					}
//					// 로또 번호를 출력하는 반복문
//					for (int i = 0; i < lotto.length; i++) {
//						if (i == lotto.length - 1) { // 마지막 번호
//							System.out.println("보너스 : " + lotto[i]);
//						} else {
//							System.out.println(lotto[i]);
//						}
//					}
//
//			위 코드에 1-45숫자를 벗어난 숫자를 입력하면
//			범위 오류라고 출력하고 다시 번호를 입력할 수 있도록 수정하세요.
			
//			continue;
			Scanner in = new Scanner(System.in);
//			int[] lotto4 = new int[6];
//			int k=1;
//			for(int i=0;i<lotto4.length;i++) {
//				System.out.println((i+1)+"번 입력하세요.3");
//				k=in.nextInt();	
//				if(k<1 || k>45) {
//					System.out.println("범위 초과입니다.");
//					System.out.println((i+1)+"번 입력하세요.");
//					continue;
//				}
//				System.out.println((i+1)+"번 입력하세요.2");
//			}
	
//			int[] lottoNum = new int[6];
//			for(int i=0;i<lottoNum.length;i++) {
//				System.out.println((i+1)+"번 입력하세요.");
//				int k = in.nextInt();
//				in.nextLine();
//				if(k<1 || k>45) {
//					System.out.println("범위 초과입니다.");
//					i=i-1;
//					continue;
//				}
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}