package src.arrayDuaDimensi;

public class kotakArrayAngka {

	public static void main(String[] args) {

		Integer n = 5;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				pola[i][j] = String.valueOf(i) + "," + String.valueOf(j);
			}
		}

		for (int i = 0; i < pola.length; i++) {
			for (int j = 0; j < pola.length; j++) {
				System.out.printf("%5s", pola[i][j]);
			}
			System.out.println();
		}
	}

}
