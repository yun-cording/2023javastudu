package day11.com.ict.edu;

public class test_method {
	String name = "";
    int kor = 0;
    int eng = 0;
    int math = 0;
    int sum = 0;
    double avg = 0.0;
    String hak = "";
    int rank = 0;

    public int getSum() {
        return sum = kor + eng + math;
    }

    public double getAvg() {
        return avg = (int) (sum / 3.0 * 10) / 10.0;
    }

    public String getHak() {
        if (avg >= 90) {
            hak = "A학점";
        } else if (avg >= 80) {
            hak = "B학점";
        } else if (avg >= 70) {
            hak = "C학점";
        } else {
            hak = "F학점";
        }
        return hak;
    }

}
