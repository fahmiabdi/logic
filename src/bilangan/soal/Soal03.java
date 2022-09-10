package src.bilangan.soal;

public class Soal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel
		// 1 3 -5 7 9 -11 13 15 -17
		Integer n=10;
		Integer[] bilDeret= new Integer[n];
		Integer deret =1;
		Integer pengali;
		
	// Pola
	for (int i = 0; i < bilDeret.length; i++) {
		bilDeret[i] = deret;
		deret+=2;
		if(i%3==2)
		
			bilDeret[i]=bilDeret[i]*-1;
		
		else
			bilDeret[i]=bilDeret[i];
		
	}
	// Cetak
	for (int j = 0; j < bilDeret.length; j++) {
		System.out.printf("%5S",bilDeret[j]);
	}

	}

}
