package star_pattren;

public class Advance_tringle {
	public static void main(String[] args) {

		int rows =4;
		for (int i = 1; i <= rows; i++) {
			for (int k = 1; k <= rows - i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}

			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
