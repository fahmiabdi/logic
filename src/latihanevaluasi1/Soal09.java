package src.latihanevaluasi1;

public class Soal09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 5;
		Integer[] deretKelipatan = new Integer[x + 1];
		Integer lipat = 5;
		// pola
		for (int i = 0; i < deretKelipatan.length; i++) {

			if (i < x) {
				if (i % 2 == 0) {
					deretKelipatan[i] = lipat*(-1);
				} else {
					deretKelipatan[i] = lipat;
				}
				lipat += 5;
			} else
				deretKelipatan[i] = x;
		}
		// cetak
		for (int i = 0; i < deretKelipatan.length; i++) {
			System.out.printf("%3S", deretKelipatan[i]);
		}
	}

}
