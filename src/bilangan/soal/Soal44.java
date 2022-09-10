package src.bilangan.soal;

public class Soal44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8 6 4 2 0
		// Variabel
		Integer nGenap = 9;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 0;

		// Pola Genap
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap += 2;
		}

		// Variabel Deret
		Integer n = 5;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer bilke = n - 1;

		// Pola Deret
		for (int i = 0; i < bilDeret.length; i++) {
			deret = bilGenap[n-i];
			bilDeret[bilke] = deret;
			bilke -= 1;
		}
		
		// Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
