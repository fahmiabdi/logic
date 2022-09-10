package src.bilangan.soal;

public class Soal31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 -4 6 -8 10 -12 14 -16 18 10
		//Variabel
		
		Integer n=10;
		Integer[] bilGenap = new Integer[n];
		Integer genap = 2;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret=0;
		Integer bilke=1;
		
		Integer positif =0;
		Integer negatif =0;
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGenap[i] = genap;
			genap +=2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			
			if(bilke == 1 && i < n-1)
			{
				deret = bilGenap[i];
				positif +=bilGenap[i];
				bilDeret[i]=deret;
				bilke +=1;
			}
			else if(bilke == 2 && i < n-1)
			{
				deret = bilGenap[i]*(-1);
				negatif -=bilGenap[i];
				bilDeret[i]=deret;
				bilke =1 ;
			}
			else 
			{
				bilDeret[i]=positif+negatif;
			}
			
			
		}
		//Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5S",bilDeret[i]);
	}
	}

}
