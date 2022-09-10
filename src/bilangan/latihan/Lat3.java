package src.bilangan.latihan;

public class Lat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel
					Integer n=9;
					Integer[] bilDeret= new Integer[n];
					Integer deret =-2;
					
				// Pola
				for (int i = 0; i < bilDeret.length; i++) {
					bilDeret[i] = deret;
					deret -=2;
				}
				// Cetak
				for (int i = 0; i < bilDeret.length; i++) {
					System.out.printf("%5S",bilDeret[i]);
				}
	}

}
