//Escribe un programa que calcule el �rea de un rect�ngulo.

import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int area;
		int b;
		int h;
		
		System.out.println("Introduzca la base del rect�ngulo en metros: ");
		b = teclado.nextInt();
		
		System.out.println("A continuaci�n, introduzca la altura del rect�ngulo en metros: ");
		h = teclado.nextInt();
		
		area = (b * h);
		System.out.println("El area del rect�ngulo es: " + area);
		

	}

}
