package src.pengembanganEval01;

public class Soal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 8;
		Integer y = 6;
		Integer z = 7;
		Integer[] bilFibo = new Integer[x * y * z];
		Integer fibo = 1;
		for (int i = 0; i < bilFibo.length; i++) {
			bilFibo[i] = fibo;
			if (1 <= i)
				fibo = bilFibo[i - 1] + bilFibo[i];
		}

		Integer jumlah = 0;
		Integer nX = x + 3;
		Integer[] bilX = new Integer[nX];
		Integer idxfibo = 0;
		for (int i = x +1; i > 1; i--) {
			bilX[i] = bilFibo[idxfibo];
			idxfibo += 1;
			jumlah += bilX[i];
		}
		bilX[0] = bilFibo[y - 1];
		bilX[1] = bilFibo[z - 1];
		bilX[x + 2] = jumlah + bilFibo[y - 1] + bilFibo[z - 1];

		Integer idxX = 0;
		Integer nderet = (nX * 2) - 1;
		String[] bilDeret = new String[nderet];
		for (int i = 0; i < bilDeret.length; i++) {
			if (i < nderet - 2)
				if (i % 2 == 0) {
					bilDeret[i] = String.valueOf(bilX[idxX]);
					idxX += 1;
				} else {
					bilDeret[i] = "+";
				}
			else {
				bilDeret[i] = "=";
			}
			bilDeret[nderet - 1] = String.valueOf(bilX[x + 2]);
		}
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%2s", bilDeret[i]);
		}
	}

}
