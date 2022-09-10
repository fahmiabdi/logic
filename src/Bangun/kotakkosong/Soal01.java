package src.Bangun.kotakkosong;

public class Soal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 4;

		// Paket 1 -3 5 -7 9 -11 13 -15 17
		Integer nGanjil = n * n;
		Integer[] bilGanjil = new Integer[nGanjil];
		Integer ganjil = 1;

		Integer[] bilDeret = new Integer[nGanjil];
		Integer deret = 0;
		Integer bilke = 1;

		// Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if (bilke == 1) {
				deret = bilGanjil[i];
				bilke += 1;
			} else if (bilke == 2) {
				deret = bilGanjil[i] * (-1);
				bilke = 1;
			} else {
			}
			bilDeret[i] = deret;
		}
		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah
		Integer idxAtas = 0;
		Integer idxKanan = idxAtas + n;
		Integer idxBawah = idxKanan + (((n - 1) * 3) - n);
		Integer idxKiri = idxBawah + (n - 2);

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == 0) {
					// x x x
					//
					pola[i][j] = String.valueOf(bilDeret[idxAtas]);
					idxAtas = idxAtas + 1;
				} else if (j == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilDeret[idxKanan]);
					idxKanan = idxKanan + 1;
				} else if (i == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilDeret[idxBawah]);
					idxBawah = idxBawah - 1;
				} else if (j == 0) {
					//
					// x x x x
					pola[i][j] = String.valueOf(bilDeret[idxKiri]);
					idxKiri = idxKiri - 1;

				} else {
					pola[i][j] = " ";
				}

			}
		}
		// cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3S", pola[i][j]);
				;
			}
			System.out.println();
		}

	}
}
