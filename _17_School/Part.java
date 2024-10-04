package _17_School;

public class Part {
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
		System.out.println("과목명 : "+partName);
		System.out.println("강의실 : "+className);
		System.out.println("교수명 : "+partPro);
	}
}
