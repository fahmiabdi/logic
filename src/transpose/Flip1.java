package src.transpose;

public class Flip1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 3;
		Integer m = 4;

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Variabel Pola duplikasi
		Integer niDup = n;
		Integer njDup = n * m + (m - 1);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// 2 Variabel
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// pola original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (i + j >= n - 1) {
						pola[i][j] = "x";
					} else {
						pola[i][j] = " ";
					} // Akhir Rumus Pola Original

					if (dupKanan % 2 == 0) {
						polaDup[i][j + jKanan] = pola[i][j];
					} else {
						polaDup[i][j + jKanan] = pola[i][(n - 1) - j];
					}
				} // Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan = jKanan + n;
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
