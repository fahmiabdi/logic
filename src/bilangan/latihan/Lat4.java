package src.bilangan.latihan;

public class Lat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel
		Integer n=9;
		Integer[] bilDeret= new Integer[n];
		Integer deret =-4;
		
		// Pola
		for (int i = 0; i < bilDeret.length; i++) {
		bilDeret[i] = deret;
		deret -=4;
		}
		// Cetak
		for (int i = 0; i < bilDeret.length; i++) {
		System.out.printf("%5S",bilDeret[i]);
		}
	}

}
