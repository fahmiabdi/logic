package src.bilangan;

public class BilanganAsli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5 6 7 8 9
		// Variabel
		Integer n = 9;
		Integer [] deretAsli= new Integer [n];
		Integer asli = 1;
		
		//pola
		for (int i = 0; i < deretAsli.length; i++) {
			deretAsli[i]=asli;
			asli=asli+1;
		}
		// cetak
		for (int i = 0; i < deretAsli.length; i++) {
			System.out.printf("%3S", deretAsli[i]);
		}
	}

}
