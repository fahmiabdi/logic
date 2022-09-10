package src.evaluasi01;

public class Soal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 2;
		Integer y = 4;
		Integer z = 3;
		Integer n = x + y + z;
		Integer[] Bilanganfibo = new Integer[n];
		Integer fibo = 1;
		Integer[] bilX = new Integer[x + 3];
		Integer deret = 0;
		Integer jumlah = 0;
		// pola
		for (int i = 0; i < Bilanganfibo.length; i++) {
			Bilanganfibo[i] = fibo;
			if (1 <= i)
				fibo = Bilanganfibo[i - 1] + Bilanganfibo[i];
		}
		for (int i = 0; i < x; i++) {
			deret = Bilanganfibo[i];
			bilX[i] = deret;
			jumlah += deret;
		}
		bilX[x] = (Bilanganfibo[y])*(-1);
		bilX[x + 1] = Bilanganfibo[z];
		jumlah = jumlah + Bilanganfibo[y] + Bilanganfibo[z];
		bilX[x + 2] = jumlah;
		// cetak
		for (int i = 0; i < bilX.length; i++) {
			System.out.printf("%3S", bilX[i]);
		}
	}

}
