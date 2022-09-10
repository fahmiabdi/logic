package src.bilangan.soal;

public class Soal32T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ganjil
				Integer nGanjil = 9;
				Integer[] deretGanjil = new Integer[nGanjil];
				Integer ganjil = 1;

				for (int i = 0; i < deretGanjil.length; i++) {
					deretGanjil[i] = ganjil;
					ganjil = ganjil + 2;
				}

				// 1 Variabel
				Integer n = nGanjil;
				Integer[] bilDeret = new Integer[n];
				Integer deret = 0;
				Integer bilKe = 1;

				// 2 Pola
				for (int i = 0; i < bilDeret.length; i++) {
					if (bilKe == 1) {
						deret = deretGanjil[i] * -1;
						bilKe = bilKe + 1;
					} else if (bilKe == 2) {
						deret = deretGanjil[i];
						bilKe = 1;
					} else {

					}			
					bilDeret[i] = deret;
				}
				
				Integer nDeret2 = n + 1;
				Integer[] bilDeret2 = new Integer[nDeret2];
				Integer deret2 = 0;
				Integer hasil = 0;
				
				for (int i = 0; i < bilDeret2.length; i++) {
					if (i < n) {
						deret2 = bilDeret[i];
						if (i > 0) {
							hasil = hasil + deret2;
						} else {
							hasil = deret2;
						}
						
					} else {
						deret2 = hasil;
					}
					bilDeret2[i] = deret2;
					
				}
				// 3 Cetak
				for (int i = 0; i < bilDeret2.length; i++) {
					System.out.printf("%5s", bilDeret2[i]);
				}

	}

}
