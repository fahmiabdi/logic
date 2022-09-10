package src.oop;

public class ClassKalkulator {

	public Integer tambah(Integer A, Integer B) {
		Integer C = 0;
		C = A + B;
		return C;
	}

	public Integer kurang(Integer A, Integer B) {
		Integer C = 0;
		C = A - B;
		return C;
	}

	public String gabung(String X, String Y) {
		String Z = "";
		Z = X+Y;
		return Z;
	}
	public Integer perkalian(Integer nilai1, Integer nilai2, Integer nilai3) {
		Integer nilai4 =0;
		nilai4 = nilai1*nilai2*nilai3;
		return nilai4;
	}
	
	public void hitung(Integer a) {
		
	}
	public void hitung(String a) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer A = 5;
		Integer B = 4;
		Integer C = 0;
		
		ClassKalkulator Ck = new ClassKalkulator();
		C = Ck.tambah(A, B);
		System.out.println(C);

		C = Ck.kurang(A, B);
		System.out.println(C);

		String Z = "";
		String X = "Baca";
		String Y = "Buku";
		Z = Ck.gabung(X, Y);
		System.out.println(Z);
		
		Integer nilai4=0;
		Integer nilai1 = 2;
		Integer nilai2 = 3;
		Integer nilai3 = 5;
		nilai4 = Ck.perkalian(nilai1, nilai2, nilai3);
		System.out.println(nilai4);
	}

}