package aufgaben;

public class Bubblesort {

	public static void main(String[] args) {
		int i, n, t = 0;
		int[] zahlen = { 9, 1, 5, 7, 4, 6, 3, 2, 8, 0 };
		for (i = zahlen.length; i > 1; --i) {
			for (n = 0; i < n - 1; n++) {
				if (zahlen[i] > zahlen[i + 1]) {
					zahlen[i] = t;
					zahlen[i + 1] = zahlen[i];
					t = zahlen[i + 1];
	     		}
			}
		}System.out.println(zahlen);
	}
}