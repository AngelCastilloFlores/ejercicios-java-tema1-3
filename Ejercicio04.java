import java.util.Scanner;

//Ejercicio 4
//Escribe un programa que sume, reste, multiplique y divida dos números
//introducidos por teclado.


public class Ejercicio04 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		int operacion1;
		int operacion2;
		int operacion3;
		int operacion4;
		int numero1;
		int numero2;
		
		System.out.println("Introduzca un número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduzca otro número: ");
		numero2 = teclado.nextInt();
		
		operacion1 = numero1 + numero2;
		System.out.println("La suma de los dos números introducidos es: " + operacion1);
		
		operacion2 = numero1 - numero2;
		System.out.println("La resta de los dos números introducidos es: " + operacion2);
		
		operacion3 = numero1 * numero2;
		System.out.println("La multiplicación de los dos números introducidos es: " + operacion3);
		
		operacion4 = numero1 / numero2;
		System.out.println("La divisón de los dos números introducidos es: " + operacion4);
		
		

	}

}
