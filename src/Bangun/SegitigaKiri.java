package src.Bangun;

public class SegitigaKiri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 3;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i + j >= n-1) {
					pola[i][j] = "X";

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
