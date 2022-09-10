package src.soalEval01;

public class Soal07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer k = 3;
		Integer l = 2;
		Integer m = 4;

		Integer[] bilPola = new Integer[20];
		Integer ganjil = 1;
		for (int i = 1; i < bilPola.length; i++) {
			bilPola[i] = ganjil;
			ganjil += 2;
		}
		for (int i = 1; i < bilPola.length; i++) {
			if (i % k == 0) {
				bilPola[i] = 999;
			} else {
			}
		}

		String[][] pola = new String[m][m];
		Integer niDup = m;
		Integer njDup = m * l;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;

		for (int dupKanan = 0; dupKanan < l; dupKanan++) {
			// Arah
			Integer idxSamping = m;
			Integer idxKanan = m+1;
			Integer idxBawah = (m*3)-3;

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					if (i + j == m - 1) {
						pola[i][j] = String.valueOf(bilPola[idxSamping]);
						idxSamping -= 1;
					} else if (j == m - 1) {
						pola[i][j] = String.valueOf(bilPola[idxKanan]);
						idxKanan += 1;
					} else if (i == m - 1) {
						pola[i][j] = String.valueOf(bilPola[idxBawah]);
						idxBawah -= 1;
					} else {
						pola[i][j] = " ";
					}
					polaDup[i][j + jKanan] = pola[i][j];
				} // akhir for j
			} // akhir for i
				// akhir pola original
			jKanan = jKanan + m;
		}
		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				System.out.printf("%5S", polaDup[i][j]);
			}
			System.out.println();
		}
//		for (int i = 1; i < bilPola.length; i++) {
//			
//				System.out.printf("%5s", bilPola[i]);
//			
//		}
	}

}
