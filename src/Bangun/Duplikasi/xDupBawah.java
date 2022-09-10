package src.Bangun.Duplikasi;

public class xDupBawah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 3;

		// Variabel X
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Variabel Pola Dup
		Integer niDup = n*m;
		Integer njDup = n;
		String[][] polaDup = new String[niDup][njDup];
		Integer iBawah = 0;

		// Pola Duplikasi
		for (int dupBawah = 0; dupBawah < m; dupBawah++) {
			// Pola Original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (i == j || (i + j) == (n - 1)) {
						pola[i][j] = "X";

					} else {
						pola[i][j] = " ";

					}
					//Akhir Rumus Pola Original
					polaDup[i+iBawah][j] = pola[i][j];
				}//Akhir For j
			}//Akhir For i (Akhir Pola Original)
			iBawah = iBawah + n;
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
