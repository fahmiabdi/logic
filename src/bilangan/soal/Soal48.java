package src.bilangan.soal;

public class Soal48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9 7 5 3 1 -7
		Integer nGanjil = 9;
		Integer[] bilGanjil = new Integer[nGanjil];
		Integer ganjil = 1;

		// pola ganjil
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		
		
		//Variabel
		
		Integer n = 6;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer bilke = n-1;
		Integer jumlah = 0;
		// Pola Balik
		for (int i = 0; i < bilDeret.length; i++) {
			if(i<n-1) {
			deret = bilGanjil[i];
			bilDeret[bilke-1] = deret;
			jumlah -= deret;
			bilke -= 1;
			}
			else
				
				bilDeret[i]=jumlah+((bilDeret[0])*2);

		}

		// cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
