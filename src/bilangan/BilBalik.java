package src.bilangan;

public class BilBalik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n=9;
		Integer [] bilGanjil = new Integer[n];
		Integer ganjil = 1;
		Integer [] bilDeret = new Integer[n];
		Integer deret=0;
		Integer bilke =n-1;
		
		// pola
		for (int i = 0; i < bilGanjil.length; i++) {
			bilGanjil[i]=ganjil;
			ganjil+=2;
		}
		for (int i = 0; i < bilGanjil.length; i++) {
			deret=bilGanjil[i];
			bilDeret[bilke]=deret;
			bilke-=1;
		}
		// cetak
		for (int i = 0; i < bilGanjil.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}
	}

}