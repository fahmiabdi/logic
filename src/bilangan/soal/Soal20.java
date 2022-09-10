package src.bilangan.soal;

public class Soal20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 44 41 47 44 50 47 53 50 56
		//Variabel
		Integer n=9;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = 44;
		Integer pola =1;
		
		//Pola		
		for (int i = 0; i < bilDeret.length; i++) {
			
			if(pola == 1)
			{
				bilDeret[i]=deret;
				pola +=1;
			}else if(pola==2)
			{
				bilDeret[i]=deret;
				deret-=3;
				pola +=1;
			}else if(pola==3)
			{
				bilDeret[i]=deret;
				deret+=6;
				pola = 2;
			}
			else
			{
				
			}
			bilDeret[i]=deret;
		}

		//Cetak
		for (int i = 0; i < bilDeret.length; i++) {
		System.out.printf("%5S",bilDeret[i]);
		}


	}

}
