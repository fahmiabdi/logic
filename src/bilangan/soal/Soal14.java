package src.bilangan.soal;

public class Soal14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 5 13 25 41 61 85 113 145
		//Variabel
		Integer n=9;
		Integer Lipatan =4;
		Integer[] bilLipatan = new Integer[n];
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = 1;
		
		
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilLipatan[i]=Lipatan;
			Lipatan+=4;
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
