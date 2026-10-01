/**
 * 
 */
package outputvariableproject;
import java.text.*;
import java.util.Locale;

/**
 * 
 */
public class outputvariableproject {

	/**
	 * 
	 */
	public outputvariableproject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numero=123098;
		double pi=Math.PI;
		
		String status = "";
		int grade = 8;
		
		System.out.printf("%d %n",numero);
		System.out.printf("%08d %n",numero);
		System.out.printf("%+d %n",numero);
		Locale.setDefault(Locale.US);
		DecimalFormat formato1 = new DecimalFormat("###,###.##");
		String valorFormateado1 = formato1.format(numero);
		System.out.printf("%s %n",valorFormateado1);
		
		System.out.println("manejo de operador condicional");

		status = (grade >= 7) ? "pased" : "Fail";

		System.out.println(status);

		
	}

}
