package _10_Class_Ex;

import java.util.Scanner;

//고양이 관리 단일 책임을 부여 함.(전체 고양이 리스트 관리***)
public class Cat_m {
	// 클래스 바로 안쪽이라서 멤버변수라고 합니다.
	// 여기서 선언한 이유는 클래스 내부 어느곳에서든 참조가능. 
	Cat_Obj[] clist = new Cat_Obj[5]; //5마리 고양이의 정보까지 입력할수 있다.
	Scanner in = new Scanner(System.in);
	Cat_m(){
		while(true) {
			System.out.println("고양이 관리자");
			System.out.println("1.등록");
			System.out.println("2.삭제");
			System.out.println("3.수정");
			System.out.println("4.전체보기");
			System.out.println(" 선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + "을 선택함");
			if(selNum == 1) {
				add();	//메소드 호출
			}else if(selNum == 2) {
				
			}else if(selNum == 3) {
				
			}else if(selNum == 4) {
				allList();	//메소드호출
			}else {
				break;
			}
		}
		
	}
	
	
//저장 순서: 입력받는다 ---> 한 마리 고양이의 정보를 저장하는 Cat_Obj로 생성한 객체(cat)에 넣는다 ---> 전체 리스트에 추가하는  	
//	1차원 배열: [이름,나이], [이름,나이], [이름,나이], [이름,나이], [이름,나이]
	//새로운 고양이 정보 등록하기.(한 마리)
	public void add() {	//메소드 정의
		//클래스 내부에 선언한 변수를 지역변수.
		//클래스가 종료되면 변수는 사라진다...
		System.out.println("고양이 등록");
		//새로운 고양이 만들어야 죠...
		Cat_Obj cat = new Cat_Obj();
		System.out.println("고양이 이름을 입력");
		cat.name = in.nextLine();
		for(int i=0;i<clist.length;i++) {
			if(clist[i] == null) {
				clist[i] = cat;
				break;
			}
		}
	}
	
	//고양이 전체 정보 보기.
	public void allList() {	//메소드 정의
		System.out.println("고양이 전체 보기");
		for(int i=0;i<clist.length;i++) {
			if(clist[i] != null) {
				clist[i].prt();
			}
		}
		
	}
}
