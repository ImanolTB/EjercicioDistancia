package EjerciciosEntornoDesarrollo;

import java.util.Scanner;

public class SumaAcumulativa {
	public static void main(String[] args) {
		int num;
		int i;
		int suma=0;
		System.out.println("Proporcione un número");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			suma = i+suma;
		System.out.println(suma);
		}
	}
}
