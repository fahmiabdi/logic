package src.remedialT_T;

public class Soal05 {

	public static void main(String[] args) {

		Integer n = 5;
		Integer m = 3;
		String[][] pola = new String[n][n];
		Integer idx = n-m;
		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				if (j == idx) {
					pola[i][j] = String.valueOf(" ");
				} else {
					pola[i][j] = String.valueOf("*");

				}
			}
				idx += 1;
		}
		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				System.out.printf("%3S", pola[i][j]);
			}
			System.out.println();
		}

	}

}
