package src.bangunSegitigaKosongIndexAngka;

public class SegitigaPiramidaDuasisi {

	public static void main(String[] args) {
		Integer n = 10;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// arah
		Integer idxKiri = 0;
		Integer idxSamping1 = 0;
		Integer idxSamping2 = 0;
		Integer idxKanan = 0;
		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				if (j == 0) {
					pola[i][j] = String.valueOf(idxKiri);
					idxKiri += 1;
				} else if (i + j == n - 1) {
					pola[i][j] = String.valueOf(idxSamping1);
					idxSamping1 += 1;
				} else if (i == j) {
					pola[i][j] = String.valueOf(idxSamping2);
					idxSamping2 += 1;
				} else if (j == n - 1) {
					pola[i][j] = String.valueOf(idxKanan);
					idxKanan += 1;
				} else {
					pola[i][j] = " ";
				}

			}
		}
		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				System.out.printf("%3S", pola[i][j]);
			}
			System.out.println();
		}
	}

}
