package src.Bangun;

public class SegitigaKananKosong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j || i==(n-1) || j==0) {
					pola[i][j] = "*";

				} else {
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