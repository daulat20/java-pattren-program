package star_pattren;

public class plus_pattren {

	public static void main(String[] args) {
		int n = 7; //Given odd number.
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (i == (n / 2) + 1 || j == (n / 2) + 1) {
					System.out.print("X ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
