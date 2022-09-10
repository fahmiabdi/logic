package src.Bangun;

public class PiramidaAngkaUrut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 9;
		Integer ni = (n / 2);
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				pola[i][j] = " ";
			}
		}
		Integer idx = 0;
		Integer bts = 0;
		Integer idxAngka = 1;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i + j == n/2) {
					idx = j;
					bts = (i * 2) + 1;
					for (int j2 = 0; j2 < bts; j2++) {
						pola[i][idx] = String.valueOf(idxAngka);
						idx += 1;
						idxAngka +=1;

					}

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
