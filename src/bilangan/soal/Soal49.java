package src.bilangan.soal;

public class Soal49 {

	public static void main(String[] args) {
		// Variabel
		Integer n = 5;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;

		// Pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		Integer nDeret = (n * 2) - 1;
		Integer[] bilDeret = new Integer[nDeret];
		Integer deret = 0;
		Integer idxGanjil = 0;
		Integer bilKe = 1;

		for (int i = 0; i < bilDeret.length; i++) {
			deret = bilGanjil[idxGanjil];
			if (bilKe == 1) {
				idxGanjil += 1;
				bilKe += 1;
			} else if (bilKe == 2) {
				bilKe = 1;
				deret = 5;
			}
			bilDeret[i] = deret;
		}
		// Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5S", bilDeret[i]);
		}

	}

}
