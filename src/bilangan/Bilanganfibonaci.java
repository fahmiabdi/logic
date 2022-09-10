package src.bilangan;

public class Bilanganfibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=10;
		Integer [] Bilanganfibo = new Integer[n];
		Integer fibo =1;
		
		//pola
		for (int i = 0; i < Bilanganfibo.length; i++) {
			Bilanganfibo[i]=fibo;
			if(1<=i)			
				fibo = Bilanganfibo[i-1]+Bilanganfibo[i];
		}
		
		//cetak
		for (int i = 0; i < Bilanganfibo.length; i++) {
			System.out.printf("%3S", Bilanganfibo[i]);
		}
	}

}
