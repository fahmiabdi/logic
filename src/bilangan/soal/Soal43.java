package src.bilangan.soal;

public class Soal43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4 6 8 10 12
		Integer nGenap = 9;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 2;

		// pola
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;

		}
		Integer n=5;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer nTengah = (n / 2);
		Integer idxGenap = (n / 2) - 1;
		for (int i = 0; i < bilDeret.length; i++) {
		deret = bilGenap[idxGenap];
		bilDeret[i]= deret;
		idxGenap+=1;
		}
		// cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
