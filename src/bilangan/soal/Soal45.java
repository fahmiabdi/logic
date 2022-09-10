package src.bilangan.soal;

public class Soal45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 8 6 4 2 30
		Integer nGenap = 9;
		Integer[] bilGenap = new Integer[nGenap];
		Integer genap = 2;
		
		// Pola Genap
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap += 2;
		}
		// Pola Balik
		Integer n = 6;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer bilke = n-1;
		Integer jumlah = 0;

		for (int i = 0; i < bilDeret.length; i++) {
			if(i<n-1) {
			deret = bilGenap[i];
			bilDeret[bilke-1] = deret;
			jumlah += deret;
			bilke -= 1;
			}
			else
				bilDeret[i]=jumlah;
		}
		// cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
