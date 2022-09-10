package src.bilangan;

public class DeretGanji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 11 13 15 17 19
		Integer n = 9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;

		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;

		}
		
		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", bilGanjil[i]);
		}
	}

}
