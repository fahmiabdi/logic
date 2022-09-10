package src.bangunSegitigaKosongIndexAngka;

public class SegitigaKiriBalik {

	public static void main(String[] args) {
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// arah
		Integer idxKiri = 0;
		Integer idxSamping = (n * 2) - 2;
		Integer idxAtas = (n * 3)-4;

		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				if (j == 0) {
					pola[i][j] = String.valueOf(idxKiri);
					idxKiri += 1;
				} else if (i + j == n - 1) {
					pola[i][j] = String.valueOf(idxSamping);
					idxSamping -= 1;
				} else if (i == 0) {
					pola[i][j] = String.valueOf(idxAtas);
					idxAtas -= 1;
				}

				else {
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
