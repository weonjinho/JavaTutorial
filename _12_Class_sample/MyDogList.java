package _12_Class_sample;

public class MyDogList {
	
	Dog[] dogList = new Dog[5];
	
	MyDogList(){
		System.out.println("--- Dog 관리 ---");
		System.out.println(dogList[0]); //null
		
		
		
//		Dog d = new Dog();
//		System.out.println("d: "+d); //d: _12_Class_sample.Dog@2c13da15
		
		
		
		
		
		
//		System.out.println(dogList[0].name); //null 은 주소가 없다는 의미이다. 침조가 불가능하다.
		if(dogList[0] != null) {
			System.out.println(dogList[0].name); //null 은 주소가 없다는 의미이다. 침조가 불가능하다.
		}
		dogList[1] = new Dog();
		System.out.println(dogList[1]); //_12_Class_sample.Dog@2c13da15
		dogList[2] = dogList[1];
		System.out.println(dogList[2]); //_12_Class_sample.Dog@2c13da15 같은 객체를 참조하고 있다.
		dogList[3] = new Dog();
		System.out.println(dogList[3]); //_12_Class_sample.Dog@77556fd
		
		Dog dd = new Dog();
		dogList[4] = dd;
		System.out.println(dd); //_12_Class_sample.Dog@368239c8
		System.out.println(dogList[4]); //_12_Class_sample.Dog@368239c8
		
		dogList[1].name = "abc";
//		dogList[3].name = "aaa";
//		dogList[4].name = "bbb";
		System.out.println(dogList[1].name);
		System.out.println(dogList[2].name); 
		System.out.println(dogList[3].name);
		
		System.out.println("-------");
		//에러 코드인지 확인
		for(int i=0;i<5;i++) {
			if(dogList[i] != null) {
				System.out.println(dogList[i].name+"  /  "+dogList[i]);
//				결과:
//				abc  /  _12_Class_sample.Dog@2c13da15
//				abc  /  _12_Class_sample.Dog@2c13da15
//				null  /  _12_Class_sample.Dog@77556fd
//				null  /  _12_Class_sample.Dog@368239c8
				
//--			"_12_Class_sample.Dog@368239c8" 는 dogList[4] 에 저장된 주소이다.
//--			dogList[4]는 null 이 아니다.
//--			그러서 "dogList[i] != null" 이라는 조건이 참이다.
			}
		}
		
		System.out.println("******");
		
		//강아지 검색
		String s = "땡칠이";
		for(int i=0;i<5;i++) {
			if(dogList[i] != null) {
				if(dogList[i].name.equals(s)) {
					System.out.println("찾음");
					break;
				}
			}
		}
		
	}
}
