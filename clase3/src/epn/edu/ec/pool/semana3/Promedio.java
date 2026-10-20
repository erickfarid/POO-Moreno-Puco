/**
 * 
 */
package epn.edu.ec.pool.semana3;
 

public class Promedio {

	/**
	 * 
	 */
	public Promedio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubç
		double [] precios = { 2.5, 5.3, 5.9};
		int size = precios.length;
		double suma = 0, promedio;
		
		for (double p:precios) {
			suma += p; 
			promedio = suma/size;
			
			System.out.println ("promedio: " +promedio);
		}

	}

}
