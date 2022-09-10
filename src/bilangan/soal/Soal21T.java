package src.bilangan.soal;

public class Soal21T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 3 3 5 5 5 5 5

		// 1. Variabel
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;

		Integer[] bilDeret = new Integer[n];
		Integer deret;
		Integer bilKe = 0;

		// 2. Pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}

		for (int i = 0; i < bilDeret.length; i++) {
			if (bilKe < n) {
				for (int j = 0; j < bilGanjil[i]; j++) {
					deret = bilGanjil[i];
					bilDeret[bilKe] = deret;
					bilKe = bilKe + 1;
				}
			} else {

			}
		}

		// 3. Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5s", bilDeret[i]);
		}
	}

}