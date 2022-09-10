package src.Bangun.SegitigaIsi;

public class SegitigaKananGanjilGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;

		// pola Ganjil
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		// pola Genap
		Integer[] bilGenap = new Integer[n];
		Integer genap = 2;

		// pola
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}

		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		Integer idx = 0;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i >= j) {
					if (j % 2 == 1) {

						pola[i][j] = String.valueOf(bilGenap[i - j]);

					} else {
						pola[i][j] = String.valueOf(bilGanjil[i - j]);

					}

				} else {
					pola[i][j] = " ";

				}
				idx += 1;

			}
		}
		// cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%5S", pola[i][j]);
				;
			}
			System.out.println();
		}
	}

}
