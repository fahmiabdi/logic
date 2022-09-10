package src.bilangan.latihan;

public class Lat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -1 -3 - 9 -27
		Integer n=8;
		Integer [] Bilanganpangkat = new Integer[n];
		Integer pangkatatas =0;
		Integer pangkatbawah=3;
		Integer nilaipangkat= 0;
		
		
	
		//pola
		
		for (int i = 0; i < Bilanganpangkat.length; i++) {
			nilaipangkat = (int) Math.pow(pangkatbawah, pangkatatas);
			Bilanganpangkat[i]=nilaipangkat*(-1);
			pangkatatas+=1;
		}
		//cetak
		for (int i = 0; i < Bilanganpangkat.length; i++) {
			System.out.printf("%5S",Bilanganpangkat[i]);
		}
		}
	}
