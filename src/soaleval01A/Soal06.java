package src.soaleval01A;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 2;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		Integer niDup = n * n;
		Integer njDup = n * 2;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;
		for (int dupBawah = 0; dupBawah < n; dupBawah++) {
			for (int dupKanan = 0; dupKanan < 2; dupKanan++) {
				// pola
				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						pola[i][j] = "*";

						if (dupBawah % 2 == 0) {
							if (dupKanan == 0) {
								polaDup[i + iBawah][j + jKanan] = pola[i][j];
							} else {
								polaDup[i + iBawah][j + jKanan] = " ";
							}
						} else {
							if (dupKanan == 1) {
								polaDup[i + iBawah][j + (jKanan - 1)] = pola[i][j];
							} else {
								polaDup[i + iBawah][j + jKanan] = " ";
							}
						}
					}
				}
				jKanan = jKanan + n;
			}
			iBawah = iBawah + n;
			jKanan = 0;
		}
//Cetak
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
