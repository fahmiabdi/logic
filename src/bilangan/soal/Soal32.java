package src.bilangan.soal;

public class Soal32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -1 3 -5 7 -9 11 -13 15 -17 9
		//Variabel
		
		Integer n=10;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret=0;
		Integer bilke=1;
		
		Integer positif =0;
		Integer negatif =0;
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil +=2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			
			if(bilke == 1 && i < n-1)
			{
				deret = bilGanjil[i]*(-1);
				negatif -=bilGanjil[i];				
				bilDeret[i]=deret;
				bilke +=1;
			}
			else if(bilke == 2 && i < n-1)
			{
				deret = bilGanjil[i];
				positif +=bilGanjil[i];
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
