package src.evaluasi01;

public class Soal08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 11 13 15 17 19
		Integer y = 10;
		Integer z = 3;
		Integer[] bilY = new Integer[10];
		Integer idxY = y + 3;
		Integer idxbil = 0;
		
		// pola
		for (int i = 0; i < (z * 2)-1; i++) {

			if (i < z) {
				idxY -= 3;
			} else {
				idxY += 3;
			}
			bilY[i] = idxY;
		}
		if(z==2)
		{
		idxbil =6;	
		}
		else if (z ==3)
		{
			idxbil = 10;
		}
		String[] bilDeret = new String[idxbil];
		String deret = "";
		Integer idx1 = 0;
		Integer idx2 = z - 1;
		for (int i = 0; i < bilDeret.length; i++) {
			if (i < (z * 2) - 1) {
				if (i % 2 == 0 ) {
					if (i%1 ==0) {
						deret = String.valueOf(bilY[idx1]*(-1));
						
					} else {
						deret = String.valueOf(bilY[idx1]);

					}
					idx1 += 1;
				} else {
					deret = "*";
				}
			} else {
				if (i % 2 == 1) {
					deret = String.valueOf(bilY[idx2]);
					idx2 -= 1;
				} else {
					deret = "*";
				}
			}
			bilDeret[i] = deret;

		}
		// cetak
		for (

				int i = 0; i <bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}
	}

}
