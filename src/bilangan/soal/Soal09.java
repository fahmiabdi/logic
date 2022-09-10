package src.bilangan.soal;

public class Soal09 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Variabel
	// -2 x 100 -8 x 100
	Integer n=9;
	String [] bilGenap = new String[n];
	Integer genap = 2;

	String [] bilDeret = new String[n];
	String deret;
	Integer bilke=1;
	
	//Pola
	for (int i = 0; i < bilDeret.length; i++) {
			bilGenap[i] = ""+genap;	
			genap+=2;
	}
	for (int i = 0; i < bilDeret.length; i++) {
		if(bilke == 1)
		{
			deret = bilGenap[i];
			bilke +=1;
		}
		else if(bilke == 2)
		{
			(bilGenap[i])="X";
			bilke +=1 ;
		}
		else if(bilke == 3)
		{
			bilGenap[i] = "100";
			bilke = 1;
		}
		
		else {
		}
	}
	//Cetak
	for (int i = 0; i < bilDeret.length; i++) {
		System.out.printf("%5S",bilGenap[i]);
}



	}

}
