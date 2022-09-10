package src.bilangan;

public class DeretAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 11 13 15 17 19
		Integer n = 3;
		Integer[] bilGanjil = new Integer[n * n];
		Integer ganjil = 1;
			// pola
		for (int i = 0; i < bilGanjil.length; i++) {

			bilGanjil[i] = ganjil;
			if (i == n + 1) {
				ganjil = 0;
			} else {
				ganjil = ganjil + 1;

			}

		}

		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", bilGanjil[i]);
		}
	}

}
