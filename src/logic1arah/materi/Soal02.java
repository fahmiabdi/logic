package src.logic1arah.materi;

public class Soal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 9;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		Integer idxI = 0;
		Integer idxJ = n-1;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == idxI && j == idxJ) {
					pola[i][j] =""+idxI+","+""+idxJ;

				} else {
					pola[i][j] = " ";

				}
			}
			idxI+=1;
			idxJ-=1;
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
