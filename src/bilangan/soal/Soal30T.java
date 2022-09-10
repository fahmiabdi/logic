package src.bilangan.soal;

public class Soal30T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 11 13 15 17
		Integer nGanjil = 9;
		Integer[] deretGanjil = new Integer[nGanjil];
		Integer ganjil = 1;

		// pola ganjil
		for (int i = 0; i < deretGanjil.length; i++) {
			deretGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}

		Integer n = nGanjil + 1;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer hasil = 0;

		// pola deret
		for (int i = 0; i < bilDeret.length; i++) {
			if (i < nGanjil) {
				deret = deretGanjil[i];
				if (i>0) {
					hasil = hasil - deret;
					}
				else {
					hasil =deret;
				}
			} 
			else {
				deret=hasil;
			}
			bilDeret[i] = deret;
		}
		// cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
