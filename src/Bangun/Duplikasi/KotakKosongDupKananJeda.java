package src.Bangun.Duplikasi;

public class KotakKosongDupKananJeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 4;
		Integer m = 2;
		
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

		// Variabel Pola duplikasi
		Integer niDup = n;
		Integer njDup = n*m+(m-1);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// 2 Pola
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
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
			idxAtas = 0;
			idxKanan = idxAtas + n;
			idxBawah = idxKanan + (((n - 1) * 3) - n);
			idxKiri = idxBawah + (n - 2);

			jKanan = jKanan + (n+1);
		} // Akhir for duplikasi kanan

		// 3 Cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%5s","");
				} else {
					System.out.printf("%5s", polaDup[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}

}
