package src.Logic6;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;

		// Variabel Pola
		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];

		// Variabel Pola Duplikasi
		Integer niDup = n * n;
		Integer njDup = n * n;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;
		// Index Arah
		Integer idxAtas = 0;
		Integer idxKanan = idxAtas + n;
		Integer idxBawah = (idxKanan * 3) - 3;
		Integer idxKiri = idxBawah + (n - 2);
		Integer idxAngka = 1;
		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < n; dupBawah++) {
			// for duplikasi kanan
			for (int dupKanan = 0; dupKanan < n; dupKanan++) {
				// Pola Original
				for (int i = 0; i < nI; i++) {
					for (int j = 0; j < nJ; j++) {
						// Rumus Pola original

						if (dupBawah == 0) {
							// x x x
							//
							if (i >= j) {
								if (i * j == n/2) {
									pola[i][j] = " ";
								} else {
									pola[i][j] = String.valueOf(idxAngka);

								}
							} else {
								pola[i][j] = " ";

								idxAtas = idxAtas + 1;
							}
						} else if (dupKanan == n - 1) {
							// x
							// x
							// x
							if (i >= j) {
								if (i * j == n/2) {
									pola[i][j] = " ";
								} else {
									pola[i][j] = String.valueOf(idxAngka);
								}
							} else {
								pola[i][j] = " ";
							}
							idxKanan = idxKanan + 1;
						} else if (dupBawah == n - 1) {
							// x
							// x
							// x
							if (i >= j) {
								if (i * j == n/2) {
									pola[i][j] = " ";
								} else {
									pola[i][j] = String.valueOf(idxAngka);
								}
							} else {
								pola[i][j] = " ";
							}
							idxBawah = idxBawah - 1;
						} else if (dupKanan == 0) {
							//
							// x x x x
							if (i >= j) {
								if (i * j == n/2) {
									pola[i][j] = " ";
								} else {
									pola[i][j] = String.valueOf(idxAngka);
								}
							} else {
								pola[i][j] = " ";
							}
							idxKiri = idxKiri - 1;

						} else {
							pola[i][j] = " ";
						}

						// Akhir Rumus Pola Original

						polaDup[i + iBawah][j + jKanan] = pola[i][j];

					} // Akhir for j

				} // Akhir for i
					// akhir pola original
				jKanan += n;
				idxAngka+=1;
			}
			// akhir for duplikasi kanan
			iBawah += n;
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
