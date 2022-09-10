package src.bilangan;

public class BilanganpangkatBalik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Integer n=8;
			Integer [] Bilanganpangkat = new Integer[n];
			Integer awal =0;
			Integer pangkat =2;
			Integer nilaipangkat = 0;
			
			
		
			//pola
			
			for (int i = 0; i < Bilanganpangkat.length; i++) {
				nilaipangkat = (int) Math.pow(awal, pangkat);
				Bilanganpangkat[i]=nilaipangkat;
				awal+=1;
			}
			//cetak
			for (int i = 0; i < Bilanganpangkat.length; i++) {
				System.out.printf("%3S",Bilanganpangkat[i]);
			}
	}}
