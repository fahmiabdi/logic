package src.bilangan.soal;

public class Soal11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 13 7 13 21 31 43 57 73
			//Variabel
			Integer n=9;
			Integer genap=2;
			Integer[] bilGenap = new Integer[n];
			
			Integer[] bilDeret = new Integer[n];
			Integer deret = 1;
			
			//Pola
			for (int i = 0; i < bilDeret.length; i++) {
				bilGenap[i]=genap;
				genap+=2;
			}
			for (int i = 0; i < bilDeret.length; i++) {
				bilDeret[i]=deret;
				deret += bilGenap[i] ;
			}

			//Cetak
			for (int i = 0; i < bilDeret.length; i++) {
				System.out.printf("%5S",bilDeret[i]);
		}
	}

}
