package epn.edu.ec.pool;

public class Tienda {

	public Tienda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		producto p1 = new producto();
		p1.nombre = "Cuaderno";
		p1.stock = 10;
		p1.precio = 1.20;
		producto p2 = new producto();
		
		System.out.printf("Producto\tStock\tprecio\n");
		System.out.printf("-%s\t%d\t%.2f", p1.nombre, p1.stock, p1.precio);
		
		System.out.printf("Producto\tStock\tprecio\n");
		System.out.println( p2.nombre);
		
	}

}
