package src.SoalEval01B;

public class Soal04 {

	public static void main(String[] args) {
		Integer n = 4;
		// variabel pola
		Integer ni = 4 - 1;
		Integer nj = 4 / 2;
		String[][] pola = new String[ni][nj];
		// variabel dup
		Integer niDup = ni;
		Integer njDup = nj * n;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		for (int dupKanan = 0; dupKanan < n; dupKanan++) {
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (dupKanan % 2 == 0) {
						if (i == 1 && j == 0) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "*";
						}
					} else {
						if (i == 1 && j == 1) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = "*";
						}
					}
					polaDup[i][j + jKanan] = pola[i][j];
				}
			}
			jKanan = jKanan + nj;
		}
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%3S", polaDup[i][j]);
			}
			System.out.println();
		}
	}

}
