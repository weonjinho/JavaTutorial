package _16_Stack_mission;

public class TotalOne {
	private String stuId = null;
	private String stuName = null;
	private String stuTel = null;
	private String stuGrade = null;
	private String lName = null;
	private String lRoom = null;
	private String lProfessor = null;
	
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuTel() {
		return stuTel;
	}
	public void setStuTel(String stuTel) {
		this.stuTel = stuTel;
	}
	public String getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getlRoom() {
		return lRoom;
	}
	public void setlRoom(String lRoom) {
		this.lRoom = lRoom;
	}
	public String getlProfessor() {
		return lProfessor;
	}
	public void setlProfessor(String lProfessor) {
		this.lProfessor = lProfessor;
	}
	public void prtAll() {
		System.out.println("학생 아이디 : "+stuId);
		System.out.println("학생 이름 : "+stuName);
		System.out.println("학생 전화번호 : "+stuTel);
		System.out.println("학생 학년 : "+stuGrade);
		System.out.println("과목명 : "+lName);
		System.out.println("강의실 : "+lRoom);
		System.out.println("담당교수 : "+lProfessor);
	}
	public void prtStu() {
		System.out.println("학생 아이디 : "+stuId);
		System.out.println("학생 이름 : "+stuName);
		System.out.println("학생 전화번호 : "+stuTel);
		System.out.println("학생 학년 : "+stuGrade);
	}
	public void prtLesson() {
		System.out.println("과목명 : "+lName);
		System.out.println("강의실 : "+lRoom);
		System.out.println("담당교수 : "+lProfessor);
	}
}
