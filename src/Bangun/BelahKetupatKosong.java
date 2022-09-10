package src.Bangun;

public class BelahKetupatKosong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah
		Integer idxAtas = 1;
		Integer idxKanan = 1;
		Integer idxBawah = 1;
		Integer idxKiri = 1;

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (j-i == (n/2)) {
					// x x x
					//
					pola[i][j] = String.valueOf(idxAtas);
					idxAtas = idxAtas + 1;
				} else if (j+i == 12) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(idxKanan);
					idxKanan = idxKanan + 1;
				} else if (i-j == n/2) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(idxBawah);
					idxBawah = idxBawah + 1;
				} else if (i+j == n/2) {
					//
					// x x x x
					pola[i][j] = String.valueOf(idxKiri);
					idxKiri = idxKiri + 1;

				} else {
					pola[i][j] = " ";
				}

			}
		}
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
