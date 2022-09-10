package src.bilangan.soal;

public class Soal46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 16
		// Variabel
		Integer nGanjil = 9;
		Integer[] bilGanjil = new Integer[nGanjil];
		Integer ganjil = 1;

		// Pola Ganjil
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil += 2;
		}

		// Variabel Deret
		Integer n = 5;
		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer jumlah = 0;
		// Pola Deret
		for (int i = 0; i < bilDeret.length; i++) {	
		if(i < n-1)
		{
		deret = bilGanjil[i];
		bilDeret[i]=deret;
		jumlah = jumlah + bilDeret[i];
		}
		else
		bilDeret[i]=jumlah;
		}
		// Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

	}

