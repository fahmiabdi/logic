package src.bilangan;

public class Bilanganhuruf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel
		Integer n=26;
		String[] derethuruf = new String[n];
		Integer huruf = 0;
		
		// Pola
		for (char i = 'a'; i <= 'z'; i++) {
			derethuruf[huruf]=String.valueOf(i);
			huruf = huruf + 1;
			
		}
		// Cetak
		for (int i = 0; i < derethuruf.length; i++) {
			System.out.printf("%3S",derethuruf[i]);
		}
	}

}
