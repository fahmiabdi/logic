package src.logic1arah.arahplusisi;

public class Soal4arah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		// Genap
		Integer nGenap = n/2;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 2;
		Integer idxGenap = (n/2)-1 ;

		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		String arah = "kiri";
		Integer geser = 0;

		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i % 2 == 0) {
					pola[i][j] = "x";
				} else {
					pola[i][j] = " ";
					if (arah.equals("kiri")) {
						if (j == 0 + geser) {
							pola[i][j] = String.valueOf(bilGenap[idxGenap]);
						} else {
							pola[i][j] = " ";
						}
					} else {
						if (j == (n - 1) - geser) {
							pola[i][j] = String.valueOf(bilGenap[idxGenap]);
						} else {
							pola[i][j] = " ";
						}
					}
				}
			}
			if (i % 2 == 0) {

			} else {
				idxGenap = idxGenap - 1;
				geser = geser + 1;
				if (arah.equals("kiri")) {
					arah = "kanan";
				} else {
					arah = "kiri";
				}
			}
		}

		// 3 Cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3s", pola[i][j]);
			}
			System.out.println();
		}

	}

}
