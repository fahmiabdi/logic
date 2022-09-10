package src.remedialT_T;

public class Soal09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 8;
		Integer[] bilLipatan = new Integer[n];
		Integer lipatan = 1;
		Integer bilke = 0;
		for (int i = 0; i < bilLipatan.length; i++) {
			bilLipatan[i] = lipatan;
			lipatan += 2;
		}
		Integer bilLop = 0;
		for (int i = 0; i < bilLipatan.length; i++) {
			bilLop = bilLipatan[i] + bilLop;
		}
		Integer[] bilDeret = new Integer[bilLop];
		Integer deret = null;

		for (int i = 0; i < bilDeret.length; i++) {
			if (bilke < bilLop) {
				for (int j = 0; j < bilLipatan[i]; j++) {
					deret = bilLipatan[i];
					if (deret % 3 == 0) {
						deret = 0;
						bilDeret[bilke] = deret;
					} else {
						bilDeret[bilke] = deret;

					}
					bilke += 1;
				}

			}

		}
		// cetak
		for (int i = 0; i < bilDeret.length; i++) {

			System.out.printf("%5S", bilDeret[i]);
		}

	}

}
