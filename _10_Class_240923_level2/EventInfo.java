package _10_Class_240923_level2;

public class EventInfo {
	String eTitle = null;
	String eContent = null;
	public void ePrt() {
		System.out.println(eTitle);
		System.out.println(eContent);
	}
	public String geteTitle() {
		return eTitle;
	}
	public void seteTitle(String eTitle) {
		this.eTitle = eTitle;
	}
	public String geteContent() {
		return eContent;
	}
	public void seteContent(String eContent) {
		this.eContent = eContent;
	}
	
}
