package _02if;

public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		개발하고 있는 시스템을 이해하고는가. 용어는 (알고 있어야함.)
		
		
//		문제1
/*
		수강 관리 프로젝트를 진행한다
		학셍의 정보는 이름 학번, 나이 성적이다.
		나이가 18세 미만은 수강신청을 할 수 없다.
		성적이 60점 이상이면서 70점 미만인 학생은 수강 신청을 할 수 있지만
		이름 뒤에 별표를 추가한다.
		학셍의 성적을 기준으로
		90점 이상이면 A
		80점 이상이면 B
		70점 이상이면 C
		60점 이상이면 D
		60점 미만이면 F라고 출력한다.
*/
		String stuName="홍길동";
		String stuNumber="0001";
		int stuAge=17;
		int stuGrade = 62;
		if(stuAge<18) {
			System.out.println("수강신청을 할 수 없는 나이입니다.");
		}else {
			if(stuGrade>=90) {
				System.out.println("A");
			}else if(stuGrade>=80) {
				System.out.println("B");
			}else if(stuGrade>=70) {
				System.out.println("C");
			}else if(stuGrade>=60 && stuGrade<70) {
				System.out.println(stuName + "*");
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
		
		System.out.println("=========================");
		
//		문제2
//		int a = 10;
//		int b = 20;
//		int my = 15;
//		문제 a와 b는 도로의 길이이며 위치이다.
//		my는 나의 위치이다.
//		내가 도로위에 있으면 도로위..a 도로위가 아니면 도로가 아님이라고 추력하시오.

//		up1
//		만약 내가 도로위라면
//		a 지점으로 부터 6(my위치에 따라 달라짐)만큼 떨어져 있습니다 라고 출력하시오.
		
//		up2
//		up1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다
//		예를 들어 my 18이면 b에 더 가까우니 b에서 부터 2거리 떨어져 있습니다.
//		같은 거리일 경우는 a가 우선이다.
		
		int a = 10;
		int b = 20;
		int my = 15;
		if(my >=a && my <=b ) {
			System.out.println("도로위");
			System.out.println("a 지점으로 부터 "+ (my-a) + "만큼 떨어져 있습니다.");
			if((my-a)>((my-b)*(-1))) {
				System.out.println("b에서 부터" + (my-b)*(-1) + "만큼 떨어져 있습니다.");
			}else if(((my-b)*(-1))>=(my-a)) {
				System.out.println("a에서 부터" + (my-a) + "만큼 떨어져 있습니다.");
			}
		}else {
			System.out.println("도로위가 아님");
		}
		
	}

}
