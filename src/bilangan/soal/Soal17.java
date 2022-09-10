package src.bilangan.soal;

public class Soal17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 -1 -5 -11 -19 -29 -41 -55 -71
		//Variabel
		Integer n=9;
		Integer Lipatan =-2;
		Integer[] bilLipatan = new Integer[n];
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = 1;
		
		
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilLipatan[i]=Lipatan;
			Lipatan-=2;
		}
		
		for (int i = 0; i < bilDeret.length; i++) {
			bilDeret[i]=deret;
			deret += bilLipatan[i] ;
		}

		//Cetak
		for (int i = 0; i < bilDeret.length; i++) {
		System.out.printf("%5S",bilDeret[i]);
		}


	}

}
