package src.duplikasiKananBawahBedaPola;

public class DenganModuloFleksibelJeda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 2;

		// variabel kotak
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// variabel pola duplikasi
		Integer niDup = (n *n);
		Integer njDup = (n * n) + m*m;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;

		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < 2; dupBawah++) {
			for (int dupKanan = 0; dupKanan < m; dupKanan++) {
				// variabel Arah

				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						// rumus pola
						if (dupKanan % 2 == 0 && dupBawah % 2 == 0) {
							Integer idxa = 0;
							if (i == 0) {
								pola[i][j] = "a";

							} else if (j == n - 1) {
								pola[i][j] = "a";

							} else if (i == n - 1) {
								pola[i][j] = "a";

							} else if (j == 0) {
								pola[i][j] = "a";

							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 1 && dupBawah % 2 == 0) {
							if (i == 0) {
								pola[i][j] = "b";

							} else if (j == n - 1) {
								pola[i][j] = "b";

							} else if (i == n - 1) {
								pola[i][j] = "b";

							} else if (j == 0) {
								pola[i][j] = "b";

							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 0 && dupBawah % 2 == 1) {
							if (i == 0) {
								pola[i][j] = "c";

							} else if (j == n - 1) {
								pola[i][j] = "c";

							} else if (i == n - 1) {
								pola[i][j] = "c";

							} else if (j == 0) {
								pola[i][j] = "c";

							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 1 && dupBawah % 2 == 1) {
							if (i == 0) {
								pola[i][j] = "d";

							} else if (j == n - 1) {
								pola[i][j] = "d";

							} else if (i == n - 1) {
								pola[i][j] = "d";

							} else if (j == 0) {
								pola[i][j] = "d";

							} else {
								pola[i][j] = " ";
							}
						} else {
						}

						polaDup[i + iBawah][j + jKanan] = pola[i][j];
					}

				}
				jKanan = jKanan + (n + 1);
			}
			iBawah = iBawah + (n);
			jKanan = 0;

		}
		// cetak
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
