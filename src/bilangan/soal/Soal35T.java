package src.bilangan.soal;

public class Soal35T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 7 5 3 1
		Integer nGanjil=9;
		Integer [] deretGanjil = new Integer[nGanjil];
		Integer ganjil = 1;
		
		// pola ganjil
		for (int i = 0; i < deretGanjil.length; i++) {
			deretGanjil[i]=ganjil;
			ganjil=ganjil+2;
		}
		
		Integer n=9;
		Integer[] bilDeret = new Integer[n];
		Integer deret =0;
		Integer nTengah = n / 2;
		Integer idxGanjil = 0;
		// pola deret
		for (int j = 0; j < bilDeret.length; j++) {
			deret = deretGanjil[idxGanjil];
			bilDeret[j]= deret;
			if (j<nTengah)
			{
				idxGanjil = idxGanjil+1;
			}
			else {
				idxGanjil = idxGanjil-1;
			}
		}
		//cetak
		for (int j = 0; j < bilDeret.length; j++) {
			System.out.printf("%3S", bilDeret[j]);
		}
		
	}
		
	}


