package src.bangunSegitigaKosongIndexAngka;

public class SegitigaKiri {

	public static void main(String[] args) {
		Integer n = 6;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// arah
		Integer idxKiri = 0;
		Integer idxBawah = n;
		Integer idxSamping = (n*3)-4;
		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				if (j == 0) {
					pola[i][j] = String.valueOf(idxKiri);
					idxKiri += 1;
				} else if (i == n - 1) {
					pola[i][j] = String.valueOf(idxBawah);
					idxBawah += 1;
				} else if (i == j) {
					pola[i][j] = String.valueOf(idxSamping);
					idxSamping -= 1;
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
