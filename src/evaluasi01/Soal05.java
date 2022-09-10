package src.evaluasi01;

public class Soal05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 2;
		Integer m = 4;
		n = n + 1;
		// Paket Ganjil
		Integer[] bilGenap = new Integer[n * n * n * n];
		Integer genap = 2;

		Integer[] bilDeret = new Integer[n * n * n];
		Integer deret = 0;
		Integer bilke = 1;
		Integer idxGenap = 0;
		// Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 4;
		
		}
		
		for (int i = 0; i < bilDeret.length; i++) {
			deret = bilGenap[idxGenap];
			idxGenap+=1;
			bilDeret[i] = deret;

		} // 1 Variabel
		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];
		// Variabel Pola Duplikasi
		Integer niDup = n * 3;
		Integer njDup = n * 3;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;

		// 2 Variabel
		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < n - 1; dupBawah++) {
			// for duplikasi kanan
			for (int dupKanan = 0; dupKanan < n - 1; dupKanan++) {
				// Index Arah
				Integer idxAtas = 0;
				Integer idxKanan = idxAtas + n;
				Integer idxBawah = (idxKanan * 3) - 3;
				Integer idxKiri = idxBawah + (n - 2);

				// Pola Original
				for (int i = 0; i < nI; i++) {
					for (int j = 0; j < nJ; j++) {
						// Rumus Pola original
						if (i == 0) {
							// x x x
							//
							pola[i][j] = String.valueOf(bilDeret[idxAtas]);
							idxAtas = idxAtas + 1;
						} else if (j == n - 1) {
							// x
							// x
							// x
							pola[i][j] = String.valueOf(bilDeret[idxKanan]);
							idxKanan = idxKanan + 1;
						} else if (i == n - 1) {
							// x
							// x
							// x
							pola[i][j] = String.valueOf(bilDeret[idxBawah]);
							idxBawah = idxBawah - 1;
						} else if (j == 0) {
							//
							// x x x x
							pola[i][j] = String.valueOf(bilDeret[idxKiri]);
							idxKiri = idxKiri - 1;

						} else {
							pola[i][j] = " ";
						}

						// Akhir Rumus Pola Original
						polaDup[i + iBawah][j + jKanan] = pola[i][j];

					} // Akhir for j
				} // Akhir for i
					// akhir pola original
				jKanan = jKanan + (n * 2);
			}
			// akhir for duplikasi kanan
			iBawah = iBawah + (n * 2);
			jKanan = 0;
		}

		// 3 Cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null)
					System.out.printf(" ");
				else
					System.out.printf("%3s", polaDup[i][j]);
			}
			System.out.println();
		}

	}

}
