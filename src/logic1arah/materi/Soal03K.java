package src.logic1arah.materi;

public class Soal03K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bilangan Genap
		Integer n = 9;
		Integer nGenap = (n / 2) + 1;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 2;

		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		Integer idx1 = 0;
		Integer idx2 = 0;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j || (i + j) == (n - 1)) {
					if (j < (n / 2) + 1 && i < (n / 2) + 1) {
						pola[i][j] = String.valueOf(bilGenap[idx1]);
						idx1 += 1;
					} else if (j > (n / 2) && i < (n / 2)) {
						pola[i][j] = String.valueOf(bilGenap[idx2]);
						idx2 += 1;
					} else {
						pola[i][j] = "*";
					}

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
