package src.bilangan.soal;

public class Soal04T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1  3 99  7 99 
		//Variabel
		Integer n=9;
		Integer[] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret=0;
		Integer bilke=1;
		
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil = ganjil +2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if(bilke == 1)
			{
				deret = bilGanjil[i];
				bilke +=1;
			}
			else if(bilke == 2)
			{
				deret = bilGanjil[i];
				bilke +=1 ;
			}
			else if(bilke == 3)
			{
				deret = bilGanjil[i]=99;
				bilke = 1;
			}
			
			else {
			}
			bilDeret[i]=deret;
		}
		//Cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5S",bilDeret[i]);
	}



	}

}
