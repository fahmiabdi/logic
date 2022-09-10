package src.candi;

public class Candi04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;


		// 1 Variabel
		String[][] pola = new String[n][n];
		Integer nLayer = (n + 1) / 2;
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
					} else {
						pola[i][j] = " ";
					}

				}
			}
			// akhir for i pola

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
