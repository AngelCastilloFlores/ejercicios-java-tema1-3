import java.util.Scanner;

//Escribe un programa que calcule el �rea de un tri�ngulo. b*a / 2


public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int area;
		int b;
		int h;
		
		System.out.println("Introduzca la base del tri�ngulo: ");
		b = teclado.nextInt();
		
		System.out.println("A continuaci�n, introduzca la altura del tri�ngulo: ");
		h = teclado.nextInt();
		
		area = (b * h /2);
		System.out.println("El area del tri�ngulo es: " + area);

	}

}
