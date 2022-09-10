package src.candi;

public class Ular {

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
				iMerah +=2;
				jMerah+=2;
			} else {
				iBiru+=2;
				jBiru+=2;
				
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
