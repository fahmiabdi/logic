package src.logic1arah.materi;

public class Soal09K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				pola[i][j] = " ";
			}
		}
		Integer idx = 0;
		Integer bts = 0;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j && i < (n / 2) + 1) {
					idx = i;
					for (int j2 = 0; j2 < n - (i * 2); j2++) {
						pola[idx][j] = "*";
						idx += 1;
					}
				} else if (i == j && i > (n / 2)) {
					idx = i;
					bts = (n - (i + 1)) * 2;
					for (int j2 = 0; j2 < n - bts; j2++) {
						pola[idx][j] = "*";
						idx -= 1;

					}
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
