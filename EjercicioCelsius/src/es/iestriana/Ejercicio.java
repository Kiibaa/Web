package es.iestriana;

import java.util.Scanner;

public class Ejercicio {
	
	/*
	 * Programa que realice la conversion de grados Celsius a Farenheit
	 * Los grados celsius debe introducirlos el usuario
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)  {
		System.out.println("Grados Celsius: ");
		double gradosCelsius = sc.nextDouble();
		
		// Convertir a Farenheit
		double gradosFarenheit = (gradosCelsius * 1.8) + 32;
		
		System.out.println(gradosCelsius + " grados celsius son "
							+ gradosFarenheit + " grados farenheit");
	}
}
