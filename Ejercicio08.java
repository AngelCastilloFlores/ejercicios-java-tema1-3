//Escribe un programa que calcule el salario semanal de un empleado en base
//a las horas trabajadas, a razón de 12 euros la hora.

import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horas;
		int operacion;
		
		System.out.println("Introduzca la cantidad de horas trabajadas por el empleado: ");
		horas = teclado.nextInt();
		
		operacion = horas * 12;
		System.out.println("El salario semanal del empleado es de :" + operacion + "€");
		
		
		

	}

}
