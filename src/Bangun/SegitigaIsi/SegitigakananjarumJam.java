package src.Bangun.SegitigaIsi;

public class SegitigakananjarumJam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 20;
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		Integer angka = 1;
		Integer angka1 =n;
		Integer angka2= (n*2)-2;
		// 2 Variabel
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if (i == j) {
					pola[i][j] = String.valueOf(angka);
					angka+=1;
				
				}
				else if(i==n-1) {
					pola[i][j] = String.valueOf(angka1+n-1);
					angka1-=1;
				}
				else if(j==0) {

					pola[i][j] = String.valueOf(angka2+n-1);
					angka2-=1;
				}
				else {
					pola[i][j] = " ";

				}
			}
		}
		// cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3S", pola[i][j]);
				;
			}
			System.out.println();
		}


	}
}
