package src.latihanevaluasi1;

public class Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n * n];
		Integer ganjil = 1;

		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;

		}

		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (bilGanjil[i] % 3 == 0) {
					pola[i][j] = String.valueOf(bilGanjil[i]/3);
				} else {
					pola[i][j] = String.valueOf(bilGanjil[i]);
				}
			}
		}
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3S", pola[i][j]);
			}
			System.out.println();
		}

	}
}