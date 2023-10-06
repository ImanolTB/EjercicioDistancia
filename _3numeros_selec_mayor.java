package EjerciciosEntornoDesarrollo;

import java.util.Scanner;

public class _3numeros_selec_mayor {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Proporcione primer numero");
		num1= sc.nextInt();
		System.out.println("Proporcione segundo numero");
		num2= sc.nextInt();
		System.out.println("Proporcione primer numero");
		num3= sc.nextInt();
		if (num1>num2&&num1>num3) {
			System.out.println("El primer número es el mayor");
		}
		else if(num2>num1&&num2>num3) {
			System.out.println("El segundo número es el mayor");
		}
		else if (num3>num1&&num3>num2) {
			System.out.println("El tercer número es el mayor");
		}
		else {
			System.out.println("Todos son iguales");
		}
	}

}
