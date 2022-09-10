package src.bilangan;

public class BilanganLipat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=10;
		Integer [] Bilanganlipat = new Integer[n];
		Integer lipat =5;
		
		//pola
		for (int i = 0; i < Bilanganlipat.length; i++) {
			Bilanganlipat[i]=lipat;
			lipat = lipat + 5;
		}
		
		//cetak
		for (int i = 0; i < Bilanganlipat.length; i++) {
			System.out.printf("%3S", Bilanganlipat[i]);
		}
	}

}
