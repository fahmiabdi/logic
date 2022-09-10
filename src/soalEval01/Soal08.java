package src.soalEval01;

public class Soal08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer y = 14;
		Integer z = 6;
		Integer pola = y;
		Integer[] bilPola = new Integer[z];
		for (int i = 0; i < bilPola.length; i++) {
			bilPola[i] = pola;
			pola -= 3;
		}
		Integer idx1 = 0;
		Integer idx2 = z - 1;
		Integer batas = (z * 4) - 2;
		String[] bilDeret = new String[batas];
		for (int i = 0; i < bilDeret.length; i++) {
			if (i < batas / 2) {
				if (i % 2 == 1) {
					bilDeret[i] = "*";
				} else {
					bilDeret[i] = String.valueOf(bilPola[idx1]);
					idx1 += 1;
				}
			} else {
				if (i % 2 == 1) {
					bilDeret[i] = String.valueOf(bilPola[idx2]);
					idx2 -= 1;
				} else {
					bilDeret[i] = "*";

				}
			}
		}
		for (int i = 0; i < bilDeret.length; i++) {
			System.out.printf("%3S", bilDeret[i]);
		}

//		2 for output
//		for (int i = 0; i < z + (z - 1); i++) {
//			if (i % 2 == 1) {
//				System.out.printf("%5s", "*");
//			} else {
//				System.out.printf("%5s", bilPola[idx1]);
//				idx1 += 1;
//			}
//		}
//		for (int i = 0; i < z + (z - 1); i++) {
//			if (i % 2 == 1) {
//				System.out.printf("%5s", "*");
//			} else {
//				System.out.printf("%5s", bilPola[idx2]);
//				idx2 -= 1;
//			}
//		}

	}
}
