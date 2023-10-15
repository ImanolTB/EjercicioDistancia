package EjerciciosEntornoDesarrollo;

import java.util.Scanner;

public class SwitchSemana {
	public static void main(String[] args) {
		int dia;
		System.out.println("Introduzca un número del 1 al 7 para que retorne el dia de la semana");
		Scanner sc= new Scanner(System.in);
		dia=sc.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("El número seleccionado no corresponde con ningun dia de la semana");
			break;
		}
	}
}
