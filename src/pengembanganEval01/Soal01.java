package src.pengembanganEval01;

public class Soal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 8;
		Integer m = 2;
		String[] pola = new String[n * n];
		Integer deret = m;
		for (int i = 0; i < pola.length; i++) {
			if (i % 2 == 0) {
				pola[i] = "*";

			} else {
				pola[i] = String.valueOf(deret);
				deret += m;
			}
		}

		Integer ni = n;
		Integer nj = n;
		String[][] gambar = new String[ni][nj];

		Integer idxKanan = 0;
		Integer idxSamping = (n*2)-2;
		Integer idxBawah =(n*2);
		for (int i = 0; i < gambar.length; i++) {
			for (int j = 0; j < gambar.length; j++) {
				if (j == 0) {
					gambar[i][j] =String.valueOf(pola[idxKanan]);
					idxKanan+=1;
				} else if (i + j == n - 1) {
					gambar[i][j] = String.valueOf(pola[idxSamping]);
					idxSamping-=1;
				} else if (i == 0) {
					gambar[i][j] = String.valueOf(pola[idxBawah]);
					idxBawah-=1;
				} else {
					gambar[i][j]=" ";
				}
			}
		}

		for (int i = 0; i < gambar.length; i++) {
			for (int j = 0; j < gambar.length; j++) {
				System.out.printf("%5S", gambar[i][j]);
			}
			System.out.println();
		}
	}

}
