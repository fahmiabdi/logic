package src.soalEval01;

public class Soal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 2;
		Integer y = 4;
		Integer z = 3;
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

		for (int i = 0; i < x; i++) {
			bilX[i] = bilFibo[i];
			jumlah += bilX[i];
		}
		bilX[x] = bilFibo[y - 1];
		bilX[x + 1] = bilFibo[z - 1];
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
			System.out.printf("%1s", bilDeret[i]);
		}
	}

}
