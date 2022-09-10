package src.duplikasiKananBawahBedaPola;

public class Dengan4Pola4Bangun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer o = 5;
		// pola
		// variabel kotak
		Integer ni = o;
		Integer nj = o;
		String[][] pola = new String[ni][nj];
		// variabel pola duplikasi
		Integer niDup = o * 3;
		Integer njDup = o * o;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;

		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < 2; dupBawah++) {
			for (int dupKanan = 0; dupKanan < o; dupKanan++) {
				// variabel Arah

				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						// rumus pola
						if (dupKanan == 0 && dupBawah == 0) {
							pola[i][j] = " ";
							if (i == 1 && j == 1 || i==2) {
								pola[i][j] = " ";
							} else {
								pola[i][j] = "*";
							}
						} else if (dupKanan == 1 && dupBawah == 0) {
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
						} else if (dupKanan == 0 && dupBawah == 1) {
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
						} else if (dupKanan == 1 && dupBawah == 1) {
							if (i == 1 && j == 1 ||i == 0 && j == 1||i == 1 && j == 1  ) {
								pola[i][j] = " ";
							} else {
								pola[i][j] = "*";
							}						}

						polaDup[i + iBawah][j + jKanan] = pola[i][j];
					}

				}
				jKanan = jKanan + (o-1);
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
