package _13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSample {
	ArrayList<String> a = new ArrayList<>();
	
	public ListSample(){
		
		a.add("apple"); //ArrayList 에 값 추가하는 메소드.
		a.add("banana");
		a.add("abc 초코렛");
		a.add("샌드"); //맨뒤에 추가.
		a.clear();// 리스트 전체 삭제.
		a.remove(0); // 삭제하기.ㅣ
		a.add(1, "쭈구미"); //특정 인댁스 위치에 추가.
		a.remove(3); //특정 인덱스 삭제
		a.set(1, "갑오징어"); //특정 인덱스 수정
		System.out.println("리스트의 길이 "+a.size());
		System.out.println(a.get(1)); //값을 져오는 메소드
		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i)); //ArrayList의 모든 값 가져오기.
			if(a.get(i).charAt(0) != 'a') { //'a'로 시작한 것은 출력하지 않겠다.
				System.out.println(a.get(i));
			}
		}
	}
}
