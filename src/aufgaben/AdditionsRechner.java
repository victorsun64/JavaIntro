package aufgaben;

import java.util.Scanner;

public class AdditionsRechner {

public static void main(String[] args) {
int zahl1,zahl2,ergebnis;
Scanner scanner = new Scanner(System.in);
//
System.out.println("Geben Sie bitte die erste Zahl ein:");
zahl1=scanner.nextInt();
System.out.println("Geben Sie bitte die zweite Zahl ein:");
zahl2=scanner.nextInt();
ergebnis=zahl1+zahl2;
System.out.println("Das Ergebnis ist: " + ergebnis);
}}