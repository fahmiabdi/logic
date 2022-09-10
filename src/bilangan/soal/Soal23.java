package src.bilangan.soal;

public class Soal23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 3 3 6 6 6 6 6 6
		// Variabel
		Integer n = 9;
		Integer[] bilLipatan = new Integer[n];
		Integer lipatan=3;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = null;
		Integer bilke =0 ;
		for (int i = 0; i < bilDeret.length; i++) {
			bilLipatan[i]=lipatan;
			lipatan+=3;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if(bilke<n)
			{
				for (int j = 0; j < bilLipatan[i]; j++) {
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
