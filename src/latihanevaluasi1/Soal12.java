package src.latihanevaluasi1;

public class Soal12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 5;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		Integer nTengah = n / 2;
		Integer[] bilDeret1 = new Integer[n];
		Integer idxderet1 = 0;
		Integer[] bilDeret2 = new Integer[n];
		Integer idxderet2 = n / 2;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < bilDeret1.length; i++) {
			bilDeret1[i] = bilGanjil[idxderet1];
			bilDeret2[i] = bilGanjil[idxderet2];
			if (i < nTengah) {
				idxderet1 += 1;
				idxderet2 -= 1;
			} else {
				idxderet1 -= 1;
				idxderet2 += 1;
			}
		}
		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", bilDeret1[i]);
		}

		System.out.println();

		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", bilDeret2[i]);
		}
	}

}