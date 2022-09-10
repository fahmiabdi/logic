package src.latihanevaluasi1;

public class Soal05Ilham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer n = 6;
			Integer m = 2;
			Integer nI = n;
			Integer nJ = n;
			String[][] pola = new String[nI][nJ];
			// Variabel Pola duplikasi
			Integer niDup = ((n-1)*m)+1;
			Integer njDup = ((n-1)*m)+1;
			String[][] polaDup = new String[niDup][njDup];
			Integer jKanan = 0;
			Integer iBawah = 0;
			
			
			// 2 Pola
			
			//duplikasi ke bawah
		for (int dupbawah = 0; dupbawah < m; dupbawah++) {
		
			//duplikasi ke kanan
			for (int dupKanan = 0; dupKanan < m; dupKanan++) {
				// Pola original 
				for (int i = 0; i < nI; i++) {
					for (int j = 0; j < nJ; j++) { 
						// Rumus Pola Original
							if (i + j+1 <= n-1) {
								pola[i][j] = "";
								
							}else if (i + j-3 >= n-1) {
								pola[i][j] = "";
							}
							else {	
								pola[i][j] = "x";
							
							}
						// Akhir Rumus Pola Original
						if (dupKanan %2 == 0) {
							polaDup[i][j+jKanan] = pola[i][j];
						} else {
							polaDup[i][j+jKanan] = pola[i][(n-1)-j];
						}
						
						if (dupbawah-1 == 0 && dupKanan == 0) {
							polaDup[i+iBawah][j+jKanan] = pola[(n-1)-i][j];
						}else {
							polaDup[i+iBawah][j+jKanan] = pola[(n-1)-i][(n-1)-j];
						}	
									
					}
					// Akhir for j
				} // Akhir for i
				// akhir pola original
				jKanan = jKanan + n-1;
			} // Akhir for duplikasi kanan
			iBawah=iBawah + n-1;
			jKanan = 0;
		}//akhir for duplikasi bawah	
			
		
			// 3 Cetak	
			for (int i = 0; i < niDup; i++) {
				for (int j = 0; j < njDup; j++) {
					System.out.printf("%3s", polaDup[i][j]);
				}//akhir cetak j
				System.out.println();
			}//akhir cetak i
		}

	}
