package src.latihanevaluasi1;

public class Soal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;
		Integer m = 4;

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Variabel Pola duplikasi
		Integer niDup = n - 1;
		Integer njDup = n * m + (m - 1) - (n / 2);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// 2 Variabel
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// pola original
			for (int i = 0; i < ni - 1; i++) {
				for (int j = 0; j < nj / 2; j++) {
					if (i + j <= n / 2) {
						if (i + j == 0) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "X";
						}

					} else {
						pola[i][j] = " ";

					} // Akhir Rumus Pola Original

					if (dupKanan % 2 == 0) {
						polaDup[i][j + jKanan] = pola[i][j];
					} else {
						polaDup[i][j + jKanan] = pola[i][((n / 2) - 1) - j];
					}
				} // Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan = jKanan + n / 2;
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
