package src.dasar;

public class Class2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variabel non array
		String mahasiswa = "indomie";
		System.out.println(mahasiswa);
		System.out.println();
		//Variabel 1 dimensi
		String[] karyawan = new String[2];
		karyawan[0] = "Warteg";
		karyawan[1] = "padang";
		for (int i = 0; i < karyawan.length; i++) {
			System.out.printf("%10S",karyawan[i]);
		}
		System.out.println();
		System.out.println();
		
		//Variabel 2 dimensi
		String[][] pengusaha = new String[2][2];
		pengusaha[0][0] = "warteg";
		pengusaha[0][1] = "padang";
		pengusaha[1][0] = "restoran";
		pengusaha[1][1] = "cafe";
		for (int i = 0; i < pengusaha.length; i++) {
			for (int j = 0; j < pengusaha.length; j++) {
				System.out.printf("%10S", pengusaha[i][j]);
			}
			System.out.println();
		}
	}

}
