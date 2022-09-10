package src.Bangun;

public class pola01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;
		Integer m = 1;
		Integer[] bilY = new Integer[n * n];
		Integer idxY = 1;

		String[] bilDeret = new String[n * n];
		String deret = "";
		Integer idx1 = 0;
		// pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilY[i] = m;
			m += n;
		}

		for (int i = 0; i < bilDeret.length; i++) {
			if (i % 2 == 0) {
				deret = String.valueOf(bilY[idx1]);	
			} else {
				deret = "*";
				idx1 -=1;
			}	
			bilDeret[i] = deret;
			idx1+=1;
		}
		// cetak
		for (

				int i = 0; i < bilY.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}
	}

}
