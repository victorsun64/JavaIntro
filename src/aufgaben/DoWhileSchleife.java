package aufgaben;

import java.util.ArrayList;
import java.util.Scanner;

public class DoWhileSchleife {

	private static Scanner scanner;

	public static void main(String[] args) {
		ArrayList<String> linecontent = new ArrayList<String>();
		String t;
		int i, j;

		scanner = new Scanner(System.in);
		String line = "";
		while (!line.equals("z")) {
			line = scanner.nextLine();
			linecontent.add(line);
		}
		int n = linecontent.size();
		for (i = 1; i < n; i++) {
			for (j = 0; j < (n - i); j++) {
				if (linecontent.get(j).compareToIgnoreCase(linecontent.get(j + 1)) > 0) {
					t = linecontent.get(j);
					linecontent.set(j, linecontent.get(j + 1));
					linecontent.set(j + 1, t);
				}
			}
		}
		System.out.println(linecontent);
	}

}
