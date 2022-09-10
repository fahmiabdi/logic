package src.bilangan;

public class BilanganCacah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 2 3 4 5 6 7 8 9
		// variabel
		Integer n=10;
		Integer[] deretCacah = new Integer[n];
		Integer Cacah=0;
		
		//pola
		for (int i = 0; i < deretCacah.length; i++) {
			deretCacah[i]=Cacah;
			Cacah=Cacah+1;
		}
		//Cetal
		for (int i = 0; i < deretCacah.length; i++) {
			System.out.printf("%3S", deretCacah[i]);
		}
	}

}
