package src.dasar;

public class ForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5
		
		Integer panjang=5;
		Integer [] bilangan= new Integer [panjang];
		Integer awal =1;
		for (int i = 0; i < panjang; i++) {
			bilangan[i]=awal;
			awal=awal+1;
		}
		
		for (int i = 0; i < panjang; i++) {
			System.out.printf("%3S",bilangan[i]);
		}
		
	}

}
