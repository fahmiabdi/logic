package src.oop;

public class Function {

	public Integer doInteger() {
		Integer nilai = 100;
		return nilai;
	}

	public String doString() {
		String huruf = "ABC";
		return huruf;
	}

	public Integer[] doIntegerBanyak() {
		Integer nilai1 = 1000;
		Integer nilai2 = 2000;
		Integer[] nilai = new Integer[2];
		nilai[0] = nilai1;
		nilai[1] = nilai2;
		return nilai;
	}

	public String[] doKota() {
		String kota1 = "Bali";
		String kota2 = "Bandung";
		String kota3 = "Papua";
		String[] kota = new String[3];
		kota[0] = kota1;
		kota[1] = kota2;
		kota[2] = kota3;
		return kota;
	}

	public Object[] doVariasi() {
		String nama = "tocow";
		Integer usia = 24;
		Object[] kirim = new Object[2];
		kirim[0] = nama;
		kirim[1] = usia;
		return kirim;
	}

	public void finalize() {
		System.out.println("pertamakali");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function f = new Function();
		Integer nilai = 0;
		nilai = f.doInteger();
		System.out.println(nilai);

		String huruf = "";
		huruf = f.doString();
		System.out.println(huruf);

		Integer[] nilaiBanyak = f.doIntegerBanyak();
		System.out.println(nilaiBanyak[0]);
		System.out.println(nilaiBanyak[1]);

		String[] kota = f.doKota();
		System.out.println(kota[0]);
		System.out.println(kota[1]);
		System.out.println(kota[2]);

		String negara ="Jerman";
		System.out.println(negara);
		StringBuffer provinsi = new StringBuffer();
		provinsi.append("banten");
		System.out.println(provinsi);
		provinsi.setLength(3);
		System.out.println(provinsi);
		
		String kalimat = "    tulis        ";
		String tanda = "a";
		System.out.println(kalimat+tanda);
		System.out.println(kalimat.trim()+tanda);
		
		Object[] kirim = f.doVariasi();
		System.out.println(kirim[0]);
		System.out.println(kirim[1]);
// 		object bisa semua variabel

		final Integer angka = 987;
//		angka = 1;
		try {
			System.out.println("try");
		} finally {
			System.out.println("finaly");
			// TODO: handle finally clause
		}
//	 finalize untuk method yang di panggil otomatis
//		f = null;
//		System.gc();
		
	
	}

}
