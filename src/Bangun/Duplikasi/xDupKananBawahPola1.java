package src.Bangun.Duplikasi;

public class xDupKananBawahPola1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 3;
		Integer m = 3;
		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];

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
						if (i == j) {
							// X
							// X
							// X
							pola[i][j] = "X";
						} else if (i + j == n - 1) {
							// X
							// X
							// X
							pola[i][j] = "X";
						} else {
							pola[i][j] = " ";
						}
						// Akhir Rumus Pola Original
						polaDup[i + iBawah][j + jKanan] = pola[i][j];
						if (dupBawah == 0 && dupKanan == 1) {
							polaDup[i + iBawah][j + jKanan] = " ";

						} else if (dupBawah == 1 && dupKanan == 0) {
							polaDup[i + iBawah][j + jKanan] = " ";

						} else if (dupBawah == 2 && dupKanan == 2) {
							polaDup[i + iBawah][j + jKanan] = " ";

						} else {
							polaDup[i + iBawah][j + jKanan] = pola[i][j];

						}

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
