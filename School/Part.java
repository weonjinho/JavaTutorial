package School;
//추상화 : 요구사항의 교과목을 멤버변수와 메소드로 정의.
public class Part {
	//멤버변수 선언 : 과목명, 강의실, 담당교수
	private String partName = null;
	private String className = null;
	private String partPro = null;
	
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getPartPro() {
		return partPro;
	}
	public void setPartPro(String partPro) {
		this.partPro = partPro;
	}
	
	public void prt() {
		System.out.println(partName);

	}
}
