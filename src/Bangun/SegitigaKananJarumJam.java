package src.Bangun;

public class SegitigaKananJarumJam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Variabel
		Integer n = 7;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah
		Integer idxSamping = 0;
		Integer idxBawah = idxSamping + (((n - 1) * 3) - n)+1;
		Integer idxKiri = idxBawah + (n - 2);

		// Pola
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j) {

					pola[i][j] = String.valueOf(idxSamping);
					idxSamping += 1;
				}
				else if(i == n - 1) {
					
					pola[i][j] = String.valueOf(idxBawah);
					idxBawah -= 1;
				}
				else if (j==0) {
					
					pola[i][j] = String.valueOf(idxKiri);
					idxKiri -= 1;
				}
				else {
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
