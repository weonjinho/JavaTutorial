package _10_Class_mission_Day02_level_02;

public class TrainObj {
	public TrainObj() {
		// TODO Auto-generated constructor stub
	}
	String[] trainNum = {"1111", "2222", "3333", "44444"};
	String[] trainName = {"무궁화", "새마을", "무궁화", "KTX"};
	String arriveTime = null;
	public void prt() {
		System.out.println("기차번호:"+trainNum);
		System.out.println("기차종류:"+trainName);
		System.out.println("도착시간:"+arriveTime);
	}
}
