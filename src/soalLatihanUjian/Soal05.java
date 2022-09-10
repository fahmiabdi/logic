package src.soalLatihanUjian;

public class Soal05 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Integer n = 4;
		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah

		Integer idxDiagonal = 1;
		Integer idxBawah = n + 1;
		Integer idxKanan = ((idxBawah-1)*3)-3;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i + j == n - 1) {
					//
					// x x x x
					pola[i][j] = String.valueOf(idxDiagonal);
					idxDiagonal = idxDiagonal + 1;

				} else if (i == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(idxBawah);
					idxBawah = idxBawah + 1;
				} else if (j == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(idxKanan);
					idxKanan = idxKanan - 1;
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
