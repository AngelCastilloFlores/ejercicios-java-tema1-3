import java.util.Scanner;

//Realiza un conversor de Kb a Mb.
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	    double Kb;
		double operacion;
		
		System.out.println("Introduzca la cantidad de Kb que quiere convertir a Mb: ");
		Kb = teclado.nextInt();
		
		operacion = (Kb / 1000);
		
		System.out.println("La cantidad de Kb convertida a Mb es de :" + operacion);

	}

}
