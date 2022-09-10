package src.latihanevaluasi1;

public class Soal14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;

		Integer[] bilDeret = new Integer[(n*2)-1];
		Integer deret = 0;
		
		Integer idxGanjil = 0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		
		for (int i = 0; i < bilDeret.length; i++) {
			if (i%2==0) {
				deret = bilGanjil[idxGanjil];
			} else {
				deret = n;
				idxGanjil-=1;
			}
			idxGanjil+=1;
			bilDeret[i] = deret;

		}

		// cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}
	}

}
