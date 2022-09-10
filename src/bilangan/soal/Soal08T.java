package src.bilangan.soal;

public class Soal08T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 -4 100 6 -8 100
		//Variabel
		Integer n=10;
		Integer[] bilGenap = new Integer[n];
		Integer genap=2;
		Integer indexGenap =0;
		Integer [] bilDeret = new Integer [n];
		Integer deret = 0;
		Integer bilKe =1;
		
		//pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGenap[i]=genap;
			genap+=2;
		}
		
		for (int i = 0; i < bilDeret.length; i++) {
			if (bilKe==1) {
				deret=bilGenap[indexGenap]*(-1);
				bilKe = bilKe+ 1;
				indexGenap =indexGenap+1;
			}
			else if (bilKe==2) {
				deret = bilGenap[indexGenap];
				bilKe += 1;
				indexGenap +=2;
			}
			else if (bilKe ==3)
			{
			
				deret = 100;
				bilKe=1;
				bilGenap[i+1]=bilGenap[i];
			}
			else
			{
				
			}
			bilDeret[i]=deret;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%5S",bilDeret[i]);
	}
	}

}
