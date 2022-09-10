package src.soalLatihanUjian;

public class Soal06_denganArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;
		//Pola Angka
		Integer bilAngka[] = new Integer[n*3];
		Integer angka = 1;
		for (int i = 0; i < bilAngka.length; i++) {
			bilAngka[i] = angka;
			angka += 1;
		}
		// pola deret
		Integer idxAngka = 0;
		String[] bilDeret = new String[n*3];
		String deret = "";
		for (int i = 0; i < bilDeret.length; i++) {
			if (i % 2 == 1) {
				deret = String.valueOf(bilAngka[idxAngka]);
				idxAngka += 1;
			} else {
				deret = "A";
			}
			bilDeret[i] = deret;
		}
		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah

		Integer idxDiagonal = 0;
		Integer idxBawah = n;
		Integer idxKanan = ((idxBawah-1)*3)-1;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i + j == n - 1) {
					//
					// x x x x
					pola[i][j] = String.valueOf(bilDeret[idxDiagonal]);
					idxDiagonal = idxDiagonal + 1;

				} else if (i == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilDeret[idxBawah]);
					idxBawah = idxBawah + 1;
				} else if (j == n - 1) {
					// x
					// x
					// x
					pola[i][j] = String.valueOf(bilDeret[idxKanan]);
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
