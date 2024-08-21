package __0821_Lesson;

import java.util.Scanner;

public class Mini_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("전: "+beforeTime);
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		System.out.println("입력하세요.");
		String a = sc.nextLine();
		System.out.println(a);
		    
//		System.out.println("후:"+afterTime);
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println("시간차이(m) : "+secDiffTime);
		
		
	}

}
