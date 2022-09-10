package src.evaluasi01;

public class Soal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 11;
		Integer[] bilGanjil = new Integer[(x / 2) + 1];
		Integer[] bilDeret = new Integer[x];
		Integer ganjil = 1;
		Integer idxGanjil = 0;
		Integer lipat3 = 0;
		Integer deret = 0;
		Integer bawah = x-1;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if (i % 2 == 0) {

				deret = bilGanjil[idxGanjil];
				idxGanjil += 1;

			}

			else {
				lipat3 += 3;
				deret = lipat3;
			}
			bilDeret[i] = deret;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5s", bilDeret[i]);
		}
		System.out.println();
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5s", bilDeret[bawah]);
			bawah-=1;
		}

	}

}
