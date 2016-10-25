import java.util.Scanner;

//Realiza un programa que calcule la nota que hace falta sacar en el segundo
//examen de la asignatura Programación para obtener la media deseada. Hay
//que tener en cuenta que la nota del primer examen cuenta el 40% y la del
//segundo examen un 60%.


public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float nota1;
		float operacion;
		float media;
		
		System.out.println("Introduzca la nota del primer examen de Programación: ");
		nota1 = teclado.nextFloat();
		
		System.out.println("¿Qué nota quieres sacar en el trimestre?");
		media = teclado.nextFloat();
		
		operacion = (media - nota1*0.4f)/0.6f;
		
		System.out.println("Para sacar un " + media);
		System.out.printf("Tienes que sacar un %.2f" , operacion);
		System.out.println(" en el segundo examen.");

	}

}
