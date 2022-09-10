package src.bilangan.soal;

public class Soal21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 3 3 5 5 5 5 5
				Integer n=16;
				Integer [] bilGanjil = new Integer[n];
				Integer ganjil = 1;
				Integer [] bilDeret = new Integer[n];
				Integer deret = null;
				Integer bilke = 0;
				// pola
				for (int i = 0; i < bilGanjil.length; i++) {
					bilGanjil[i]=ganjil;
					ganjil+=2;
				}
				
				for (int i = 0; i < bilDeret.length; i++) {
				if (bilke < n) {
					for (int j = 0; j < bilGanjil[i]; j++) {
						deret = bilGanjil[i];
						bilDeret[bilke]=deret;
						bilke +=1;
					}
					
				}
				}
				// cetak
				for (int i = 0; i < bilGanjil.length; i++) {
					System.out.printf("%5S", bilDeret[i]);

				}
	}

}
