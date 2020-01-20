package aufgaben;

public class Bubblesort {

	public static void main(String[] args) {
	int i,t;
	int [] zahlen = {9,1,5,7,4,6,3,2,8,0};
	for (i=0;i<zahlen.length;i++);
	if (zahlen[i]<zahlen[i+1]) {t=zahlen[i];zahlen[i+1]=zahlen[i];zahlen[i+1]=t;};
	System.out.println(zahlen);
}}