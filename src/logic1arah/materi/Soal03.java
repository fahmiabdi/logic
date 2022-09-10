package src.logic1arah.materi;

public class Soal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		// Genap
		Integer nGenap = n;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 2;

		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}

		// 1 Variabel
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		Integer idxTambah = 0;
		Integer idxTambah2 = 0;
		Integer idxI = (n/2)+1;
		Integer idxJ = (n/2)-1;
		Integer idxI2 =0;
		Integer idxJ2 = n-1;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j) {
					pola[i][j] = String.valueOf(bilGenap[idxTambah]);
					idxTambah+=1;
					if (i > (n / 2)) {
						pola[i][j] = "*";
					}

				}
				else if (i == idxI && j==idxJ)
				{
					pola[i][j] = "*";
					idxI+=1;
					idxJ-=1;
				}
				else if (i == idxI2 && j==idxJ2)
				{
					pola[i][j] = String.valueOf(bilGenap[idxTambah2]);
					idxTambah2+=1;
					idxI2+=1;
					idxJ2-=1;
				}
				else {
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
