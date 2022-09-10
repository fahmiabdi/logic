package src.bilangan.soal;

public class Soal27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A B B B C C C C C
		Integer n=9;
		Integer [] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		String [] bilDeret = new String[n];
		char huruf='a';
		Integer bilke = 0;
		Integer indikator = 0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i]=ganjil;
			ganjil+=2;
		}
		
		for (int i = 0; i < bilDeret.length; i++) {
		indikator = n - bilke;
		if (bilke < n && bilGanjil[i]<indikator) {
			
			for (int j = 0; j < bilGanjil[i]; j++) {
				bilDeret[bilke]=""+huruf;
				
				bilke +=1;
			}
			huruf++;
			
		}
		else {
			for (int j = i; j < indikator+i; j++) {
				bilDeret[bilke]=""+huruf;
				bilke +=1;
				}
			huruf++;
		}

		}
		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%5S", bilDeret[i]);

		}

	}

}
