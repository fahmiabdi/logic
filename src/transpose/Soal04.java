package src.transpose;

public class Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 2;

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Variabel Pola duplikasi
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
				// pola original
				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						if (i + j >= n - 1) {
							if (i == n - 1 && j == n - 1) {
								pola[i][j] = " ";

							} else {
								pola[i][j] = "x";

							}
						} else {
							pola[i][j] = " ";
						} // Akhir Rumus Pola Original

						if (dupKanan == 0) {
							polaDup[i][j + jKanan] = pola[i][j];
							polaDup[i + iBawah][j + jKanan] = pola[(n - 1) - i][j];
						} else {
							polaDup[i][j + jKanan] = pola[i][(n - 1) - j];
							polaDup[i + iBawah][j + jKanan] = pola[(n - 1) - i][(n - 1) - j];

						}
					} // Akhir for j
				} // Akhir for i
					// akhir pola original
				jKanan = jKanan + n - 1;
			} // Akhir for duplikasi kanan
			iBawah = iBawah + n - 1;
			jKanan = 0;
		}

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
