package src.soalEval01;

public class Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 8;
		// Variabel pola
		Integer ni = 4 - 1;
		Integer nj = 4 / 2;
		String[][] pola = new String[ni][nj];
		// Variabel Duplikat
		Integer niDup = ni;
		Integer njDup = nj * n;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		for (int dupKanan = 0; dupKanan < n; dupKanan++) {
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (dupKanan % 2 == 0) {
						if (i == 1 && j == 0) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "*";
						}
					} else {
						if (i == 1 && j == 1) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "*";
						}
					}

					// Akhir rumus pola original
					polaDup[i][j + jKanan] = pola[i][j];
				} // Akhir for j
			} // Akhir for i
			jKanan = jKanan + nj;
		}
		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%3S", polaDup[i][j]);
			}
			System.out.println();
		}

	}

}
