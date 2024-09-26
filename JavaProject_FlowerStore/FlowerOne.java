package JavaProject_FlowerStore;

public class FlowerOne {
	String fName = null;	// 꽃 이름
	String fSeason = null;  // 개화시기
	int fStock = 10;			// 제고 수량
	String fKind = null;    // 품종
	String fIntro = null;   // 꽃 소개
	String today = null;    // 기준날짜
	String inDate = null;   // 입고날짜
	int keepDate = 0;       // 화기
	String dropDate = null; // 패기날짜
	
	public void prt() {
		System.out.println("----- 꽃 정보 -----");
		System.out.println("꽃 이름: "+fName);
		System.out.println("개화시기: "+fSeason);
		System.out.println("제고 수량: "+fStock+" 송이");
		System.out.println("품종: "+fKind);
		System.out.println("꽃 소개: "+fIntro);
		System.out.println("기준날짜: "+today);
		System.out.println("입고날짜: "+inDate);
		System.out.println("화기: "+keepDate+" 일");
		System.out.println("패기날짜: "+dropDate);
	}


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


	// erp : 전사적 자원 관리. ( Enterprise Resource Planning )
	// mes : 생산관리 시스템. ( Manufacturing Execution System ) 
	public String dropDateCal(String InDate, int keepDate) { //원진호 --- 패기 날짜 계산.
		//dropDateCal( 입고날짜, 화기 )
		// 입고날짜 ---> 마지막 2자리 숫자 절삭 ---> int로 전환 ---> int 변수 num 에 저장. ---> ("09"+(num - 회기))결과를 인 String 값을 return.
		int num = Integer.parseInt(InDate.substring(2));
		int resultNum = (num + keepDate);
		String result = "09"+(resultNum+1); //패기날짜
		System.out.println("result: "+result);
		return result;
	}
	
	
}
