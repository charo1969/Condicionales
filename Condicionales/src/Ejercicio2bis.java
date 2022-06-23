import java.util.Scanner;

public class Ejercicio2bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique el número 1:");
		float num1=teclado.nextFloat();
		
		System.out.println("Indique el número 2:");
		float num2=teclado.nextFloat();
		
		System.out.println("Indique el número 3:");
		float num3=teclado.nextFloat();
		
		if ((num1>=num2) && (num1>=num3)){
			
			System.out.println("el mayor es " + num1);
			
		}else if ((num2>=num1) && (num1>=num3)) {
			System.out.println("el mayor es " + num2);
			
		}else {
			System.out.println("el mayor es " + num3);
		}
		
		if(num1> num2) {
			if(num1 > num3) {
				System.out.println("el mayor es " + num1);
			}else {
				System.out.println("el mayor es " + num3);
			}
		 } else if (num2>num3) {
				System.out.println("el mayor es " + num2);
			} else {
				System.out.println("el mayor es " + num3);
		
			}
		}
	}
