package src.Bangun;

public class KotakPenuhGanjil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 9;
		String [] bilGanjil = new String[n*n];
		Integer ganjil = 1;
		Integer idxAngka = 0;
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i] = String.valueOf(ganjil);
			ganjil = ganjil + 2;

		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					
				System.out.printf("%5S",bilGanjil[i]);
					idxAngka+=1;
			}
			System.out.println();
		}
	}

}
