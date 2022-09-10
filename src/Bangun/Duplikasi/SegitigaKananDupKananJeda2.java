package src.Bangun.Duplikasi;

public class SegitigaKananDupKananJeda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer m = 4;
		Integer l = 2;
		Integer mI = m;
		Integer mJ = m;
		String[][] pola = new String[mI][mJ];
		// Variabel Pola duplikasi
		Integer miDup = m;
		Integer mjDup = m * l + (l - 1);
		String[][] polaDup = new String[miDup][mjDup];
		Integer jKanan = 0;

		// 2 Pola
		for (int dupKanan = 0; dupKanan < l; dupKanan++) {
			// Pola original
			for (int i = 0; i < mI; i++) {
				for (int j = 0; j < mJ; j++) {
					// Rulus Pola Original
					if (i >= j) {
						pola[i][j] = "X";

					} else {
						pola[i][j] = " ";

					} // Akhir Rulus Pola Original
					polaDup[i][j + jKanan] = pola[i][j];

				}
				// Akhir for j
			} // Akhir for i
				// akhir pola original
			jKanan = jKanan + m + 1;
		} // Akhir for duplikasi kanan

		// 3 Cetak
		for (int i = 0; i < miDup; i++) {
			for (int j = 0; j < mjDup; j++) {
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
