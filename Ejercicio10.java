import java.util.Scanner;

//Realiza un conversor de Mb a Kb.

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	    double Mb;
		double operacion;
		
		System.out.println("Introduzca la cantidad de Mb que quiere convertir a Kb: ");
		Mb = teclado.nextInt();
		
		operacion = (Mb * 1000);
		
		System.out.println("La cantidad de Mb convertida a Kb es de :" + operacion);
		
		
	}

}
