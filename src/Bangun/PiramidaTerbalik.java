package src.Bangun;

public class PiramidaTerbalik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 9;
		Integer ni = (n/2)+1;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				pola[i][j] = " ";
			}
		}
		Integer idx = 0;
		Integer batas = 0;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j) {
					idx = i;
					batas = n-(i*2);
					for (int j2 = 0; j2 < batas; j2++) {
						pola[i][idx] = "*";
						idx += 1;
					}
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
