package src.Bangun.Duplikasi;

public class SegitigaKiriDupKananIris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 2;

		// Variabel X
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Variabel Pola Dup
		Integer niDup = n;
		Integer njDup = ((n - 1)*m)+1;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		// Pola Duplikasi
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			// Pola Original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (i + j >= n-1) {
						pola[i][j] = "X";

					} else {
						pola[i][j] = " ";

					}
					//Akhir Rumus Pola Original
					polaDup[i][j + jKanan] = pola[i][j];
				}//Akhir For j
			}//Akhir For i (Akhir Pola Original)
			jKanan = jKanan + n-1;
		}//Akhir For Duplikasi

		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%3s","");
				} else {
					System.out.printf("%3s", polaDup[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}

}
