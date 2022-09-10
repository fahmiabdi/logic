package src.duplikasiKananBawahBedaPola;

public class DenganModuloFleksibel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 2;
		Integer m = 4;
		Integer o = 5;
		// pola
		Integer[] bilPola = new Integer[(o * 4)];
		for (int i = 0; i < bilPola.length; i++) {
			bilPola[i] = n;
			n += m;
		}
		// variabel kotak
		Integer ni = o;
		Integer nj = o;
		String[][] pola = new String[ni][nj];
		// variabel pola duplikasi
		Integer niDup = (o * o) + o;
		Integer njDup = (o * o) + o;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;

		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < o; dupBawah++) {
			for (int dupKanan = 0; dupKanan < o; dupKanan++) {
				// variabel Arah

				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						// rumus pola
						if (dupKanan % 2 == 0 && dupBawah % 2 == 0) {
							if (i == 0) {
								pola[i][j] = "a";

							} else if (j == o - 1) {
								pola[i][j] = "a";

							} else if (i == o - 1) {
								pola[i][j] = "a";

							} else if (j == 0) {
								pola[i][j] = "a";

							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 1 && dupBawah % 2 == 0) {
							if (i == 0) {
								pola[i][j] = "b";

							} else if (j == o - 1) {
								pola[i][j] = "b";

							} else if (i == o - 1) {
								pola[i][j] = "b";

							} else if (j == 0) {
								pola[i][j] = "b";

							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 0 && dupBawah % 2 == 1) {
							if (i == 0) {
								pola[i][j] = "c";

							} else if (j == o - 1) {
								pola[i][j] = "c";

							} else if (i == o - 1) {
								pola[i][j] = "c";

							} else if (j == 0) {
								pola[i][j] = "c";

							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 1 && dupBawah % 2 == 1) {
							if (i == 0) {
								pola[i][j] = "d";

							} else if (j == o - 1) {
								pola[i][j] = "d";

							} else if (i == o - 1) {
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
				jKanan = jKanan + (o);
			}
			iBawah = iBawah + (o);
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
