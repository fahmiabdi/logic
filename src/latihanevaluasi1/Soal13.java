package src.latihanevaluasi1;

public class Soal13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 5;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		Integer[] bilDeret = new Integer[n + 1];
		Integer deret = 0;
		Integer jumlah = 0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if (i < n) {
				deret = bilGanjil[i];
				bilDeret[i] = deret;
				jumlah += deret;
			} else {
				bilDeret[i] = jumlah;
			}
		}
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5S", bilDeret[i]);
		}
	}

}
