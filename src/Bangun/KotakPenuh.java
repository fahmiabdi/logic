package src.Bangun;

public class KotakPenuh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = 3;
		String[][] pola = new String [n*n][n*n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			
					pola[i][j] = "*";
			
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3S", pola[i][j]);				
			}
			System.out.println();
		}

	}

}
