package src.latihanevaluasi1;

public class Soalpola6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 2;
		Integer ni = n * n;
		Integer nj = n * n-1;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i < n && j < n) {
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
