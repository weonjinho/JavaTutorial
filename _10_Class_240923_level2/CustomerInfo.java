package _10_Class_240923_level2;

public class CustomerInfo {
	String cId = null;
	String cName = null;
	public void prt() {
		System.out.println("회원ID: "+cId);
		System.out.println("회원이름: "+cName);
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
}
