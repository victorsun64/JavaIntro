package aufgaben;

import java.util.ArrayList;

public class Namensort {

	public static void main(String[] args) {
		String t;
		int i, j;
		ArrayList<String> klasse = new ArrayList<String>();
		klasse.add("Basti");
		klasse.add("Viktor");
		klasse.add("Chemmy");
		klasse.add("Oleg");
		klasse.add("David");
		klasse.add("Theo");
		klasse.add("Leo");
		klasse.add("Martin");
		klasse.add("Martina");
		int n = klasse.size();
		for (i = 1; i < n; i++) {
			for (j = 0; j < (n - i); j++) {
				if (klasse.get(j).compareToIgnoreCase(klasse.get(j + 1)) > 0) {
					t = klasse.get(j);
					klasse.set(j,klasse.get(j+1));
					klasse.set(j+1,t);
				}
			}
		}System.out.println(klasse);
	}

}
