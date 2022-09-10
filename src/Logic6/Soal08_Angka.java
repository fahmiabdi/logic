package src.Logic6;

public class Soal08_Angka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n1 = 4;
		Integer n2 = 5;
		Integer n3 = 3;

		// Paket Ganjil
		Integer nGanjil = n1 * n2;
		Integer[] bilGanjil = new Integer[nGanjil];
		Integer Ganjil = 1;
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = Ganjil;
			Ganjil = Ganjil + 2;
		}

		// 1 Variabel
		Integer ni = n1;
		Integer nj = n2;
		String[][] pola = new String[ni][nj];

		// Variabel Pola duplikasi
		Integer niDup = n1;
		Integer njDup = (n2 * n3) + (n3 - 1);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
	
		// 2 Pola
		for (int dupKanan = 0; dupKanan < n3; dupKanan++) {
			// Index Arah
			Integer idxAtas = 0;
			Integer idxKanan = idxAtas + n2;
			Integer idxBawah = ((n2-1)*2)+n1-1;
			Integer idxKiri = idxBawah+(n1-2);
			
			// Pola original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					// Rumus Pola Original
					if (i == 0) {
						// x x x
						//
						pola[i][j] = String.valueOf(bilGanjil[idxAtas]);
						idxAtas = idxAtas + 1;
					} else if (j == n2 - 1) {
						// x
						// x
						// x
						pola[i][j] = String.valueOf(bilGanjil[idxKanan]);
						idxKanan = idxKanan + 1;
					} else if (i == n1 - 1) {
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
			jKanan = jKanan + (n2 + 1);
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
