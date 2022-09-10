package src.bilangan.soal;

public class Soal08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 -4 100 6 -8 100
		//Variabel
		Integer n=9;
		Integer[] bilGenap = new Integer[n];
		Integer genap = 2;
		Integer genapke=1;
		Integer genapper=0;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret=0;
		Integer bilke=1;
		
		//Pola
		for (int i = 0; i < bilDeret.length; i++) {
			if(genapke == 1)
			{
				bilGenap[i] = genap;	
				genapper = bilGenap[i];
				genapke +=1;
				genap+=2;
			}
			else if(genapke ==2)
			{
				bilGenap[i]=genap;
				genapper = bilGenap[i];
				genapke+=1;
				genap+=2;
			}	
			else if(genapke ==3)
			{
				bilGenap[i]=100;
				genapper = bilGenap[i];
				genapke=1;
				
			}
				
			bilGenap[i]=genapper;
		}
			
		for (int i = 0; i < bilDeret.length; i++) {
			if(bilke == 1)
			{
				deret = bilGenap[i];
				bilke +=1;
			}
			else if(bilke == 2)
			{
				deret = bilGenap[i]*(-1);
				bilke +=1 ;
			}
			else if(bilke == 3)
			{
				deret = bilGenap[i];
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
