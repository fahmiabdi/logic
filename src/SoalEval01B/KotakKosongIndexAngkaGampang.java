package src.SoalEval01B;

public class KotakKosongIndexAngkaGampang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 7;
		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah
		Integer idxAtas = 0;
		Integer idxKanan = n;
		Integer idxBawah = (n*3)-3;
		Integer idxKiri = (n*4)-5;

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == 0) {
					// x x x
					//
					pola[i][j] = String.valueOf(idxAtas);
					idxAtas = idxAtas + 1;
				} else if (j == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(idxKanan);
					idxKanan = idxKanan + 1;
				} else if (i == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(idxBawah);
					idxBawah = idxBawah - 1;
				} else if (j == 0) {
					//
					// x x x x
					pola[i][j] = String.valueOf(idxKiri);
					idxKiri = idxKiri - 1;

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
