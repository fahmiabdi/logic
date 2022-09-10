package src.bilangan.soal;

public class Soal29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 4 6 8 10 12 14 16 18 90
				Integer n=10;
				Integer [] deretgenap = new Integer[n];
				Integer genap = 2;
				Integer jumlah = 0;
				
				// pola
				for (int i = 0; i < deretgenap.length; i++) {
					if (i < n-1) {
						
					deretgenap[i]=genap;
					genap=genap+2;
					jumlah=jumlah+deretgenap[i];
					}
					else
					deretgenap[i]=jumlah;
				}
				// cetak
				for (int i = 0; i < deretgenap.length; i++) {
					System.out.printf("%3S", deretgenap[i]);
				}

	}

}
