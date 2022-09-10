package src.Bangun.Duplikasi;

public class KotakKosongDupBawahIris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 3;

		// Paket Ganjil
		Integer nGanjil = n * n;
		Integer[] bilGanjil = new Integer[nGanjil];
		Integer ganjil = 1;
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah
		Integer idxAtas = 0;
		Integer idxKanan = idxAtas + n;
		Integer idxBawah = (idxKanan*3)-3;
		Integer idxKiri = idxBawah + (n - 2);

		// Variabel Pola Dup
		Integer niDup = ((n - 1) * m) + 1;
		Integer njDup = n;
		String[][] polaDup = new String[niDup][njDup];
		Integer iBawah = 0;

		// Pola Duplikasi
		for (int dupBawah = 0; dupBawah < m; dupBawah++) {
			// Pola Original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (i == 0) {
						// x x x
						//
						pola[i][j] = String.valueOf(bilGanjil[idxAtas]);
						idxAtas = idxAtas + 1;
					} else if (j == n - 1) {
						// x
						// x
						// x
						pola[i][j] = String.valueOf(bilGanjil[idxKanan]);
						idxKanan = idxKanan + 1;
					} else if (i == n - 1) {
						// x
						// x
						// x
						pola[i][j] = String.valueOf(bilGanjil[idxBawah]);
						idxBawah = idxBawah - 1;
					} else if (j == 0) {
						//
						// x x x x
						pola[i][j] = String.valueOf(bilGanjil[idxKiri]);
						idxKiri = idxKiri - 1;

					} else {
						pola[i][j] = " ";
					}

					// Akhir Rumus Pola Original
					polaDup[i + iBawah][j] = pola[i][j];
				} // Akhir For j
			} // Akhir For i (Akhir Pola Original)
			idxAtas = 0;
			idxKanan = idxAtas + n;
			idxBawah = idxKanan + (((n - 1) * 3) - n);
			idxKiri = idxBawah + (n - 2);

			iBawah = iBawah + n - 1;
		} // Akhir For Duplikasi

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
