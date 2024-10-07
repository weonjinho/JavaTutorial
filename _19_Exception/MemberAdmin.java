package _19_Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Day05_240809.file_01;

public class MemberAdmin {
	MemberOne[] m = new MemberOne[5];
	
	MemberAdmin(){
//		System.out.println(m[0]);//null ---> 정상 실행됨.
//		System.out.println(m[1].getId());//NullPointerException 예외 발생.
//		System.out.println(m[2]);//예외 발생한 부분 아래 코드 실행 안됨.
		test();
	}
	private void test() {
		File file = new File("Output.txt");
		FileWriter writer;
		try {
			//try불록은 예외가 발생할 코드르 작성한다. ***
			//예외가 발생하면 더 이상 코드를 실행하지 않고 catch불록으로 이동한다.
			writer = new FileWriter(file);
		} catch (IOException e) {
			//catch 소괄호안의 예외가 발생했을 때 처리해 주는 불록. ***
			e.printStackTrace();
		} finally {
			//try 구문을 빠져 나갈때 실행됨. 예외 발생 여부상관없이 실행됨. ***
		}
//		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}
}
