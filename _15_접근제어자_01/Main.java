package _15_접근제어자_01;

import _15_접근제어자_02.MemberOne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberOne m = new MemberOne();
//		m.name = "hong"; //package가 다르다.
		//err why? name변수 접근제어자 default
		m.prt(); //기능
		m.setName("1234");
		m.setName("4567");
	}

}
