package src.soalEval01;

public class Soal03DenganVariasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 11;
		Integer[] bilGanjil = new Integer[x];
		Integer ganjil = 1;
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil += 2;
		}
		Integer bilLipat = 3;
		Integer[] bilDeret = new Integer[x];
		Integer idxGanjil = 0;
		for (int i = 0; i < bilDeret.length; i++) {
			if (i % 2 == 0) {
				bilDeret[i] = bilGanjil[idxGanjil];
				idxGanjil += 1;
			} else {
				bilDeret[i] = bilLipat;
				bilLipat += 3;

			}
			if (bilDeret[i] % 3 == 0) {
				bilDeret[i] = bilDeret[i] / 3;
			} else {
			}
		}
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
