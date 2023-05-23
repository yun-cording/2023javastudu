package day11.com.ict.edu;

public class Ex06_method {

	String[] name = new String[5];
	int[] kor = new int[5];
	int[] eng = new int[5];
	int[] math = new int[5];
	int[] sum = new int[5];
	double[] avg = new double[5];
	String[] hak = new String[5];

	public void setName(String[] n) {
		name = n;
	}

	public void setKor(int[] k) {
		kor = k;
	}

	public void setEng(int[] e) {
		eng = e;
	}

	public void setMath(int[] m) {
		math = m;
	}

	// 총점을 구하는 메서드
	public void setSum() {
		for (int i = 0; i < 5; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
		}
	}

//	public int getSum() {
//		return 0;
//	}

	// 평균을 구하는 메서드
	public void setAvg() {
		for (int i = 0; i < 5; i++) {
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
		}
	}

//	public double getAvg() {
//		return 0;
//	}

	// 학점을 구하는 메서드
	public void setHak() {
		for (int i = 0; i < 5; i++) {
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}

		}
	}

//	public String getHak() {
//		return "";
//	}
	public void setPrn() {
		for (int i = 0; i < 5; i++) {
			System.out.print("총점은 : " + sum[i] + "\t");
			System.out.print("평균은 : " + avg[i] + "\t");
			System.out.println("학점은 : " + hak[i]);
		}

	}

}
