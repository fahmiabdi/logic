package src.latihanevaluasi1;

public class Soal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 7;
		Integer[] bilGanjil = new Integer[n * n];
		Integer ganjil = 1;

		Integer[] bilDeret = new Integer[n];
		Integer deret = 0;
		Integer idxGanjil = 0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil + 2;
		}
		Integer nI = n;
		Integer nJ = n;
		String[][] pola = new String[nI][nJ];
		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				if (i == j || (i+j)==(n-1)) {
					pola[i][j] = " ";
				} else {
					pola[i][j] = String.valueOf(bilGanjil[i]);
				}
				

			}
		}
		// cetak
		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				System.out.printf("%5s", pola[i][j]);
			}
			System.out.println();
		}
	}

}
