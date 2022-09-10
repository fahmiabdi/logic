package src.Logic6;

public class Soal07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;

		
		// Paket Ganjil
		Integer nAngka = n * n;
		Integer[] bilAngka = new Integer[nAngka];
		Integer Angka = 1;
		for (int i = 0; i < bilAngka.length; i++) {
			bilAngka[i] = Angka;
			Angka = Angka + 1;
		}

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];


		// Variabel Pola duplikasi
		Integer niDup = n;
		Integer njDup = (n * n)+(n-1);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// 2 Pola
		for (int dupKanan = 0; dupKanan < n; dupKanan++) {
			// Index Arah
			Integer idxAtas = 0;
			Integer idxKanan = idxAtas + n;
			Integer idxBawah = idxKanan + (((n - 1) * 3) - n);
			Integer idxKiri = idxBawah + (n - 2);

			// Pola original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					// Rumus Pola Original
					if (i == 0) {
						// x x x
						//
						pola[i][j] = String.valueOf(bilAngka[idxAtas]);
						idxAtas = idxAtas + 1;
					} else if (j == n - 1) {
						// x
						// x
						// x
						pola[i][j] = String.valueOf(bilAngka[idxKanan]);
						idxKanan = idxKanan + 1;
					} else if (i == n - 1) {
						// x
						// x
						// x
						pola[i][j] = String.valueOf(bilAngka[idxBawah]);
						idxBawah = idxBawah - 1;
					} else if (j == 0) {
						//
						// x x x x
						pola[i][j] = String.valueOf(bilAngka[idxKiri]);
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
			jKanan = jKanan + (n+1);
		} // Akhir for duplikasi kanan

		// 3 Cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%3s","");
				} else {
					System.out.printf("%3s", polaDup[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}

}
