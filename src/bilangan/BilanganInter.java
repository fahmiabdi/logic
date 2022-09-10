package src.bilangan;

public class BilanganInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Integer n=10;
				Integer [] Bilanganinter = new Integer[n];
				Integer inter =1;
				
				//pola
				for (int i = 0; i < Bilanganinter.length; i++) {
					Bilanganinter[i]=inter;
					
					if(2<=i)
					
						inter = Bilanganinter[i-2]+Bilanganinter[i-1]+Bilanganinter[i];
				}
				
				//cetak
				for (int i = 0; i < Bilanganinter.length; i++) {
					System.out.printf("%5S", Bilanganinter[i]);
		}
	}

}
