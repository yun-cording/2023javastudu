package day09.com.ict.edu;

public class Ex05_Array {
	public static void main(String[] args) {
		String[] name = { "홍", "김", "이", "박", "고" };
		int[] kor = { 80, 90, 80, 70, 100 };
		int[] eng = { 85, 95, 75, 85, 95 };
		int[] math = { 100, 95, 90, 100, 100 };

		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		String[] hak = new String[name.length];
		int[] rank = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < math.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else if (avg[i] >= 60) {
				hak[i] = "D학점";
			} else {
				hak[i] = "F학점";
			}
		}
		// 순위 출력은 위에 sum값이 다 채워 지고 나서 구할 수 있기 때문에
		// 위에 sum값 구하는 for문 끝나고 난후 따로 2중 for문을 작성해서 구할수 있다.
		for (int j = 0; j < math.length; j++) {
			for (int i = 0; i < rank.length; i++) {
				if (i == j) {
					continue;	//여기서 효율적으로 코드를 작성하려면 continue 코드를
				} else if(sum[i] < sum[j]) {// 먼저 짬으로써 밑에 코드가 생략되서
					rank[i]++;		//좀더 효율적으로 작동하게 된다.
				}
			}
		}
		System.out.println("============");
		for (int i = 0; i < rank.length; i++) {
			System.out.println("이름 : " + name[i]);
			System.out.print("총점 : " + sum[i]);
			System.out.println();
			System.out.print(String.format("평균 : " + "%.1f", avg[i]));
			System.out.println();
			System.out.print("학점 : " + hak[i]);
			System.out.println();
			System.out.println("순위 : " + rank[i]);
			System.out.println("============");
		}
	}
}
