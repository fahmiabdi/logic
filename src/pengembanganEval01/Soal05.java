package src.pengembanganEval01;

public class Soal05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 2;
		Integer m = 5;
		Integer o = 3;

		// Pola
		String[] bilPola = new String[o * 3];
		for (int i = 0; i < bilPola.length; i++) {
			if (i % 2 == 0) {
				bilPola[i] = String.valueOf(n);
				n += m;

			} else {
				bilPola[i] = " ";

			}
		}

		// Variabel Kotak
		Integer ni = o;
		Integer nj = o;
		String[][] pola = new String[ni][nj];

		// Variabel pola duplikasi
		Integer niDup = o * 3;
		Integer njDup = o * 3;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;
		Integer idxAwal = 0;

		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < 3; dupBawah++) {
			for (int dupKanan = 0; dupKanan < 3; dupKanan++) {
				// Variabel Arah
				Integer idxAtas = idxAwal;
				Integer idxKanan = o;
				Integer idxBawah = (o * 3) - 3;
				Integer idxKiri = (o * 4) - 5;

				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						// rumus pola
						if (i == 0) {
							pola[i][j] = String.valueOf(bilPola[idxAtas]);
							idxAtas += 1;
						} else if (j == o - 1) {
							pola[i][j] = String.valueOf(bilPola[idxKanan]);
							idxKanan += 1;
						} else if (i == o - 1) {
							pola[i][j] = String.valueOf(bilPola[idxBawah]);
							idxBawah -= 1;
						} else if (j == 0) {
							pola[i][j] = String.valueOf(bilPola[idxKiri]);
							idxKiri -= 1;
						} else {
							pola[i][j] = "*";
						} // Akhir rumus pola

						if (dupKanan == dupBawah) {
							polaDup[i + iBawah][j + jKanan] = pola[i][j];
						} else if (dupKanan + dupBawah == 2) {
							polaDup[i + iBawah][j + jKanan] = pola[i][j];
						} else {
							polaDup[i + iBawah][j + jKanan] = " ";

						}
					} // akhir for j
				} // akhir for i
					// akhir pola original
				jKanan = jKanan + (o);
			} // akhir dup kanan
			iBawah = iBawah + (o);
			jKanan = 0;
		}

		// cetak
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
