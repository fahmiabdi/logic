package src.oop;

public class ClassTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pola = new String[2];
		pola[0] = "nol";
		pola[1] = "satu";
		try {
			System.out.println(pola[7]);
		} finally {
			System.out.println("biasa aja");
		}
	}

}
