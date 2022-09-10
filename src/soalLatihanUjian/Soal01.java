package src.soalLatihanUjian;

public class Soal01 {

	public static void main(String[] args) {
		// 1 Variabel
		Integer n = 11;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				pola[i][j] = " ";
			}
		}
		Integer idx = 0;
		Integer idxBawah = 0;
		Integer btsAtas = 0;
		Integer btsBawah = 0;
		Integer angka = 0;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i < n / 2 + 1 && i + j == n/2) {
					idx = j;
					btsAtas = (i * 2) + 1;
					for (int j2 = 0; j2 < btsAtas; j2++) {
						pola[i][idx] = "*";
						idx += 1;
					}

				} else if (i - j == n/2) {
					idxBawah = j;
					btsBawah = (n - 2) - angka;
					for (int j2 = 0; j2 < btsBawah; j2++) {
						pola[i][idxBawah] = "*";
						idxBawah += 1;
					}
					angka += 2;

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
