package src.latihanevaluasi1;

public class Soal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer[] bilDeret = new Integer[n * n];
		Integer deret;
		Integer bilKe = 0;
		Integer[] bilGenap = new Integer[n + 1];
		Integer genap = 2;
		Integer[] bilGanjil = new Integer[n + 1];
		Integer ganjil = 1;
		
		// pola
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i] = genap;
			genap = genap + 2;
		}
		// 2. Pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < n; i++) {
			if (bilKe < n * n) {
				for (int j = 0; j < bilGanjil[i]; j++) {
					deret = bilGenap[i];
					bilDeret[bilKe] = deret;
					bilKe = bilKe + 1;
				}
			} else {

			}
		}

		// 3. Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5s", bilDeret[i]);
		}
	}

}
