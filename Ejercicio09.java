//Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3 * π  *r2 *h

import java.util.Scanner;
public class Ejercicio09 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		double volumen;
		double h;
		double r2;
		double pi = 3.1415;
		
		System.out.println("Introduzca el radio del cono: ");
		r2 = teclado.nextDouble();
		
		System.out.println("A continuación, introduzca la altura del cono:");
		h = teclado.nextDouble();
		
		volumen = (1/3f * (pi * r2 * r2) * h);
		System.out.println("El volumen del cono es: " + volumen);
		

	}
}
