package src.bilangan.soal;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 X 100 4 X 100 10 x 100 16
		Integer n=10;
		Integer[] bilGenap = new Integer[n];
		Integer genap=2;
		Integer indexGenap =0;
		String [] bilDeret = new String [n];
		String deret = "";
		Integer bilKe =1;
		
		//pola
		for (int i = 0; i < bilDeret.length; i++) {
			bilGenap[i]=genap;
			genap+=2;
		}
		for (int i = 0; i < bilDeret.length; i++) {
			if (bilKe==1) {
				deret=String.valueOf(bilGenap[indexGenap]);
				bilKe = bilKe+ 1;
				indexGenap =indexGenap+1;
			}
			else if (bilKe==2) {
				deret = "x";
				bilKe += 1;
				indexGenap +=2;
				bilGenap[i+1]=bilGenap[i];

			}
			else if (bilKe ==3)
			{
			
				deret = "100";
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
