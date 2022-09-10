package src.latihanevaluasi1;

public class Soal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 5;
		Integer ni = n * 2;
		Integer nj = n * 2-1;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j || (i + j) == (n - 1) || (i + j) == (n * 3) - 1) {
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
