package reto2;

import java.util.Scanner;

public class funciones2 {
	// pasar de Celsius a Fahrenheint
	public static double Celsius_Fah(double n) {
		return (n * (9 / 5)) + 32;
	}

	// pasar de Fahrenheint a Celsius
	public static double Fah_Celsius(double n) {
		return (n - 32) * 5 / 9;
	}

	// pasar de Litros a Galones
	public static double Litros_Galones(double n) {
		return n / 3.756;
	}

	// pasar de Galones a Litros
	public static double Galones_Litros(double n) {
		return n / 3.756;
	}

}
