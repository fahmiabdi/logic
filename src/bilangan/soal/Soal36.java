package src.bilangan.soal;

public class Soal36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 4 6 4 2
		Integer nGenap=9;
		Integer [] deretGenap = new Integer[nGenap];
		Integer genap = 2;
		
		// pola ganjil
		for (int i = 0; i < deretGenap.length; i++) {
			deretGenap[i]=genap;
			genap+=2;
		}
		
		Integer n=5;
		Integer[] bilDeret = new Integer[n];
		Integer deret =0;
		Integer nTengah = n / 2;
		Integer idxGenap = 0;
		// pola deret
		for (int j = 0; j < bilDeret.length; j++) {
			deret = deretGenap[idxGenap];
			bilDeret[j]= deret;
			if (j<nTengah)
			{
				idxGenap +=1;
			}
			else {
				idxGenap -=1;
			}
		}
		//cetak
		for (int j = 0; j < bilDeret.length; j++) {
			System.out.printf("%3S", bilDeret[j]);
		}
		

	}

}
