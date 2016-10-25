import java.util.Scanner;

//Escribe un programa que calcule el área de un triángulo. b*a / 2


public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int area;
		int b;
		int h;
		
		System.out.println("Introduzca la base del triángulo: ");
		b = teclado.nextInt();
		
		System.out.println("A continuación, introduzca la altura del triángulo: ");
		h = teclado.nextInt();
		
		area = (b * h /2);
		System.out.println("El area del triángulo es: " + area);

	}

}
