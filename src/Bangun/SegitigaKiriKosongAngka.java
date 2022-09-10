package src.Bangun;

public class SegitigaKiriKosongAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 4;
		Integer m = 1;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		// Index Arah
		
		
		
		Integer[] bilY = new Integer[n * n];
		Integer idxY = 1;
		String[] bilDeret = new String[n * n];
		String deret = "";
		Integer idx1 = 0;
		// pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilY[i] = m;
			m += n;
		}

		for (int i = 0; i < bilDeret.length; i++) {
			if (i % 2 == 0) {
				deret = String.valueOf(bilY[idx1]);	
			} else {
				deret = "*";
				idx1 -=1;
			}	
			bilDeret[i] = deret;
			idx1+=1;
		}
		Integer idxSamping =n-1;
		Integer idxKanan = n;
		Integer idxBawah = (n*2);

		// Pola
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if ((i + j) == (n - 1)) {
					pola[i][j] = String.valueOf(idxSamping);
					idxSamping -= 1;
				} else if (j == n - 1) {

					pola[i][j] = String.valueOf(idxKanan);
					idxKanan += 1;
				} else if (i == (n - 1)) {
					pola[i][j] = String.valueOf(idxBawah);
					idxBawah -= 1;
				} else {
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
