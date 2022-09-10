package src.bilangan.soal;

public class Soal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 6 16 31 51 76 106 141 181
		//Variabel
		Integer n=9;
		Integer Lipatan =5;
		Integer[] bilLipatan = new Integer[n];
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = 1;
		
		
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilLipatan[i]=Lipatan;
			Lipatan+=5;
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
