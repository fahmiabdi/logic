package src.Bangun.Duplikasi;

public class KotakKosongKananIncrementT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 3;
		Integer m = 2;

		// Paket Ganjil
		Integer nGanjil = (n * n) * m;
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
		// Variabel Pola duplikasi
		Integer niDup = n;
		Integer njDup = n * m;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// idx
		Integer idxAwal = 0;
		Integer idxAkhir = 0;
		// 2 Pola
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// Index Arah

			Integer idxAtas = idxAwal; // Indeks Awal
			Integer idxKanan = idxAtas + n;
			Integer idxBawah = idxKanan + (((n - 1) * 3) - n);
			Integer idxKiri = idxBawah + (n - 2); // Indeks Akhir
			idxAkhir = idxKiri;
			idxAwal = idxAkhir + 1;

			// Pola original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					// Rumus Pola Original
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
					polaDup[i][j + jKanan] = pola[i][j];

				}
				// Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan = jKanan + n;
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
