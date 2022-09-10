package src.logic3;

public class Soal14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 9;

		// 1 Variabel
		String[][] pola = new String[n][n];
		Integer nLayer = (n + 1) / 2;
		Integer iMerah = 1;
		Integer jMerah = 0;
		Integer iBiru = 2;
		Integer jBiru = 1;
		Integer idxi1 = n - 1;
		Integer idxj1 = n - 1;
		Integer idxi2 = 0;
		Integer idxj2 = n - 1;
		Integer idxi3 = n - 1;
		Integer idxj3 = 0;

		// 2 Variabel
		for (int layer = 0; layer < nLayer; layer++) {
			Integer iAwal = 0 + layer;
			Integer jAwal = 0 + layer;
			Integer iAkhir = n - layer;
			Integer jAkhir = n - layer;
			// awal for i pola
			for (int i = iAwal; i < iAkhir; i++) {
				for (int j = jAwal; j < jAkhir; j++) {
					if (layer % 2 == 0) {
						pola[i][j] = "*";
						if (i == iMerah && j == jMerah) {
							pola[i][j] = " ";
						} else if (i == iMerah + 1 && j == jMerah && i < (n / 2) + 1) {
							pola[i][j] = " ";
						} else if (i == 0 && j == 0) {
							pola[i][j] = " ";
						} else if (i == idxi1 && j == idxj1 && i > (n / 2) + 1) {
							pola[i][j] = " ";
						} else if (i == idxi2 && j == idxj2 && i != n / 2) {
							pola[i][j] = " ";
						} else if (i == idxi3 && j == idxj3 && i != n / 2) {
							pola[i][j] = " ";
						}

					} else {
						pola[i][j] = " ";
						if (i == iBiru && j == jBiru) {
							pola[i][j] = "*";
						}
					}

				}
			}
			// akhir for i pola
			if (layer % 2 == 0) {
				
				iMerah += 2;
				jMerah += 2;

				idxi1 -= 2;
				idxj1 -= 2;

				idxi2 += 2;
				idxj2 -= 2;

				idxi3 -= 2;
				idxj3 += 2;

			} else {
			
				iBiru += 2;
				jBiru += 2;

			}
		}

		// 3 cetak
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3S", pola[i][j]);
			}
			System.out.println();
		}
	}

}
