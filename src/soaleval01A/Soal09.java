package src.soaleval01A;

public class Soal09 {

	public static void main(String[] args) {
		Integer n = 5;
		Integer[] bilGenap = new Integer[(n * 2) - 1];
		Integer genap = 0;
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap += 2;
		}
		Integer ni = n * 2;
		Integer nj = (n * 2) - 1;
		String[][] pola = new String[ni][nj];
		Integer angka1 = 1;
		Integer angka2 = n;
		Integer idxAngka1 = n - 1;
		Integer idxAngka2 = 0;
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i < n) {
					if (j >= bilGenap[idxAngka1]) {
						pola[i][j] = String.valueOf(angka1);
					} else {
						pola[i][j] = " ";
					}
				} else {
					if (j >= bilGenap[idxAngka2]) {
						pola[i][j] = String.valueOf(angka2);
					} else {
						pola[i][j] = " ";
					}
				}
			}
			if (i >= n) {
				idxAngka2 += 1;
				angka2 -= 1;
			} else {
				idxAngka1 -= 1;
				angka1 += 1;
			}
		}
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3S", pola[i][j]);
			}
			System.out.println();
		}
	}

}
