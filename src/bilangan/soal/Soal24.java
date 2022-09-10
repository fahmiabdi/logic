package src.bilangan.soal;

public class Soal24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4 4 4 4 8 8 8 8 8
		// Variabel
		Integer n = 9;
		Integer[] bilLipatan = new Integer[n];
		Integer lipatan=4;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = null;
		Integer bilke =0 ;
		Integer indikator;
		for (int i = 0; i < bilDeret.length; i++) {
			bilLipatan[i]=lipatan;
			lipatan+=4;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			indikator = n - bilke;
			if(bilke<n && bilLipatan[i]< indikator)
			{
				for (int j = 0; j < bilLipatan[i]; j++) {
					deret = bilLipatan[i];
					bilDeret[bilke]=deret;
					bilke +=1;
			
				}
			}
			else {
				for (int j = i; j < indikator+i; j++) {
					deret = bilLipatan[i];
					bilDeret[bilke]=deret;
					bilke +=1;
					}
			}
			
		}
		// cetak
				for (int i = 0; i < bilDeret.length; i++) {
					
					System.out.printf("%5S",bilDeret[i]);
				}


	}

}
