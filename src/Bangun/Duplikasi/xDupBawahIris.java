package src.Bangun.Duplikasi;

public class xDupBawahIris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer m = 3;

		// Variabel X
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Variabel Pola Dup
		Integer niDup = ((n-1)*m)+1;
		Integer njDup = n;
		String[][] polaDup = new String[niDup][njDup];
		Integer iBawah = 0;

		// Pola Duplikasi
		for (int dupBawah = 0; dupBawah < m; dupBawah++) {
			// Pola Original
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (i == j || (i + j) == (n - 1)) {
						pola[i][j] = "X";

					} else {
						pola[i][j] = " ";

					}
					//Akhir Rumus Pola Original
					polaDup[i+iBawah][j] = pola[i][j];
				}//Akhir For j
			}//Akhir For i (Akhir Pola Original)
			iBawah = iBawah + n-1;
		}//Akhir For Duplikasi

		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%3s","");
				} else {
					System.out.printf("%3s", polaDup[i][j]);
				}
				
			}
			System.out.println();
		}
		
	}

}
