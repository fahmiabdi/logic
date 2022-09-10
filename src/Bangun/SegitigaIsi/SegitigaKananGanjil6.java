package src.Bangun.SegitigaIsi;

public class SegitigaKananGanjil6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		Integer nilaitengah = 0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			if (i < (n / 2) + 1) {
				bilGanjil[i] = ganjil;
				ganjil += 2;
				nilaitengah = bilGanjil[(n / 2) - 1];
			} else {
				bilGanjil[i] = nilaitengah;
				nilaitengah -= 2;
			}

		}

		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i >= j) {

					pola[i][j] = String.valueOf(bilGanjil[j]);

				} else {
					pola[i][j] = " ";

				}
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
