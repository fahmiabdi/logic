package src.dasar;

public class BilBalikGanjil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		Integer nilaitengah = 0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			if (i < (n / 2) + 1) {
				bilGanjil[n] = ganjil;
				ganjil -= 2;
				nilaitengah = bilGanjil[(n / 2) - 1];
			} else {
				bilGanjil[i] = nilaitengah;
				nilaitengah = 2;
			}

		}

		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", bilGanjil[i]);
		}

	}

}
