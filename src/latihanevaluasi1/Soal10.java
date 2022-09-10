package src.latihanevaluasi1;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 3;
		Integer y = 5;
		Integer[] deretY = new Integer[x + 1];
		// pola
		for (int i = 0; i < deretY.length; i++) {

			if (i < x) {
				deretY[i] = y;
				y -= 1;
			} else
				deretY[i] = x;
		}
		// cetak
		for (int i = 0; i < deretY.length; i++) {
			System.out.printf("%3S", deretY[i]);
		}
	}

}
