package src.bilangan;

public class Bilanganpangkat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer n=10;
		Integer [] Bilanganpangkat = new Integer[n];
		Integer pangkat =1;
		
		//pola
		
		for (int i = 0; i < Bilanganpangkat.length; i++) {
			Bilanganpangkat[i]=pangkat;
			pangkat=pangkat*2;
		}
		
		//cetak
		for (int i = 0; i < Bilanganpangkat.length; i++) {
			System.out.printf("%5S", Bilanganpangkat[i]);
		}
	}

}
