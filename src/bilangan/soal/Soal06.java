package src.bilangan.soal;

public class Soal06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -2 4 100 -8 10 100
		// Variabel
		Integer n = 9;
		Integer[] bilGenap = new Integer[n];
		Integer genap = 2;

		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer bilke = 1;

		// Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGenap[i] = genap;
			genap += 2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if (bilke == 1) {
				deret = bilGenap[i] * (-1);
				bilke += 1;
			} else if (bilke == 2) {
				deret = bilGenap[i];
				bilke += 1;
			} else if (bilke == 3) {
				deret = bilGenap[i] = 100;
				bilke += 1;
			} else if (bilke == 4) {
				deret = bilGenap[i] = -100;
				bilke = 1;
			}

//			else {
//			}
			bilDeret[i] = deret;
		}
		// Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5S", bilDeret[i]);
		}

	}

}
