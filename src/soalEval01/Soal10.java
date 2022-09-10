package src.soalEval01;

public class Soal10 {

	public static void main(String[] args) {
		Integer n = 2;

		String[][] pola1 = new String[2][8];
		String[][] pola2 = new String[3][8];
		String[][] pola3 = new String[4][8];

		for (int i = 0; i < pola1.length; i++) {
			for (int j = 0; j < 8; j++) {
				if (j > 1 && j < 6) {
					pola1[i][j] = "*";
				} else {
					pola1[i][j] = " ";
				}
			}
		}
		for (int i = 0; i < pola2.length; i++) {
			for (int j = 0; j < 8; j++) {
				if (j > 0 && j < 7) {
					pola2[i][j] = "*";
				} else {
					pola2[i][j] = " ";
				}
			}
		}
		for (int i = 0; i < pola3.length; i++) {
			for (int j = 0; j < 8; j++) {
				pola3[i][j] = "*";
			}
		}

		if (n == 2) {
			for (int i = 0; i < pola1.length; i++) {
				for (int j = 0; j < 7; j++) {
					System.out.printf("%3S", pola1[i][j]);
				}
				System.out.println();
			}
			for (int i = 0; i < pola2.length; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.printf("%3S", pola2[i][j]);
				}
				System.out.println();
			}

		} else {
			for (int i = 0; i < pola1.length; i++) {
				for (int j = 0; j < 7; j++) {
					System.out.printf("%3S", pola1[i][j]);
				}
				System.out.println();
			}
			for (int i = 0; i < pola2.length; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.printf("%3S", pola2[i][j]);
				}
				System.out.println();
			}
			for (int i = 0; i < pola3.length; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.printf("%3S", pola3[i][j]);
				}
				System.out.println();
			}

		}

	}

}
