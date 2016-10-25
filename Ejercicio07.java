import java.util.Scanner;

//Escribe un programa que calcule el total de una factura a partir de la base imponible.
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		double baseImpo;
		
		System.out.println("Introduzca la base imposible (precio sin iva)");
		baseImpo = teclado.nextDouble();
		
		double iva = baseImpo * 0.21;
		
		System.out.printf("Precio sin IVA");
		
		
		
		

	}

}
