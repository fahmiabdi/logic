package src.oop;

public class ClassA {
	
	String nama = "tocow"; // method global

	public void methodPublic() {
		String cetak = "Public";
		System.out.println(nama);
	}
	
	private void methodPrivate() {
		String cetak = "Private";
		System.out.println(nama);
		
	}
	
	protected void methodProtected() {
		String cetak = "Protected";
		System.out.println(nama);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ka = new ClassA(); //instance object
		ka.methodPublic();
		ka.methodPrivate();
		ka.methodProtected();
	}

}
