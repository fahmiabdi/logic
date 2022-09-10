package src.oop;

public class ClassMethod {
	public void MethodProcedure() {
		System.out.println("Procedure");
	}

	public String MethodFunction() {
		String cetak ="Function";
		return cetak;		
	}
	
	public Integer MethodFunctionAngka() {
		Integer nilai = 9;
		return nilai;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassMethod Cm = new ClassMethod();
		Cm.MethodProcedure();
		
		String cetak = Cm.MethodFunction();
		System.out.println(cetak);
	
		Integer nilai = Cm.MethodFunctionAngka();
		Integer tambah = 10;
		Integer hasil = nilai + tambah;
		
		System.out.println(hasil);
	}

}
