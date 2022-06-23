import java.util.Scanner;

/**
 * 2. Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
posición central si los tres se ordenasen. 

 * @author charo
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique el número 1:");
		float num1=teclado.nextFloat();
		
		System.out.println("Indique el número 2:");
		float num2=teclado.nextFloat();
		
		System.out.println("Indique el número 3:");
		float num3=teclado.nextFloat();
		
		if(((num1>num2) && (num1<num3)) || ((num1 > num3) && (num1<num2))) {
			System.out.println("El numero central es "+ num1);
		} else if (((num2>num1) && (num2<num3))  || ((num2 > num3) && (num2<num1))) {
			System.out.println("El numero central es "+ num2);
		} else {
			System.out.println("El numero central es "+ num3);
		}

	
		if(num1>Math.min(num2, num3) && num1<Math.max(num2, num3)){
			
			System.out.println("El numero central es "+ num1);	
		}else if (num2>Math.min(num1, num3) && num2<Math.max(num1, num3)){
			System.out.println("El numero central es "+ num2);
			
		}else {
			System.out.println("El numero central es "+ num3);
		}
	
	}
}


