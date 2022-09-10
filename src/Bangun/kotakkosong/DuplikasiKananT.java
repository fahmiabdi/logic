package src.Bangun.kotakkosong;

public class DuplikasiKananT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel
		Integer n = 3;
		Integer m = 3;

		// Variabel Pola
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// Variabel Pola Duplikasi
		Integer niDup = n;
		Integer njDup = n*m;
		String[][] polaDup = new String[niDup][njDup];

		// Index Arah
		Integer idxAtas = 0;
		Integer idxKanan = idxAtas + n;
		Integer idxBawah = idxKanan + (((n - 1) * 3) - n);
		Integer idxKiri = idxBawah + (n - 2);

		// Pola Original
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == 0) {
					// x x x
					//
					pola[i][j] = "x";
					idxAtas = idxAtas + 1;
				} else if (j == n - 1) {
					// x
					// x
					// x
					pola[i][j] = "x";
					idxKanan = idxKanan + 1;
				} else if (i == n - 1) {
					// x
					// x
					// x
					pola[i][j] = "x";
					idxBawah = idxBawah - 1;
				} else if (j == 0) {
					//
					// x x x x
					pola[i][j] = "x";
					idxKiri = idxKiri - 1;

				} else {
					pola[i][j] = " ";
				}

			}
		}
		//akhir pola Original
		
		// cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3S", pola[i][j]);
				;
			}
			System.out.println();
		}

	}
}
