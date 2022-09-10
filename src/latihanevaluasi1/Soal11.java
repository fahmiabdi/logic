package src.latihanevaluasi1;

public class Soal11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 5;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;

		Integer[] deretBil = new Integer[n];
		Integer deret = 1;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < deretBil.length; i++) {
			if (i % 2 == 0) {
				deret = bilGanjil[i];
				deretBil[i] = deret;
			} else {
				deret = bilGanjil[i];
				deretBil[i] = deret*(-1);
			}
		}

		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", deretBil[i]);
		}
	}

}
