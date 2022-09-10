package src.soalLatihanUjian;

public class Soal09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 5;

		// Paket Genap
		Integer nGenap = n * n/2;
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
		Integer idxAtas = 0;
		Integer idxKanan = n/2;
		Integer idxBawah = (idxKanan*2)+2;
		Integer idxKiri = idxBawah+(n-2);

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == 0) {
					// x x x
					//
					pola[i][j] = String.valueOf(bilGenap[idxAtas]);
					idxAtas = idxAtas + 1;
				} else if (j == (n / 2) - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilGenap[idxKanan]);
					idxKanan = idxKanan + 1;
				} else if (i == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilGenap[idxBawah]);
					idxBawah = idxBawah + 1;
				} else if (j == 0) {
					//
					// x x x x
					pola[i][j] = String.valueOf(bilGenap[idxKiri]);
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
