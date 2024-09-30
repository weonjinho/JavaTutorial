package MyNotes;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("111");
		a.add("222");
		a.add("333");
		a.add("444");
		a.add("555");
		for(int i=0;i<a.size();i++) {		//일반 for 문.
			System.out.println(a.get(i));
		}
		System.out.println();
		
		for(String w:a) {					//향상된 for 문.
			System.out.println("인덱스번호: "+a.indexOf("111"));	//배열속 모든 인덱스번호 확인.
			System.out.println("값: "+w);   //배열속 모든 값 확인.
			System.out.println("배열 길이: "+a.size());	//배열 길이
			System.out.println("------");
			System.out.println(a.get(a.indexOf(w)));
			
		}
	}
	
	
	
	

}
