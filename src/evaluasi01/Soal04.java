package src.evaluasi01;

public class Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Integer n = 5;

		// 1 Variabel
		Integer ni = 4;
		Integer nj = 4;
		String[][] pola = new String[ni][nj];

		// Variabel Pola duplikasi
		Integer niDup = 4 ;
		Integer njDup = 4 * n + (n - 1) - (4 / 2);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// 2 Variabel
		for (int dupKanan = 0; dupKanan < n; dupKanan++) {
			// pola original
			for (int i = 0; i < ni - 1; i++) {
				for (int j = 0; j < nj / 2; j++) {
					if (i + j <= 4 -1) {
						if (i == 1 && j == 0) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "*";
							
						
						}	

					} else {
						pola[i][j] = " ";

					} // Akhir Runus Pola Original

					if (dupKanan % 2 == 0) {
						polaDup[i][j + jKanan] = pola[i][j];
						polaDup[i][j + jKanan] = pola[i][((4 / 2) - 1) - j];
						
					} else {
						polaDup[i][j + jKanan] = pola[i][j];
						polaDup[i][j + jKanan] = pola[i][((4 / 2) - 1) - j];
					}
				} // Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan = jKanan + 4 / 2;
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
