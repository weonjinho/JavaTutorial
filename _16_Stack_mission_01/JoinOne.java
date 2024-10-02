package _16_Stack_mission_01;

public class JoinOne {
	private String id = null;
	private String pw = null;
	private String name = null;
	private String tel = null;
	private String grade = null;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void prt() {
		System.out.println("--- 가입한 회원의 정보 ---");
		System.out.println("아이디 : "+id);
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+pw);
		System.out.println("학년 : "+grade);
		System.out.println();
	}
}
