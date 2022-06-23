import java.util.Scanner;

/**
 * 3. Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar 
si están en la misma fila, columna, o en la misma diagonal. 
 * @author charo
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la fila: ");
		int fila1 = teclado.nextInt();
		System.out.println("Introduzca la columna: ");
		int col1 = teclado.nextInt();
		
		
		System.out.println("Introduzca la fila: ");
		int fila2 = teclado.nextInt();
		System.out.println("Introduzca la columna: ");
		int col2 = teclado.nextInt();
		
		if(fila1==fila2) {
			System.out.println("las piezas estan en la misma fila");
		}else if(col1==col2) {
			System.out.println("las piezas estan en la misma columna");
		}else if((fila1-fila2) == (col1-col2)) {
			System.out.println("la segunda está en la diagonal principal de la otra");
		}else if((fila1-fila2) + (col1-col2) == 0) {
			System.out.println("la segunda está en la diagonal secundaria de la otra");
		}else {
			System.out.println("No esta en ninguna de las dos");
		}
		
	}

}
