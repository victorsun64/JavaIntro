package javaBasics;

public class JavaBasics {

	public static void main(String[] args) {
		System.out.println("Text");
		
		//Kommentar Text einzeilig
		
		/*mehrzeiligen
		 * Kommentar
		 */
		
		// Unterschied zwischen print und println
		System.out.print("Hallo");
		System.out.print(" ");
		System.out.print("du");
		System.out.print(" ");
		System.out.println("!");
		//
		// Textverkettung
		System.out.println("Hallo" + " " + "du" + " " + "!");
		//
		System.out.println(120);
		System.out.println(1);
		System.out.println(2);
		//
		System.out.println(123.45);
		//
		//System.out.println(123,45);
		// Rechnen
		System.out.println(2+2);
		System.out.println(4-3);
		System.out.println(3*3);
		System.out.println(9/3);
		// Rechnen #2 - Dezimalstellen
		System.out.println(8/3);
		System.out.println(8.0/3);
		System.out.println(8/3.0);
		System.out.println(9/3.0);
		// F oder D verwenden
		System.out.println(9/3F);
		System.out.println(9D/3);
		//
		System.out.println(1+1+"Ergebnis");
		System.out.println("1+1="+1+1);
		//
		System.out.println((1+1)+"Ergebnis");
		System.out.println("1+1="+(1+1));
		
	}

}
