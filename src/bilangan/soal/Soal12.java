package src.bilangan.soal;

public class Soal12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 5 10 17 26 37 50 65
		//Variabel
		Integer n=9;
		Integer ganjil =1;
		Integer[] bilGanjil = new Integer[n];
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = 1;
		
		
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGanjil[i]=ganjil;
			ganjil+=2;
		}
		
		for (int i = 0; i < bilDeret.length; i++) {
			bilDeret[i]=deret;
			deret += bilGanjil[i] ;
		}

		//Cetak
		for (int i = 0; i < bilDeret.length; i++) {
		System.out.printf("%5S",bilDeret[i]);
		}
	}

}
