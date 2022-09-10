package src.Logic6;

public class Soal09Ilham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 7;
		Integer m = 7;
		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];

		Integer nangka = n * n * n;
		Integer[] bilangan = new Integer[nangka];
		int idxangka = 0;
		Integer angka = 6;
		for (int i = 0; i < bilangan.length; i++) {
			bilangan[i] = angka;
			angka = angka + 1;
		}

		// Variabel Pola duplikasi
		Integer niDup = n * m;
		Integer njDup = n * m;
		String[][] polaDup = new String[niDup][njDup];
		String[][] polaDupk = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;
		Integer idxAtas = 0;
		Integer idxKanan = idxAtas + n;
		Integer idxBawah = idxKanan + (((n - 1) * 3) - n);
		Integer idxKiri = idxBawah + (n - 2);
		// 2 Pola

		// duplikasi ke bawah
		for (int dupbawah = 0; dupbawah < m; dupbawah++) {

			// duplikasi ke kanan
			for (int dupKanan = 0; dupKanan < m; dupKanan++) {

				// Pola original
				for (int i = 0; i < nI; i++) {
					for (int j = 0; j < nJ; j++) {
						// Rumus Pola Original

						if (dupbawah == 0) {
							// x x x
							//
							if (i + j >= n - 1) {
								pola[i][j] = String.valueOf(bilangan[idxangka]);
							} else {
								pola[i][j] = " ";
							}
							idxAtas = idxAtas + 1;
						} else if (dupKanan == n - 1) {
							// x
							// x
							// x
							if (i + j >= n - 1) {
								pola[i][j] = String.valueOf(bilangan[idxangka]);
							} else {
								pola[i][j] = " ";
							}
							idxKanan = idxKanan + 1;
						} else if (dupbawah == n - 1) {
							// x
							// x
							// x
							if (i + j >= n - 1) {
								pola[i][j] = String.valueOf(bilangan[idxangka]);
							} else {
								pola[i][j] = " ";
							}
							idxBawah = idxBawah - 1;
						} else if (dupKanan == 0) {
							//
							// x x x x
							if (i + j >= n - 1) {
								pola[i][j] = String.valueOf(bilangan[idxangka]);
							} else {
								pola[i][j] = " ";
							}
							idxKiri = idxKiri - 1;

						} else {
							pola[i][j] = " ";
						}
						// Akhir Rumus Pola Original
						polaDup[i + iBawah][j + jKanan] = pola[i][j];

					}
					// Akhir for j

				} // Akhir for i

				if (dupbawah == 0) {
					idxangka++;
				} else if (dupKanan == n - 1) {
					idxangka++;
				} else if (dupbawah == n - 1) {
					idxangka++;
				} else if (dupKanan == 0) {
					idxangka++;
				} else {
					idxangka = idxangka + 0;
				}

				jKanan = jKanan + n;
			} // Akhir for duplikasi kanan

			iBawah = iBawah + n;
			jKanan = 0;
		} // akhir for duplikasi bawah

		// 3 Cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%3s", polaDup[i][j]);
			} // akhir cetak j
			System.out.println();
		} // akhir cetak i
	}

}
