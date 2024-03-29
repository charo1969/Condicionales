import java.util.Scanner;

/**
 * 7. Dado el sueldo bruto de un trabajador y su n�mero de hijos, realizar un algoritmo que 
calcule los impuestos que debe pagar seg�n la siguiente tabla de tramos: 
Tramo 		Impuesto (%) 				Descuento 
0 a 1000 		0 						No aplicable 
1000 a 1600 	5 					1% por hijo (m�ximo  10%)
														 
1600 a 3000 	10 					1% por hijo (m�ximo  10%)
 
3000 a 4600 	15 					1% por hijo (m�ximo  10%) 
 
> 4600 			20 						1.5% por hijo (m�ximo 15%)

 * @author charo
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el salario: ");
		float salario = teclado.nextFloat();
		System.out.println("Introduce el n�mero de hijos: ");
		int nHijos = teclado.nextInt();
		
		float impuesto = 0, descuento =0;
		
		if(salario>=1000 && salario<1600) {
			impuesto = 0.05f;
			
			/*
			 * if(nHijos <=10){
			  descuento = 0.01f*nHijos;
			  } else {
			  	descuento=0.1f;
			  	} */
			
			descuento = 0.01f*nHijos;
			if(descuento>0.1f) {
				descuento = 0.1f;
			}
			
		}else if (salario>=1600 && salario<3000) {
			impuesto = 0.1f;
			descuento = Math.min(0.1f, 0.01f*nHijos);
		}else if (salario >=3000 && salario<4600) {
			impuesto = 0.15f;
			descuento = Math.min(0.1f, 0.01f*nHijos);
		}else if (salario >= 4600) {
			impuesto = 0.2f;
			descuento = Math.min(0.15f, 0.015f*nHijos);
		}
		
		float impuestosTotales = salario * impuesto ;
		
		impuestosTotales = impuestosTotales - (impuestosTotales*descuento);
		
		System.out.println("Los impuestos totales son: "+ impuestosTotales);
	

	}

}
