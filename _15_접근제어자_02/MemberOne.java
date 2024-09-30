package _15_접근제어자_02;

public class MemberOne {
	private String name = null;
	public void prt() {
		System.out.println(name);
	}
	public void setName(String n) {
		if(checkName(n)) {
			this.name = n;
		}else {
			this.name = "err";
		}
		System.out.println(this.name);
	}
	private boolean checkName(String n) {
		if(n.charAt(0) == '4') {
			return false;//return 는 종료하는 기능도 있다.
		}
		return true;
	}
	//checkName은 내부적으로 호출하는 메소드로 정의.
	//하였으므로 private 가 적당함.
	
}
