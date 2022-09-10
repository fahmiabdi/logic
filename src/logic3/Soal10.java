package src.logic3;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 11;

		// Paket Fibonaci
		Integer[] bilFibo = new Integer[n];
		Integer fibo = 1;
		// pola
		for (int i = 0; i < bilFibo.length; i++) {
			bilFibo[i] = fibo;
			if (1 <= i)
				fibo = bilFibo[i - 1] + bilFibo[i];
		}
		Integer idxFibo = 0;
		char huruf = 'A';
		// 1 Variabel
		String[][] pola = new String[n][n];
		Integer nLayer = (n / 2) + 1;

		// 2 Variabel
		for (int layer = 0; layer < nLayer; layer++) {
			Integer iAwal = 0 + layer;
			Integer jAwal = 0 + layer;
			Integer iAkhir = n - layer;
			Integer jAkhir = n - layer;
			// awal for i pola
			for (int i = iAwal; i < iAkhir; i++) {
				for (int j = jAwal; j < jAkhir; j++) {
					if (layer % 2 == 0) {
						pola[i][j] = String.valueOf(bilFibo[idxFibo]);
					} else {
						pola[i][j] = String.valueOf(huruf);
					}
				}
			}
			// akhir for i pola
			if (layer % 2 == 0) {
				idxFibo += 1;
			} else {
				huruf++;
			}
		}

		// 3 cetak
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3S", pola[i][j]);
			}
			System.out.println();
		}
	}

}
