package src.bilangan.soal;

public class Soal42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 14 12 10 8 6 4 2
		Integer nGenap = 9;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 2;

		// Pola Genap
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;

		}
		// Pola Deret Genap
		Integer n=5;
		Integer[] bilGenap2 = new Integer[n];
		Integer genap2 = 0;
		Integer idxGenap = 2;
		for (int i = 0; i < bilGenap2.length; i++) {	
		genap2 = bilGenap[idxGenap];
		bilGenap2[i]= genap2;
		idxGenap+=1;
		}
		// Pola Deret
		Integer[] bilDeret = new Integer [n];
		Integer deret=0;
		Integer bilke = n-1;
		for (int i = 0; i < bilGenap2.length; i++) {
			deret= bilGenap2[i];
			bilDeret[bilke]=deret;
			bilke-=1;
		}
		
		// cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
