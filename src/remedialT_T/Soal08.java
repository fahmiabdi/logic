package src.remedialT_T;

public class Soal08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 4;
		Integer m = 1;

		// variabel kotak
		Integer ni = n;
		Integer nj = n;
		String[][] pola = new String[ni][nj];
		// variabel pola duplikasi
		Integer niDup = (n * n);
		Integer njDup = (n * n) + m * m;
		String[][] polaDup = new String[niDup][njDup];
		Integer jKanan = 0;
		Integer iBawah = 0;

		// for duplikasi bawah
		for (int dupBawah = 0; dupBawah < 2; dupBawah++) {
			for (int dupKanan = 0; dupKanan < m; dupKanan++) {
				// variabel Arah
				Integer idxAtas = 1;
				Integer idxKanan = n + 1;
				Integer idxBawah = (n * 3) - 2;
				Integer idxKiri = (n * 4) - 4;

				Integer idxBawah2 = 1;
				Integer idxKanan2 = (n * 2) - 2;
				Integer idxKiri2 = (n * 3) - 1;
				Integer idxKiri3 = (n * 4) - 4;
				for (int i = 0; i < ni; i++) {
					for (int j = 0; j < nj; j++) {
						// rumus pola
						if (dupKanan % 2 == 0 && dupBawah % 2 == 0) {
							if (i == 0) {
								if (idxAtas % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxAtas += 1;

								} else {
									pola[i][j] = String.valueOf(idxAtas);
									idxAtas += 1;

								}
							} else if (j == n - 1) {
								if (idxKanan % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxKanan += 1;

								} else {
									pola[i][j] = String.valueOf(idxKanan);
									idxKanan += 1;

								}
							} else if (i == n - 1) {
								if (idxBawah % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxBawah -= 1;

								} else {
									pola[i][j] = String.valueOf(idxBawah);
									idxBawah -= 1;

								}

							} else if (j == 0) {
								if (idxKiri % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxKiri -= 1;

								} else {
									pola[i][j] = String.valueOf(idxKiri);
									idxKiri -= 1;

								}
							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 1 && dupBawah % 2 == 0) {
							if (i == 0) {
								if (idxAtas % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxAtas += 1;

								} else {
									pola[i][j] = String.valueOf(idxAtas);
									idxAtas += 1;

								}
							} else if (j == n - 1) {
								if (idxKanan % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxKanan += 1;

								} else {
									pola[i][j] = String.valueOf(idxKanan);
									idxKanan += 1;

								}
							} else if (i == n - 1) {
								if (idxBawah % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxBawah -= 1;

								} else {
									pola[i][j] = String.valueOf(idxBawah);
									idxBawah -= 1;

								}

							} else if (j == 0) {
								if (idxKiri % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxKiri -= 1;

								} else {
									pola[i][j] = String.valueOf(idxKiri);
									idxKiri -= 1;

								}
							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 0 && dupBawah % 2 == 1) {
							if (i == 0) {
								if (idxBawah % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxBawah -= 1;

								} else {
									pola[i][j] = String.valueOf(idxBawah);
									idxBawah -= 1;

								}

							} else if (j == n - 1) {
								if (idxKanan2 % 3 == 0) {
									pola[i][j] = String.valueOf(0);
									idxKanan2 -= 1;

								} else {
									pola[i][j] = String.valueOf(idxKanan2);
									idxKanan2 -= 1;

								}

							} else if (i == n - 1) {
								pola[i][j] = String.valueOf(idxBawah2);
								idxBawah2 += 1;

							} else if (j == 0) {
								pola[i][j] = String.valueOf(idxKiri2);
								idxKiri2 += 1;

							} else {
								pola[i][j] = " ";
							}
						} else if (dupKanan % 2 == 1 && dupBawah % 2 == 1) {
							if (i == 0) {
								pola[i][j] = String.valueOf(idxBawah);
								idxBawah -= 1;

							} else if (j == n - 1) {
								pola[i][j] = String.valueOf(idxKanan2);
								idxKanan2 -= 1;

							} else if (i == n - 1) {
								pola[i][j] = String.valueOf(idxBawah2);
								idxBawah2 += 1;

							} else if (j == 0) {
								pola[i][j] = String.valueOf(idxKiri2);
								idxKiri2 += 1;

							} else {
								pola[i][j] = " ";
							}
						} else {
						}

						polaDup[i + iBawah][j + jKanan] = pola[i][j];
					}

				}
				jKanan = jKanan + (n + 1);
			}
			iBawah = iBawah + (n);
			jKanan = 0;

		}
		// cetak
		for (int i = 0; i < niDup; i++) {
			for (int j = 0; j < njDup; j++) {
				if (polaDup[i][j] == null) {
					System.out.printf("%3s", "");
				} else {
					System.out.printf("%3s", polaDup[i][j]);
				}

			}
			System.out.println();
		}
	}

}
