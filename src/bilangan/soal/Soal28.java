package src.bilangan.soal;

public class Soal28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 11 13 15 17 19 81
		Integer n=10;
		Integer [] deretganjil = new Integer[n];
		Integer ganjil = 1;
		Integer jumlah = 0;
		// pola
		for (int i = 0; i < deretganjil.length; i++) {
			
			if(i < n-1)
			{
			deretganjil[i]=ganjil;
			ganjil=ganjil+2;
			jumlah = jumlah + deretganjil[i];
			}
			else
			deretganjil[i]=jumlah;
		}
		// cetak
		for (int i = 0; i < deretganjil.length; i++) {
			System.out.printf("%3S", deretganjil[i]);
		}
	}

	}

