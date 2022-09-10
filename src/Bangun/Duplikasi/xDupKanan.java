package src.Bangun.Duplikasi;

public class xDupKanan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 3;

		// Variabel X
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Variabel Pola Dup
		Integer niDup = n;
		Integer njDup = (n * m);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// Pola Duplikasi
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// Pola Original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (i == j || (i + j) == (n - 1)) {
						pola[i][j] = "X";

					} else {
						pola[i][j] = " ";

					}
					//Akhir Rumus Pola Original
					polaDup[i][j + jKanan] = pola[i][j];
				}//Akhir For j
			}//Akhir For i (Akhir Pola Original)
			jKanan = jKanan + n;
		}//Akhir For Duplikasi

		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%3S", polaDup[i][j]);
			}
			System.out.println();
		}

	}
}
