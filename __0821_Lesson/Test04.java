package __0821_Lesson;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sign = "!@#$%^&*";
		String word1b = "진호";
		String word2b = "!@#$";
		String word1a = "";
		String word2a = "";
		String gameWorld = word1b + word2b;
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		// 구분 완료.
		System.out.println(word2a);
		char text = '0';
		for(int i=0;i<answer.length();i++) {
			text = answer.charAt(i);
			if((int)text<127) {
				word2a += text;
			}else {
				word1a += text;
			}
		}
		System.out.println(word2a);
		System.out.println(word1a);
		
		
		
	}

}
