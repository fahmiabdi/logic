package src.bilangan.latihan;

public class Lat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -1 -3 -5 -7 -9 -11 -13 . . . . 
		// Variabel
			Integer n=9;
			Integer[] bilDeret= new Integer[n];
			Integer deret =-1;
			
		// Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilDeret[i] = deret;
			deret -=2;
		}
		// Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S",bilDeret[i]);
		}
	}

}
