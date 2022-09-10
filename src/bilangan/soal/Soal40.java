package src.bilangan.soal;

public class Soal40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6 4 2 4 6 32
		Integer nGenap = 9;
		Integer[] deretGenap = new Integer[nGenap];
		Integer genap = 2;

		// pola genap
		for (int i = 0; i < deretGenap.length; i++) {
			deretGenap[i] = genap;
			genap += 2;
		}
		// pola deret
		Integer n = 6;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer nTengah = (n / 2);
		Integer idxGenap = (n / 2) + 1;
		Integer hasil = 0;
		// pola deret
		for (int j = 0; j < bilDeret.length; j++) {
			if (j < n - 1) {
				if (j < nTengah) {
					idxGenap -= 1;
				} else {
					idxGenap += 1;
				}
				deret = deretGenap[idxGenap];
				bilDeret[j] = deret;
				hasil += deret;
			} else {
				bilDeret[j] = hasil;
			}
		}

		// cetak
		for (int j = 0; j < bilDeret.length; j++) {

			System.out.printf("%3S", bilDeret[j]);

		}

	}

}