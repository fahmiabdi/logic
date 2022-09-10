package src.bilangan.soal;

public class Soal18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 -2 -8 -17 -29 -44 -62 -83 -107
		//Variabel
		Integer n=9;
		Integer Lipatan =-3;
		Integer[] bilLipatan = new Integer[n];
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = 1;
		
		
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilLipatan[i]=Lipatan;
			Lipatan-=3;
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
