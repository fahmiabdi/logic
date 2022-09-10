package src.Bangun;

public class SegitigaKiriAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 5;
		Integer ni = n;
		Integer nj = (n * 2) - 1;
		String[][] pola = new String[ni][nj];
		Integer idxAngka = 1;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i + j >= n - 1) {
					pola[i][j] = String.valueOf(idxAngka);

				} else {
					pola[i][j] = " ";

				}
			}
			idxAngka += 1;
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
