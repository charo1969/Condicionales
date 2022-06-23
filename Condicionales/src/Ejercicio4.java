import java.util.Scanner;

/**
 * 4. Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
perpendiculares o no. 
 * @author charo
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Recta 1");
		System.out.println("A1: ");
		float a1 = teclado.nextFloat();
		System.out.println("B1: ");
		float b1 = teclado.nextFloat();
		System.out.println("C1: ");
		float c1 = teclado.nextFloat();
		
		System.out.println("Recta 2");
		System.out.println("A2: ");
		float a2 = teclado.nextFloat();
		System.out.println("B2: ");
		float b2 = teclado.nextFloat();
		System.out.println("C2: ");
		float c2 = teclado.nextFloat();
		
		if ((a1/a2) != (b1/b2)) {
			System.out.println("Son Secantes");
			if((a1/a2) == (b1/b2)) {
				System.out.println("Son perpendiculares");
			}else {
				System.out.println("Son paralelas");
				if((a1/a2) == (c1/c2)) {
					System.out.println("Son coincidentes");
				}
			}
			
		}
	}

}
