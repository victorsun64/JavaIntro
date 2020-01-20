package aufgaben;

import java.util.Scanner;

public class TaschenRechner {

private static Scanner scanner;
	
public static void main(String[] args) {
		float zahl1,zahl2,ergebnis;
		String operator;
		scanner = new Scanner(System.in);
		System.out.println("Geben Sie bitte die erste Zahl ein:");
		zahl1=scanner.nextFloat();
		System.out.println("Geben Sie bitte die zweite Zahl ein:");
		zahl2=scanner.nextFloat();
		System.out.println("Geben Sie bitte den Operator ein:");
		operator=scanner.next();
		if ("+".equals(operator))
		{ergebnis=zahl1+zahl2;System.out.println("Das Ergebnis ist: " + ergebnis);}
		else if("-".equals(operator))
		{ergebnis=zahl1-zahl2;System.out.println("Das Ergebnis ist: " + ergebnis);}
		else if("/".equals(operator))
		{ergebnis=zahl1/zahl2;System.out.println("Das Ergebnis ist: " + ergebnis);}
		else if("*".equals(operator))
		{ergebnis=zahl1*zahl2;System.out.println("Das Ergebnis ist: " + ergebnis);}
		else {System.out.println("ERR0R");};
		}}