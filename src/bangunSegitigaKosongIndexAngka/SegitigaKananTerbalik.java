package src.bangunSegitigaKosongIndexAngka;

public class SegitigaKananTerbalik {

	public static void main(String[] args) {
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// Arah
		Integer idxAtas = 0;
		Integer idxKanan = n;
		Integer idxSamping = (n * 3)-4;

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == 0) {
					pola[i][j] = String.valueOf(idxAtas);
					idxAtas += 1;
				} else if (j == n - 1) {
					pola[i][j] = String.valueOf(idxKanan);
					idxKanan += 1;
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
