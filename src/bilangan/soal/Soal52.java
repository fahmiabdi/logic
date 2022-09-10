package src.bilangan.soal;

public class Soal52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;

		// Pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		Integer[] bilGenap = new Integer[n];
		Integer genap = 2;

		// Pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}

		Integer[] bilDeretGenap = new Integer[n];
		Integer deret = 0;
		Integer bilke = n - 1;

		for (int i = 0; i < bilGenap.length; i++) {
			deret = bilGenap[i];
			bilDeretGenap[bilke] = deret;
			bilke -= 1;
		}

		Integer[] bilDeretGanjil = new Integer[n];
		Integer deretGanjil = 0;
		Integer bilkeG = n - 1;
		for (int i = 0; i < bilGenap.length; i++) {
			deretGanjil = bilGanjil[i];
			bilDeretGanjil[bilkeG] = deretGanjil;
			bilkeG -= 1;
		}
		
		Integer[] deretHasil = new Integer[n];
		Integer hasil;
		for (int i = 0; i < deretHasil.length; i++) {
			hasil = bilGenap[i]-bilGanjil[i]-bilDeretGenap[i]-bilDeretGanjil[i];
			deretHasil[i]=hasil;
			
		}		
		// Cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%5S", bilGenap[i]);
		}
		System.out.println("");

		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%5S", bilGanjil[i]);
		}
		System.out.println("");

		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%5S", bilDeretGenap[i]);
		}
		System.out.println("");
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%5S", bilDeretGanjil[i]);
		}
		System.out.println("");
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%5S", deretHasil[i]);
		}

	}

}
