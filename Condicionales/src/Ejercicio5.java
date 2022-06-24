import java.util.Scanner;

/**
 * 5. Algoritmo que determine si un a�o dado es bisiesto o no, teniendo en cuenta que son 
a�os bisiestos los m�ltiplos de 4, excepto los que son tambi�n m�ltiplos de 100 pero no 
lo son de 400.
 * @author charo
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indica el a�o: ");
		int a�o = teclado.nextInt();
		
		if((a�o%4) == 0) {
			if((a�o%100 == 0 ) && (a�o%400 != 0)) {
				System.out.println("El a�o No es bisiesto");
			}else {
				System.out.println("El a�o es bisiesto");
				
			}
		}else {
			System.out.println("El a�o No es bisiesto");
		}

	}

}
