package src.logic3;

public class Soal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 13;

		// 1 Variabel
		String[][] pola = new String[n][n];
		Integer nLayer = (n + 1) / 2;

		Integer iMerah = 1;
		Integer jMerah = n - 1;

		Integer iBiru = 2;
		Integer jBiru = n - 2;

		Integer idxi1 = 0;
		Integer idxj1 = 0;

		Integer idxi2 = n - 1;
		Integer idxj2 = 0;

		Integer idxi3 = n - 1;
		Integer idxj3 = n - 1;

		Integer idxi4 = 2;
		Integer idxj4 = n - 1;

		Integer idxBatas = 0;
		Integer idxBatas2 = (n / 2) + 1;

		if (n % 3 == 0) {
			idxBatas = (n / 2);

		} else {
			idxBatas = (n / 2) + 1;

		}
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
						pola[i][j] = "x";
						if (i == iMerah && j == jMerah) {
							pola[i][j] = " ";
						} else if (i == 0 && j == n - 1) {
							pola[i][j] = " ";
						} else if (i == idxi1 && j == idxj1 && i != idxBatas) {
							pola[i][j] = " ";
						} else if (i == idxi2 && j == idxj2 && i != idxBatas) {
							pola[i][j] = " ";
						} else if (i == idxi3 && j == idxj3 && i != idxBatas) {
							pola[i][j] = " ";
						} else if (i == idxi4 && j == idxj4 && i != idxBatas2) {
							pola[i][j] = " ";
						}
					} else {
						pola[i][j] = " ";
						if (i == iBiru && j == jBiru) {
							pola[i][j] = "x";
						}
					}

				}
			}
			// akhir for i pola
			if (layer % 2 == 0) {
				iMerah += 2;
				jMerah -= 2;

				idxi1 += 2;
				idxj1 += 2;

				idxi2 -= 2;
				idxj2 += 2;

				idxi3 -= 2;
				idxj3 -= 2;

				idxi4 += 2;
				idxj4 -= 2;

			} else {
				iBiru += 2;
				jBiru -= 2;

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
