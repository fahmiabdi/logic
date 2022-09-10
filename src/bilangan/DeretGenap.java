package src.bilangan;

public class DeretGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 4 6 8 10 12 14 16 18
		Integer n=9;
		Integer[] bilGenap = new Integer[n];
		Integer genap = 2;

		// pola
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}
		// cetak
		for (int i = 0; i < bilGenap.length; i++) {
			System.out.printf("%3S", bilGenap[i]);
		}
	}

}
