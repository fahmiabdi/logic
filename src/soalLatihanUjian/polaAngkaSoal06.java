package src.soalLatihanUjian;

public class polaAngkaSoal06 {

	public static void main(String[] args) {
		Integer n = 4;
		// pola angka
		Integer bilAngka[] = new Integer[n*3];
		Integer angka = 1;
		for (int i = 0; i < bilAngka.length; i++) {
			bilAngka[i] = angka;
			angka += 1;
		}

		// pola deret
		Integer idxAngka = 0;
		String[] bilDeret = new String[n*3];
		String deret = "";

		for (int i = 0; i < bilDeret.length; i++) {
			if (i % 2 == 1) {
				deret = String.valueOf(bilAngka[idxAngka]);
				idxAngka += 1;
			} else {
				deret = "A";

			}
			bilDeret[i] = deret;
		}
		// cetak
		for (int i = 0; i < bilAngka.length; i++) {
			System.out.printf("%5s", bilDeret[i]);
		}
	}

}