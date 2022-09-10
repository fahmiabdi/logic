package src.Bangun;

public class polaSoal3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Variabel
		Integer n = 4;
		Integer ni = n-1;
		Integer nj = n/2;
		String[][] pola = new String[ni][nj];

		// 2 Variabel
		for (int i = 0; i < ni ; i++) {
			for (int j = 0; j < nj ; j++) {
					if (i == 1 && j == 1) {
						pola[i][j] = " ";
					} else {
						pola[i][j] = "x";
					}	

				} 			
		}
	// cetak
	for(int i = 0;i<ni;i++)
	{
		
		for (int j = 0; j < nj; j++) {
			System.out.printf("%5S", pola[i][j]);
		
		}
		System.out.println();
	}

}

}
