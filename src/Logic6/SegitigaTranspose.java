package src.Logic6;

public class SegitigaTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel Duplikasi & Dimensi
		Integer n = 7;
		Integer m = 5;
		
		// Variabel Pola
		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];
		// Variabel Pola duplikasi
		Integer niDup = n;
		Integer njDup = n * m;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer idxTranspose = 0;

		// Pola Duplikasi
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// Pola original
			for (int i = 0; i < nI; i++) {
				for (int j = 0; j < nJ; j++) {
					// Rumus Pola Segitiga Kanan
					if (idxTranspose < 1) {
						if (i >= j) {
							pola[i][j] = "X";
						} else {
							pola[i][j] = " ";
						}
					}
					// Rumus Pola Segitiga Kiri
					else if (idxTranspose < 2) {
						if (i + j >= n - 1) {
							pola[i][j] = "X";
						} else {
							pola[i][j] = " ";
						}
					}
					// Rumus Pola Kanan Terbalik
					else if (idxTranspose < 3) {
						if (i + j <= n - 1) {
							pola[i][j] = "X";
						} else {
							pola[i][j] = " ";
						}
					}
					// Rumus Pola Kiri Terbalik
					else if (idxTranspose < 4) {
						if (i <= j) {
							pola[i][j] = "X";
						} else {
							pola[i][j] = " ";
						}
					} else {
						idxTranspose = 0;

					}
					// Akhir Rumus Pola Original
					polaDup[i][j + jKanan] = pola[i][j];
				}
				// Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan += n;
			idxTranspose += 1;

		} // Akhir for duplikasi kanan

		// 3 Cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%3s", polaDup[i][j]);
			}
			System.out.println();
		}

	}

}