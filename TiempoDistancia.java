package EjerciciosEntornoDesarrollo;

import java.util.Scanner;

public class TiempoDistancia {
	public static void main(String[] args) {
		float distancia;
		float velocidad;
		float tiempo;
		System.out.println("Dime la distancia del viaje en kms");
		Scanner sc= new Scanner(System.in);
		distancia= sc.nextFloat();
		System.out.println("Dime la velocidad promedio en kms por hora");
		velocidad= sc.nextFloat();
		tiempo=distancia/velocidad;
		System.out.println("El tiemepo del viaje  es de: " + tiempo + " horas.");
				
	}

}
