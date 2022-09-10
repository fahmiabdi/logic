package src.pengembanganEval01;

public class Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;
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
						pola[i][j] = " ";
						if (i == 1 && j == 1 || i == 1 && j == 2 || i == 2 && j == 1) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "*";
						}
					} else {

						if (i == 2 && j == 0 || i == 1 && j == 0) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "*";
						}
					}

					// Akhir rumus pola original
					polaDup[i][j + jKanan] = pola[i][j];
				} // Akhir for j
			} // Akhir for i
			if (dupKanan % 2 == 1) {
				jKanan = jKanan + nj - 1;
			} else {
				jKanan = jKanan + nj;
			}
		}
		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%3s", "");
				} else {
					System.out.printf("%3s", polaDup[i][j]);
				}
			}
			System.out.println();
		}

	}

}
