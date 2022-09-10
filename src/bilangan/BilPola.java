package src.bilangan;

public class BilPola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 11 13 15 17 19
		Integer n = 3;
		Integer[] bilPola = new Integer[n*n];
		Integer pola = 1;

		// pola
		for (int i = 0; i < bilPola.length; i++) {
			bilPola[i] = pola;
			pola = pola + 1;

		}
		
		// cetak
		for (int i = 0; i < bilPola.length; i++) {
			System.out.printf("%3S", bilPola[i]);
		}
	}

}
