package src.bilangan.soal;

public class Soal30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 11 13 15 17 -79
		Integer n=9;
		Integer [] deretganjil = new Integer[n];
		Integer ganjil = 1;
		Integer hasil = ganjil;
		Integer nDeret=n+1;
		// pola
		for (int i = 0; i < nDeret; i++) {
			if (i < n) {
				
			deretganjil[i]=ganjil;
			ganjil=ganjil+2;
			hasil = hasil - deretganjil[i];
			}
			else
				
				deretganjil[i]= hasil + deretganjil[0];
				
					}
		// cetak
		for (int i = 0; i < deretganjil.length; i++) {
			System.out.printf("%5S", deretganjil[i]);
		}
	}

}
