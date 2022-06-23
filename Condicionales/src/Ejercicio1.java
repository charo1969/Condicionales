import java.util.Scanner;

/**
 * 1. Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
iguales. 
 * @author charo
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num1=teclado.nextInt();
		
		System.out.println("Introduce otro numero: ");
		int num2=teclado.nextInt();
		
		if(num1==num2) {
			System.out.println("Los numeros son iguales ");
		} else if(num2>num1) {
			System.out.println("El menor es "+ num1+" y El mayor es "+ num2);
		} else {
			//System.out.println("El menor es "+ num2+" El mayor es "+ num1);
			System.out.printf("El menor es %d y el mayor es %d", num2,num1);
		}
		
		
	}

}
