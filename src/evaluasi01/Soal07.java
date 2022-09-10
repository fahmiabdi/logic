package src.evaluasi01;

public class Soal07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer k = 3;
		Integer l = 2;
		Integer m = 4;

		Integer mI = m;
		Integer mJ = m;
		Integer idxK = k - 1;
		String[][] pola = new String[mI][mJ];

		Integer[] bilY = new Integer[m * m * 2];
		Integer idxY = 1;
		Integer ganjil = 1;
		String[] bilDeret = new String[m * m * 2];
		Integer deret = 0;
		Integer idx1 = 0;
		// pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilY[i] = ganjil;
			ganjil += 2;
		}

		for (int i = 0; i < bilDeret.length; i++) {
			if (i == idxK) {
				deret = 333;
				idxK += k;
			} else {
				
					
					deret = bilY[idx1];
				
			}
			bilDeret[i] = String.valueOf(deret);
			idx1 += 1;
		}

		// Variabel Pola duplikasi
		Integer miDup = m;
		Integer mjDup = m * l + (l - 1);
		String[][] polaDup = new String[miDup][mjDup];
		Integer jKanan = 0;
		Integer idxAwal = 0;
		Integer idxbawah2 = 0;
		if (m == 4) {
			idxbawah2 = m * 2;
		} else {
			idxbawah2 = (m * 2) - 1;
		}
		// 2 Pola
		for (int dupKanan = 0; dupKanan < l; dupKanan++) {
			Integer idxSamping = m - 1;
			Integer idxKanan = m;
			Integer idxBawah = 0;

			// Pola original
			for (int i = 0; i < mI; i++) {
				for (int j = 0; j < mJ; j++) {
					// Rulus Pola Original
					if (i == 0) {
						pola[i][j] = String.valueOf(bilDeret[idxBawah]);
						idxBawah += 1;
					}
					else if ((i + j) == (m - 1)) {
						pola[i][j] = String.valueOf(bilDeret[idxSamping]);
						idxSamping -= 1;

					} else if (j == 0) {
						pola[i][j] = String.valueOf(bilDeret[idxKanan]);
						idxKanan += 1;
					}  else {
						pola[i][j] = " ";
					}
					// Akhir Rulus Pola Original
					polaDup[i][j + jKanan] = pola[i][j];

				}
				// Akhir for j
			} // Akhir for i
			idxSamping = idxAwal; // akhir pola original
			jKanan = jKanan + m + 1;
		} // Akhir for duplikasi kanan

		// 3 Cetak
		for (int i = 0; i < miDup; i++) {
			for (int j = 0; j < mjDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%5s", "");
				} else {
					System.out.printf("%5s", polaDup[i][j]);
				}

			}
			System.out.println();
		}

	}

}
