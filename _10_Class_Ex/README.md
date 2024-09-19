### 필수 암기 내용

    1. 클래스는 객체를 만들기 위해 정의한 것.

    2. 클래스는 맴버변수와 메소드로 구성됨.

    3. 클래스로 부터 만든 객체는 서로 독립적이다.
  
    4. 객체를 참조하는 변수는 원시변수가 아닌 참조변수.
   
    5. 참조변수는 객체의 주소를 저장, 객체는 자바의 힙영역에 저장.
   
    6. 참조변수가 저장하고 있는 주소값을 참조하여 객체의 접근.
    
    7. new 연산자로 객체를 만들 때는 생성자로 만든다.
    
    8. 생성자는 객체를 만들 때 처음 호출되는 메소드이다. 클래스 이름과 동일하다.

### 원시변수 & 참조변수의 차이
    원시변수: int, char, char ...

    원시변수는 실재값을 저장한다.

    참조변수: String , object, array...

    참조변수는 객체의 주소값를 저장한다.

    참조변수에 저장한것은 주소지 실재 값이 아니다!

    실제값은 메모리 힙 영역에 저장되어 있고 그 주소값을 참조변수가 가지고 있을 뿐이다!

### 예제문제
``` java
//시작을 알리는 단일 책임을 정의한 클래스
public class Cat_main {

    //사작 클래스는 반드시 main()가 있어야한다.
    public static void main(String[] args) {
        System.out.println(" Cat 새상 ");
        Cat_m catMge = new Cat_m();
    }

}
```
```java
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
```
```java
//한마리 고양이에 대한 단일 책임의 클래스 정의.
public class Cat_Obj {
	String name = null;
	int age = 0;
	public void prt() {
		System.out.println("--- cat info ---");
		System.out.println(name);
		System.out.println(age);
	}
}
```














    

    