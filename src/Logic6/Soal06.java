package src.Logic6;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;

		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];
		// Variabel Pola duplikasi
		Integer niDup = n;
		Integer njDup = n*n+(n-1);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		
		
		// 2 Pola
		for (int dupKanan = 0; dupKanan < n; dupKanan++) {
			// Pola original 
			for (int i = 0; i < nI; i++) {
				for (int j = 0; j < nJ; j++) { 
					// Rumus Pola Original
					if (i == 0) {
						// X X X
						pola[i][j] = "X";
					} else if (j == n-1) {
						//       X 
						//		 X
						//       X
						pola[i][j] = "X";
					}else if (i == n-1) {
						//
						//
						// X X X
						pola[i][j] = "X";
					}else if (j == 0) {
						// X
						// X
						// X
						pola[i][j] = "X";
					}else {
						pola[i][j] = " ";
					}
					// Akhir Rumus Pola Original
					polaDup[i][j+jKanan] = pola[i][j];
					
				}
				// Akhir for j
			} // Akhir for i
			// akhir pola original
			jKanan = jKanan + n+1;
		} // Akhir for duplikasi kanan
		
		
		// 3 Cetak
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
