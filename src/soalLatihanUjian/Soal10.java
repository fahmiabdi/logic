package src.soalLatihanUjian;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 2;

		// Paket Ganjil
		Integer nGanjil = n * 2;
		Integer[] bilGanjil = new Integer[nGanjil];
		Integer ganjil = 1;
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil += 2;
		}

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah
		Integer idxKiri = 0;
		Integer idxKanan = n-1;

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (j == 0) {
					//
					// x x x x
					pola[i][j] = String.valueOf(bilGanjil[idxKiri]);
					idxKiri += 1;

				} else if (j == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilGanjil[idxKanan]);
					idxKanan -= 1;
				} else {
					pola[i][j] = " ";
				}

			}
		}
		// cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3s", pola[i][j]);
				;
			}
			System.out.println();
		}

	}
}
