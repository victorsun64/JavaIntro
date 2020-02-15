package aufgaben;

public class Bubblesort {

	public static void main(String[] args) {
		int[] zahlen = { 9, 1, 5, 7, 4, 6, 3, 2, 8, 0 };
		int n = zahlen.length;
		int t = 0;
		int i, j;
		for (i = 1; i < n; i++) {
			for (j = 0; j < (n - i); j++) {
				if (zahlen[j] > zahlen[j + 1]) {
					t = zahlen[j];
					zahlen[j] = zahlen[j + 1];
					zahlen[j + 1] = t;
				}
			}
		}
		for (i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + " ");
		}
	}
}
