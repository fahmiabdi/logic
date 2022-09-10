package src.bilangan.latihan;

public class Lat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -1 -2 -3 -4 -5 -6 -7 -8 -9
		// Variabel
		Integer n =9;
		Integer[] bilDeret = new Integer[n];
		Integer deret=-1;
		// pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilDeret[i]=deret;
			deret-=1;
			
		}
		// Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S",bilDeret[i]);
		}
	}

}
