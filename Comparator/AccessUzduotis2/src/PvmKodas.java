import java.util.Arrays;

public class PvmKodas {

	public static void main(String[] args) {

		Integer[] naujasMasyvas = tikrintiPVMkoda("213179412");

		int C1 = naujasMasyvas[0], C2 = naujasMasyvas[1], C3 = naujasMasyvas[2], C4 = naujasMasyvas[3],
				C5 = naujasMasyvas[4], C6 = naujasMasyvas[5], C7 = naujasMasyvas[6], C8 = naujasMasyvas[7],
				C9 = naujasMasyvas[8];
	//	System.out.println(" " + C1 + C2 + C3 + C4 + C5 + C6 + C7 + C8 + C9);
		System.out.println(tikrinti(C1,C2,C3,C4,C5,C6,C7,C8,C9));
	}

	public static boolean tikrinti(int C1, int C2, int C3, int C4, int C5, int C6, int C7, int C8, int C9) {
		int C9t;
		int A1 = 1 * C1 + 2 * C2 + 3 * C3 + 4 * C4 + 5 * C5 + 6 * C6 + 7 * C7 + 8 * C8;
		int R1 = A1 % 11;
		if (R1 != 10) {
			C9t = R1;
		} else {
			int A2 = 3 * C1 + 4 * C2 + 5 * C3 + 6 * C4 + 7 * C5 + 8 * C6 + 9 * C7 + 1 * C8;
			int R2 = A2 % 11;
			if (R2 == 10) {
				C9t = 0;
			} else {
				C9t = R2;
			}
		}
		
		if(C9==C9t&&C8==1) {
			return true;
		}
		else {return false;}
		//return true;
	}

	public static Integer[] tikrintiPVMkoda(String number) {

		StringBuilder sb = new StringBuilder();
		StringBuilder newString = null;
		for (int i = 0; i < number.length(); i++) {
			newString = sb.append(number.charAt(i)).append(",");
			if (i + 1 == number.length()) {

			}

		}

		String naujas = newString.toString();

		naujas = naujas.substring(0, naujas.length() - 1);

		String[] gauta = naujas.split(",");

		Integer.parseInt(gauta[0]);
		Integer[] masyvas = new Integer[9];

		for (int i = 0; i <= 8; i++) {
			masyvas[i] = Integer.parseInt(gauta[i]);
		}
		return masyvas;

	}
}
