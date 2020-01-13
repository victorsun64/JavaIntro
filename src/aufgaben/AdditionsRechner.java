package aufgaben;

import java.util.Scanner;

public class AdditionsRechner {

public static void main(String[] args) {
long zahl1,zahl2,ergebnis;
Scanner scanner = new Scanner(System.in);
//
System.out.println("Geben Sie bitte die erste Zahl ein:");
zahl1=scanner.nextLong();
System.out.println("Geben Sie bitte die zweite Zahl ein:");
zahl2=scanner.nextLong();
ergebnis=zahl1+zahl2;
System.out.println("Das Ergebnis ist: " + ergebnis);
}}