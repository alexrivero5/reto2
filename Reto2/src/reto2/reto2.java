package reto2;

import java.util.Scanner;

public class reto2 {

	public static void main(String[] args) {
		// creamos un escaner para leer
		Scanner sc = new Scanner(System.in);
		// creamos la variable que vamos a introducir al menu
		int n2;
		int n;
		do {
			System.out.println("Selecciona:");
			System.out.println("1. Longitud:");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			n = Integer.parseInt(sc.nextLine());

			// creamos un bucle que muestre el menu
			if (n == 3) {
				do {
					// menuTemperatura
					System.out.println("Selecciona la conversión:");
					System.out.println("1. Celsius --> Fahrenheit");
					System.out.println("2. Fahrenheit --> Celsius");
					System.out.println("0. Salir");
					// lee el valor y lo pasa a numero
					n2 = Integer.parseInt(sc.nextLine());
					// si es 1 hace "Celsius --> Fahrenheit"
					if (n2 == 1) {
						System.out.println(funciones2.Celsius_Fah(20));
					}
					// si es 2 hace "Fahrenheit --> Celsius"
					if (n2 == 2) {
						System.out.println(funciones2.Fah_Celsius(50));
					}
				} while (n2 != 0); // si es 0 sale del bucle y del programa
			}
			if (n == 4) {
				// creamos un bucle que muestre el menu
				do {
					System.out.println("Selecciona la conversión:");
					System.out.println("1. Litros --> Galones");
					System.out.println("2. Galones --> Litros");
					System.out.println("0. Salir");
					// lee el valor y lo pasa a numero
					n2 = Integer.parseInt(sc.nextLine());
					// si es 1 hace "Litros --> Galones"
					if (n2 == 1) {
						System.out.println(funciones2.Litros_Galones(2));
					}
					// si es 2 hace "Galones --> Litros"
					if (n2 == 2) {
						System.out.println(funciones2.Galones_Litros(4));
					}
				} while (n2 != 0); // si es 0 sale del bucle y del programa
			}
		} while (n != 0);

	}
}
