package src.bilangan.soal;

public class Soal35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// 1 3 5 7 9 7 5 3 1
		Integer n=9;
		Integer [] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		Integer nilaitengah=0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			if (i<(n/2)+1)
			{
				bilGanjil[i]=ganjil;
				ganjil+=2;	
				nilaitengah=bilGanjil[(n/2)-1];
			}
			else {
			bilGanjil[i]=nilaitengah;
			nilaitengah-=2;
			}
			
			
			
		}
		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", bilGanjil[i]);
		}
	}

}
