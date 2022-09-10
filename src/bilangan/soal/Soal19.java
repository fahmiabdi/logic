package src.bilangan.soal;

public class Soal19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 55 57 53 55 51 53 49 51 47
		//Variabel
		Integer n=9;
		
		Integer[] bilDeret = new Integer[n];
		Integer deret = 55;
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
				pola +=1;
				deret+=2;
			}else if(pola==3)
			{
				bilDeret[i]=deret;
				deret-=4;
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
