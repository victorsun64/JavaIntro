package javaBasics;

public class Bedingung {

	public static void main(String[] args) {
		// 
		if (1<3) {
			System.out.println("1 ist kleiner als 3");
		}
		//
//		if (3<1) {
//			System.out.println("3 ist kleiner als 1");
//		}
		//
		int zahlA;
		int zahlB;
		//
		zahlA = 3;
		zahlB = 1;
		//
		int zahlC = 5, zahlD = 4;
		//
		if (zahlA < zahlB) {
			System.out.println(zahlA + " ist kleiner als " + zahlB);
		} else {
			System.out.println(zahlA + " ist nicht kleiner als " + zahlB);
		}
		// abfrage auf gleich ==
		if (zahlA == zahlB) {	
		}
		// nicht gleich
		if (zahlA != zahlB) {	
		}
		//
		if ("hans" == "hans") {
			System.out.println("Hans");
		}
		String nameA = "hans";
		String nameB = "hans";
		//
		if (nameA == nameB) {
			System.out.println(nameA);
		}
		// alte Variante String Vergleich
		if ("hansi".contentEquals("hansi")) {
			System.out.println("hansi");
		}
		// Klammern
		if (0<1)
			System.out.println("juhu");
			System.out.println("abc");
	}

}
