package src.soalLatihanUjian;

public class Soal08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 5;

		// Paket Genap
		Integer nGenap = n * 2;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 2;
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap += 2;
		}

		// 1 Variabel
		Integer ni = n;
		Integer nj = n / 2;
		String[][] pola = new String[ni][nj];

		// Index Arah
		Integer idxKiri = 0;
		Integer idxKanan = (n * 2)-1;

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (j == 0) {
					//
					// x x x x
					pola[i][j] = String.valueOf(bilGenap[idxKiri]);
					idxKiri += 1;

				} else if (j == (n / 2) - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilGenap[idxKanan]);
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
