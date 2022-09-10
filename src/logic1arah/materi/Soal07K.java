package src.logic1arah.materi;

public class Soal07K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		Integer idx = 0;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				pola[i][j] = " ";
			}
		}
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i + j == n - 1) {
					idx = i;
					for (int j2 = 0; j2 < n - i; j2++) {

						pola[idx][j] = "*";
						idx += 1;
					}

				} else {

				}
			}
		}
		// cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3S", pola[i][j]);
			}
			System.out.println();
		}

	}

}
