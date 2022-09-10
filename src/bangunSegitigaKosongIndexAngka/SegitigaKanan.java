package src.bangunSegitigaKosongIndexAngka;

public class SegitigaKanan {

	public static void main(String[] args) {

		Integer n = 6;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// Arah
		Integer idxKanan = n;
		Integer idxSamping = n+1;
		Integer idxBawah = n*2;
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (j == n - 1) {
					pola[i][j] = String.valueOf(idxKanan);
					idxKanan -= 1;
				} else if (i + j == n - 1) {
					pola[i][j] = String.valueOf(idxSamping);
					idxSamping += 1;
				} else if (i == n - 1) {
					pola[i][j] = String.valueOf(idxBawah);
					idxBawah += 1;
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
