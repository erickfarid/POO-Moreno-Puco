package laab.epn.edu.ec;
import java.lang.String;
import java.util.Scanner;

public class Clase2 {

	public Clase2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
		//int a=5;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese la edad: ");
		int edad = sc.nextInt();
		System.out.println("La edad dentro de 10 años sera: "+(edad+10));
		System.out.println("Ingrese el nombre: ");
		sc.nextLine(); //este captura el enter
		String nombre = sc.nextLine();
		System.out.print(nombre+" tiene "+edad+ " años.");// contantentaciones 
		
		
		sc.close();
		
	}
}
