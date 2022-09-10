package src.Bangun.Duplikasi;

public class KotakKosongDupKananBawah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel

		Integer n = 3;
		Integer m = 2;
		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];

		// Index Arah
		Integer idxAtas = 0;
		Integer idxKanan = idxAtas + n;
		Integer idxBawah = (idxKanan*3)-3;
		Integer idxKiri = idxBawah + (n - 2);

		// Variabel Pola Duplikasi
		Integer niDup = n * m;
		Integer njDup = n * m;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;

		// 2 Variabel
		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < m; dupBawah++) {
			// for duplikasi kanan
			for (int dupKanan = 0; dupKanan < m; dupKanan++) {
				// Pola Original
				for (int i = 0; i < nI; i++) {
					for (int j = 0; j < nJ; j++) {
						// Rumus Pola original
						if (i == 0) {
							// x x x
							//
							pola[i][j] = "x";
							idxAtas = idxAtas + 1;
						} else if (j == n - 1) {
							// x
							// x
							// x
							pola[i][j] = "x";
							idxKanan = idxKanan + 1;
						} else if (i == n - 1) {
							// x
							// x
							// x
							pola[i][j] = "x";
							idxBawah = idxBawah - 1;
						} else if (j == 0) {
							//
							// x x x x
							pola[i][j] = "x";
							idxKiri = idxKiri - 1;

						} else {
							pola[i][j] = " ";
						}

						// Akhir Rumus Pola Original
						polaDup[i+iBawah][j + jKanan] = pola[i][j];

					} // Akhir for j
				} // Akhir for i
					// akhir pola original
				jKanan = jKanan + n;
			}
			// akhir for duplikasi kanan
			iBawah = iBawah + n;
			jKanan = 0;
		}

		// 3 Cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%3s", polaDup[i][j]);
			}
			System.out.println();
		}

	}

}
