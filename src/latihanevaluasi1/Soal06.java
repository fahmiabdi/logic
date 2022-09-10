package src.latihanevaluasi1;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 2;

		// Paket Ganjil
		Integer[] bilGanjil = new Integer[n * n];
		Integer ganjil = 1;

		Integer[] bilDeret = new Integer[n * n];
		Integer deret = 0;
		Integer bilke = 1;

		// Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if (bilke == 1) {
				deret = bilGanjil[i];
				bilke += 1;
			} else if (bilke == 2) {
				deret = bilGanjil[i] * (-1);
				bilke += 1;
			} else if (bilke == 3) {
				deret = bilGanjil[i] = 99;
				bilke = 1;
			}

			else {
			}
			bilDeret[i] = deret;
		} // 1 Variabel
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
				// Index Arah
				Integer idxAtas = 0;
				Integer idxKanan = idxAtas + n;
				Integer idxBawah = (idxKanan*3)-3;
				Integer idxKiri = idxBawah + (n - 2);

				// Pola Original
				for (int i = 0; i < nI; i++) {
					for (int j = 0; j < nJ; j++) {
						// Rumus Pola original
						if (i == 0) {
							// x x x
							//
							pola[i][j] = String.valueOf(bilDeret[idxAtas]);
							idxAtas = idxAtas + 1;
						} else if (j == n - 1) {
							// x
							// x
							// x
							pola[i][j] = String.valueOf(bilDeret[idxKanan]);
							idxKanan = idxKanan + 1;
						} else if (i == n - 1) {
							// x
							// x
							// x
							pola[i][j] = String.valueOf(bilDeret[idxBawah]);
							idxBawah = idxBawah - 1;
						} else if (j == 0) {
							//
							// x x x x
							pola[i][j] = String.valueOf(bilDeret[idxKiri]);
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
