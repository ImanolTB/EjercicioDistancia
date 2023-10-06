package EjerciciosEntornoDesarrollo;

import java.util.Scanner;

public class NombreApellido {
	public static void main(String[] args) {
		String nombre;
		String apellido;
		String saludo;
			System.out.println("Cuál es tu nombre?");
		Scanner sc= new Scanner(System.in);
		nombre= sc.nextLine();
			System.out.println(nombre);
			System.out.println("Cuál es tu apellido?");
		apellido= sc.nextLine();
			System.out.println(apellido);
		saludo= "Hola " + nombre + " " + apellido;
		System.out.println(saludo);
	}

}
