package src.latihanevaluasi1;

public class Soal08 {

	public static void main(String[] args) {
		Integer n = 6;
		Integer m = 3;

		// Paket Ganjil
		Integer nAngka = n * n;
		Integer[] bilAngka = new Integer[nAngka];
		Integer angka = 1;
		for (int i = 0; i < bilAngka.length; i++) {
			bilAngka[i] = angka;
			angka = angka + 1;
		}

		// 1 Variabel
		Integer ni = m;
		Integer nj = m;
		String[][] pola = new String[ni][nj];

		// Variabel Pola duplikasi
		Integer niDup = m;
		Integer njDup = m * m + (m - 1);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer idx = 0;
		// 2 Pola
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// Pola original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					// Rumus Pola Original
					if (bilAngka[idx] % n == 0) {
						pola[i][j] = "x";
						idx += 1;
					} else {
						pola[i][j] = String.valueOf(bilAngka[idx]);
						idx += 1;
					}
					// Akhir Rumus Pola Original
					polaDup[i][j + jKanan] = pola[i][j];

				}
				// Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan = jKanan + (m + 1);
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
