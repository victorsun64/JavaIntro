package aufgaben;

import java.util.ArrayList;

public class Namensort {

	public static void main(String[] args) {
		String t;
		int i, j;
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		int n = cars.size();
		for (i = 1; i < n; i++) {
			for (j = 0; j < (n - i); j++) {
				if (cars.get(j).compareToIgnoreCase(cars.get(j + 1)) > 0) {
					t = cars.get(j);
					cars.set(j,cars.get(j+1));
					cars.set(j+1,t);
				}
			}
		}System.out.println(cars);
	}

}
