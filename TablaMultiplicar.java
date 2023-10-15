package EjerciciosEntornoDesarrollo;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[] args) {
		int num;
		int i;
		int multiplicacion;
		System.out.println("Proporcione un número del 1 al 10");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		for(i=1;i<=10;i++) {
		multiplicacion= i*num;
		System.out.println(num + " * " + i + " = " + multiplicacion);		}
	}
}
