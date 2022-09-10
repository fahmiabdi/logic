package src.Bangun.SegitigaIsi;

public class SegitigaKananGanjil7Coba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer bilke = n - 1;

		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil += 2;
		}
		for (int i = 0; i < bilGanjil.length; i++) {
			deret = bilGanjil[i];
			bilDeret[bilke] = deret;
			bilke -= 1;
		}
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i >= j) {

					pola[i][j] = String.valueOf(bilDeret[i]);
					if (i<n/2) {
						
					} else {

					}
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
