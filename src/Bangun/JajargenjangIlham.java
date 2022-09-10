package src.Bangun;

public class JajargenjangIlham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int ni=n;
		int nj=n;
		String [][] pola= new String[ni][nj];
		
		//2. variable
		
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if ( i> j  ) {
					pola[i][j]="";
				} else if (i<j-2) {
					pola[i][j]="";
				}
				else {
					pola[i][j]="x";
				}
		  }
		}

		
		//3. cetak
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3s",pola[i][j]);
			}
			
			System.out.println();
		}
	}

}
