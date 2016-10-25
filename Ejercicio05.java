//Escribe un programa que calcule el área de un rectángulo.

import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int area;
		int b;
		int h;
		
		System.out.println("Introduzca la base del rectángulo en metros: ");
		b = teclado.nextInt();
		
		System.out.println("A continuación, introduzca la altura del rectángulo en metros: ");
		h = teclado.nextInt();
		
		area = (b * h);
		System.out.println("El area del rectángulo es: " + area);
		

	}

}
