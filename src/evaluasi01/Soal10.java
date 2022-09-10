package src.evaluasi01;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer ni = (n * 2) + 1;
		Integer nj = (n * 3);
		String[][] pola = new String [ni][nj];
		
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				if(i == 0 && j == nj-1 || i == n-1 && j==0)
				{
					pola[i][j] = " ";
				}
					else {
					pola[i][j] = "*";
				}
			}
		}
		for (int i = 0; i < ni; i++) {
			for (int j = 0; j < nj; j++) {
				System.out.printf("%3S", pola[i][j]);				
			}
			System.out.println();
		}

	}

}
