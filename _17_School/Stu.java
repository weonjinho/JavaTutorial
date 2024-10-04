package _17_School;

public class Stu {
	private String id = null;
	private String name = null;
	private String tel = null;
	private int grade = 0;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void prt() {
		System.out.println("학생아이디 : "+id);
		System.out.println("학생이름 : "+name);
		System.out.println("전화번호 : "+tel);
		System.out.println("학년 : "+grade);
	}
	
}
