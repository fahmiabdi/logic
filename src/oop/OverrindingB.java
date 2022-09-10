package src.oop;

public class OverrindingB extends OverrindingA{
	public void minum() {
		System.out.println("ngopi");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrindingB ob = new OverrindingB();
		ob.minum();
		OverrindingA oa = new OverrindingB();
		oa.minum();
		oa.makan();
	
	}

}
