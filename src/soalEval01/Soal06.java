package src.soalEval01;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];

		Integer niDup = n * 2;
		Integer njDup = (n * n);
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;
		for (int dupBawah = 0; dupBawah < 2; dupBawah++) {
			for (int dupKanan = 0; dupKanan < n; dupKanan++) {
				// pola
				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						pola[i][j] = "*";
						// akhir rumus pola original
						if (dupKanan % 2 == 0) {
							if (dupBawah == 0) {
								if (dupBawah>1) {
									polaDup[i + iBawah][j + (jKanan)] = pola[i][j];
									
								} else {
									polaDup[i + iBawah][j + jKanan] = pola[i][j];

								}
							} else {
								polaDup[i + iBawah][j + jKanan] = " ";
							}
						} else {
							if (dupBawah == 1) {
								polaDup[i + iBawah][j + (jKanan - 1)] = pola[i][j];
							} else {
								polaDup[i + iBawah][j + jKanan] = " ";
							}
						}
					} // akhir for j
				} // akhir for i
					// akhir pola original
				jKanan = jKanan + n;
			} // akhir duplikasi kanan
			iBawah = iBawah + n;
			jKanan = 0;

		}

		// 3 Cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%3s", "");
				} else {
					System.out.printf("%3s", polaDup[i][j]);
				}

			}
			System.out.println();
		}
	}

}
