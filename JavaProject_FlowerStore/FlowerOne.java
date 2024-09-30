package JavaProject_FlowerStore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FlowerOne {
	String fName = null;	// 꽃 이름
	String fSeason = null;  // 개화시기
	int fStock = 10;		// 제고 수량
	String fKind = null;    // 품종
	String fIntro = null;   // 꽃 소개
	String today = null;    // 현재날짜
	String inDate = null;   // 입고날짜
	int keepDate = 0;       // 화기(유효가간)
	String dropDate = null; // 패기날짜

	int trashFlower = 0; //유효기간 지난 꽃의 갯수.
	int resultNum = 0; 	 //"입고날짜 + 유효기간(화기)"를 계산한 값을 저장할 변수.
	

	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getfSeason() {
		return fSeason;
	}
	public void setfSeason(String fSeason) {
		this.fSeason = fSeason;
	}

	
	public int getfStock() {
		return fStock;
	}
	public void setfStock(int fStock) {
		this.fStock = fStock;
	}


	public String getfKind() {
		return fKind;
	}
	public void setfKind(String fKind) {
		this.fKind = fKind;
	}


	public String getfIntro() {
		return fIntro;
	}
	public void setfIntro(String fIntro) {
		this.fIntro = fIntro;
	}


	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}


	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}


	public int getKeepDate() {
		return keepDate;
	}
	public void setKeepDate(int keepDate) {
		this.keepDate = keepDate;
	}


	public String getDropDate() {
		return dropDate;
	}
	public void setDropDate(String dropDate) {
		this.dropDate = dropDate;
	}


	public int getTrashFlower() {
		return trashFlower;
	}
	public void setTrashFlower(int trashFlower) {
		this.trashFlower = trashFlower;
	}


	public int getResultNum() {
		return resultNum;
	}
	public void setResultNum(int resultNum) {
		this.resultNum = resultNum;
	}
	
	
	//현재 날짜 계산 메소드.
	//매개변수: 없음.
	//리턴타입: String
	public String calNowDate() {	
		SimpleDateFormat nowDate = new SimpleDateFormat("MMdd");
		Date now = new Date();
		String today = nowDate.format(now);
		return today;
	}

	
	//페기 날짜 계산 메소드.
	//매개변수: ( 입고날짜, 유효기간(화기) )
	//리턴타입: String
	public String dropDateCal(String InDate, int keepDate) { 
		//dropDateCal( 입고날짜, 화기 )
		//입고날짜 ---> 마지막 2자리 숫자 절삭 ---> int로 전환 ---> int 변수 num 에 저장. ---> ("09"+(num + 회기))+1 결과를 인 String 값을 return.
		int numMonth = Integer.parseInt(InDate.substring(0, 2)); // "월" 정보 절삭
		int numDay = Integer.parseInt(InDate.substring(2)); // "일" 정보 절삭
		resultNum = (numDay + keepDate);// "입고날짜" + "유효기간(화기)" ---> 별도 메소드 생성?
		int dropResultNum = (resultNum+1);//페기날짜의 "일"정보.
		String monthNum = null;//페기날짜의 "월"정보의 문자열 형식.
		String strDay = null;//페기날짜의 "일"정보의 문자열 형식.
		String result = null;
		String strDropResultNum = null;
		String strNumMonth = null;
		if(dropResultNum > 31) {
			numMonth ++; 
			dropResultNum -= 31;
			if(dropResultNum < 10) { //"일"정보를 2자리로 만드는 코드.
				strDay = "0"+dropResultNum;
			}
			monthNum = String.valueOf(numMonth);
			result = monthNum+strDay; //페기날짜
		}else if(dropResultNum <= 31) {
			if(numMonth < 10 && dropResultNum >= 10) {
				strNumMonth = "0"+numMonth;
				strDropResultNum = String.valueOf(dropResultNum);
			}
			if(dropResultNum < 10) {
				strNumMonth = "0"+numMonth;
				strDropResultNum = "0"+dropResultNum;
			}
			result = strNumMonth + strDropResultNum;
		}
		return result;
	}
	
	
	//"입고날짜"&"유효기간"을 매개변수로 받고, "입고날짜" + "유효기간(화기)" 를 계산하는 메소드.
	//매개변수: ( 입고날짜, 유효가간(화기) )
	//리턴타입: String
	public String calInKeep(String InDate, int keepDate) {
		//"입고날짜"의 "월"정보 분리.
		String strMonth = InDate.substring(0,1);
		int intMonth = Integer.parseInt(strMonth);
		//"입고날짜"의 "일"정보 분리.
		String strDay = InDate.substring(2);
		int intDay = Integer.parseInt(strDay);
		String strAddDay = null;
		String strAddMonth = null;
		int addDay = 0;
		int addNum = intDay + keepDate;
		if(addNum > 31) {
			intMonth++;
			addDay = addNum - 31;
			if(addDay < 10) {
				strAddDay = ("0"+addDay);
			}
			strAddMonth = String.valueOf(intMonth);
		}
		String calResult = strAddMonth + strAddDay;
		return calResult;
	}
	
	
	//페기할 꽃의 갯수를 count 한 값을 리턴한 메소드.
	//매개변수: ( 현재날짜, 페기날짜 )
	//리턴타입: int
	public int calTrashFlower(String nowDate, String dropDate) {
		int cntTrashFlower = 0;
		//현재날짜
		//"월" --- intNowMonth
		String nowMonth = nowDate.substring(0, 2);
		int intNowMonth = Integer.parseInt(nowMonth);
		System.out.println("현재날짜 월:"+intNowMonth);
		//"일" --- intNowDay
		String nowDay = nowDate.substring(2);
		int intNowDay = Integer.parseInt(nowDay);
		System.out.println("현재날짜 일:"+intNowDay);
		
		//패기날짜 dropDate
		//"월" --- intDropMonth
		String dropMonth = dropDate.substring(0,2);
		int intDropMonth = Integer.parseInt(dropMonth);
		System.out.println("페기날짜 월: "+intDropMonth);
		//"일" --- intDropDay
		String dropDay = dropDate.substring(2);
		int intDropDay = Integer.parseInt(dropDay);
		System.out.println("페기날짜 일: "+intDropDay);
		
		//현재날짜 월 > 페기날짜 월 ---> 페기 ---> cntTrashFlower++;
		if(intNowMonth > intDropMonth) {
			cntTrashFlower++;
		}
		//현재날짜 월 = 페기날짜 월 ---> 현재날짜 일 > 페기날짜 일 ---> 페기 ---> cntTrashFlower++;
		//현재날짜 월 = 페기날짜 월 ---> 현재날짜 일 <= 페기날짜 일 ---> 정상 ---> cntTrashFlower = 0;
		if(intNowMonth == intDropMonth) {
			if(intNowDay > intDropDay) {
				cntTrashFlower++;
			}else {
				cntTrashFlower = 0;
			}
		}
		//현재날짜 월 < 페기날짜 월 ---> 정상 ---> cntTrashFlower = 0;
		if(intNowMonth < intDropMonth) {
			cntTrashFlower = 0;
		}
		trashFlower = cntTrashFlower;
		return cntTrashFlower;
	}

	
	//재고 수량을 계산하는 메소드. 
	//매개변수: 재고수량(fStock), 페기할 꽃의 수량(cntTrashFlower)
	//리턴타입: int
	//재고 수량 = 재고수량 - cntTrashFlower.
	//fStock = fStock - cntTrashFlower.
	public int stockNum(int fStock, int trashFlower) {
		System.out.println("현재재고***: "+fStock);
		System.out.println("페기할 꽃의 갯수***: "+trashFlower);
		return (fStock - trashFlower);
	}

	
	//한 송이 꽃의 모든정보를 확인하는 메소드.
	public void prt() {	
		System.out.println("----- 꽃 정보 -----");
		System.out.println("꽃 이름: "+fName);
		System.out.println("개화시기: "+fSeason);
		System.out.println("제고 수량: "+fStock+" 송이");
		System.out.println("품종: "+fKind);
		System.out.println("꽃 소개: "+fIntro);
		System.out.println("현재날짜: "+today);
		System.out.println("입고날짜: "+inDate);
		System.out.println("화기: "+keepDate+" 일");
		System.out.println("패기날짜: "+dropDate);
		//prt()메소드를 여기에 작성한 이유: 
		//자바는 코드를 위에서 아래순으로 설행된다. 
		//위에서 "fStock"값의 관한 모든 연산이 끝난 값을 출력해야하기때문에 prt()를 맨 아래 작성한것입니다.
	}
	

	
}
