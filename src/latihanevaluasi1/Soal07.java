package src.latihanevaluasi1;

public class Soal07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;
		Integer m = 3;
		Integer[] bilGanjil = new Integer[n * n];
		Integer ganjil = 1;

		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}

		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];

		// Variabel Pola duplikasi
		Integer niDup = n;
		Integer njDup = n * m + (m - 1);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		// idx
		Integer idxAwal = 0;
		Integer idxAkhir = 0;

		// 2 Pola
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// Arah
			Integer idxSamping = idxAwal;
			Integer idxBawah = idxSamping + (((n - 1) * 3) - n) + 1;
			Integer idxKiri = idxBawah + (n - 2);
			idxAwal = idxAkhir;
			// Pola original
			for (int i = 0; i < nI; i++) {
				for (int j = 0; j < nJ; j++) {
					// Rumus Pola Original
					if (i == j) {

						pola[i][j] = String.valueOf(bilGanjil[idxSamping]);
						idxSamping += 1;
					} else if (i == n - 1) {

						pola[i][j] = String.valueOf(bilGanjil[idxBawah]);
						idxBawah -= 1;
					} else if (j == 0) {

						pola[i][j] = String.valueOf(bilGanjil[idxKiri]);
						idxKiri -= 1;
					} else {
						pola[i][j] = " ";
					}
					// Akhir Rumus Pola Original
					polaDup[i][j + jKanan] = pola[i][j];
				}
				// Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan = jKanan + n + 1;
			idxSamping = 0;
		} // Akhir for duplikasi kanan

		// 3 Cetak
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
