package src.bilangan.soal;

public class Soal22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 2 4 4 4 4 6 6 6
		// Variabel
		Integer n=14;
		Integer[] bilGenap = new Integer[n];
		Integer genap=2;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret= null;
		Integer bilke = 0;
		Integer indikator = 0;
		// pola
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i]=genap;
			genap+=2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			indikator = n - bilke;

			if(bilke<n && bilGenap[i]<indikator)
			{
				for (int j = 0; j < bilGenap[i]; j++) {
					deret = bilGenap[i];
					bilDeret[bilke]=deret;
					bilke +=1;
					
				}
			}
			else {
				for (int j = i; j < indikator+i; j++) {
					deret = bilGenap[i];
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
