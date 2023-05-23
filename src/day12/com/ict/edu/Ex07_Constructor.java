package day12.com.ict.edu;

public class Ex07_Constructor {
	String name = "홍길동";
	private int kor = 90;
	private int eng = 80;
	private int math = 80;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";

	// 생성자
	public Ex07_Constructor() {
		// 생성자가 다른 생성자 호출 할 수 있다.
		// 규칙 1 . 첫째줄에서 호출해야함.
		// 규칙 2 . 생성자 이름을 쓰면 안됨
	}
	
	public Ex07_Constructor(String name) {
		// 생성자가 다른 생성자 호출 할 수 있다.
		// 규칙 1 . 첫째줄에서 호출해야함.
		// 규칙 2 . 생성자 이름을 쓰면 안됨 대신 this();
		this(99,88,100);
		this.name = name;
	}
	
	public Ex07_Constructor(int kor , int eng , int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 총점 구하기
	public void gSum(int kor, int eng, int math) {
		sum = kor + eng + math;
		
	}
	public void gSum() {
		sum = kor + eng + math;
		
	}

	// 평균 구하기
	public void gAvg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
		
	}

	public void gHak() {
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else {
			hak = "F";
		}
		
	}

	// 출력하는 메서드
	public void prn() {
		System.out.print("이름 : " + name+"\t");
		System.out.print("충점 : " + sum+"\t");
		System.out.print("평균 : " + avg+"\t");
		System.out.print("학점 : " + hak);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

}
