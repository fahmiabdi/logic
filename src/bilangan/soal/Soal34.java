package src.bilangan.soal;

public class Soal34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 18 16 14 12 10 8 6 4 2
		Integer n=9;
		Integer [] bilGenap = new Integer[n];
		Integer genap = 2;
		Integer [] bilDeret = new Integer[n];
		Integer deret=0;
		Integer bilke =n-1;
		
		// pola
		for (int i = 0; i < bilGenap.length; i++) {
			bilGenap[i]=genap;
			genap+=2;
		}
		for (int i = 0; i < bilGenap.length; i++) {
			deret=bilGenap[i];
			bilDeret[bilke]=deret;
			bilke-=1;
		}
		// cetak
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

	}

}
