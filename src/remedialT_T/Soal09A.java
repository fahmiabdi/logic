package src.remedialT_T;

public class Soal09A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 2;
		Integer m = 5;
	
		Integer [] Bilanganlipat = new Integer[n*m];
		Integer lipat =n;
		
		//pola
		for (int i = 0; i < Bilanganlipat.length; i++) {
			if(lipat%3==0) {}
			else {}
			Bilanganlipat[i]=lipat;
			lipat +=n;
		}
		
		for (int i = 0; i < Bilanganlipat.length; i++) {
			if (Bilanganlipat[i]%3==0) {
				Bilanganlipat[i]=Bilanganlipat[i]*(-1);
			} else {

			}
		}
		
		// Variabel pola
		Integer ni = 2;
		Integer nj = 2;
		String[][] pola = new String[ni][nj];
		// Variabel Duplikat
		Integer niDup = ni;
		Integer njDup = nj * m;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer idx = 0;
		for (int dupKanan = 0; dupKanan < m; dupKanan++) {
			for (int i = 0; i < ni; i++) {
				for (int j = 0; j < nj; j++) {
					if (dupKanan % 2 == 0) {
						if (i == 1 && j == 0 || i == 1 && j == 1) {
							pola[i][j] = " ";
						} else {
							pola[i][j] = String.valueOf(Bilanganlipat[idx]);
							idx+=1;
						}
					} else {
						if (i == 1 && j == 0 || i == 1 && j == 1) {
							pola[i][j] = String.valueOf(Bilanganlipat[idx]);
							idx+=1;
						} else {
							pola[i][j] = " ";
						}
					}

					// Akhir rumus pola original
					polaDup[i][j + jKanan] = pola[i][j];
				} // Akhir for j
			} // Akhir for i
			jKanan = jKanan + nj;
		}
		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%3S", polaDup[i][j]);
			}
			System.out.println();
		}

	}

}
