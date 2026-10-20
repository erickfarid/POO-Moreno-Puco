package ec.edu.epn.poo.lab3;

import java.util.Locale;
import java.util.Scanner;
 
public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        final double IVA = 0.15;
 
        // Catálogo en arreglos paralelos (solución provisional: ver Semana 4)
        String[] nombres = {"Cuaderno", "Esfero", "Borrador", "Regla", "Carpeta"};
        double[] precios = {2.50, 0.75, 0.40, 1.20, 3.10};
        int[] stock = {10, 50, 30, 0, 8};
        int[] carrito = new int[nombres.length];   // unidades compradas
 
        int opcion;
        do {
            System.out.println();
            System.out.println("=== CAJA REGISTRADORA ===");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Agregar producto");
            System.out.println("3. Ver recibo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            
            //TODO 1: validar que la opción sea un entero (Parte IV)
           
            
            while (!sc.hasNextInt()) {
                System.out.print("No es un entero. Cantidad (1 a 20): ");
                sc.next();                          // descarta el token inválido
            }
            
            opcion = sc.nextInt();
            
            
 
            switch (opcion) {
                case 1 -> {
                    //TODO 2: mostrar código, nombre, precio y stock (Parte V)
                	 for (int i = 0; i < nombres.length; i++) {
                         System.out.printf(Locale.US, "%-4d %-10s %7.2f %6d%n",
                                 i + 1, nombres[i], precios[i], stock[i]);
                     }
                }
                case 2 -> {
                    // TODO 3: pedir el código (1 a nombres.length) y validarlo:
                    //         entero y dentro del rango (Parte IV)
                	
                	 do {
                		 
                		 System.out.print("Código del producto (1 a " + nombres.length + "): ");
                         
                         while (!sc.hasNextInt()) {
                             System.out.print("No es un entero. Cantidad (1 a 20): ");
                             sc.next();                          // descarta el token inválido
                         }
                         opcion = sc.nextInt();
                         if (opcion < 1 || opcion > 20) {
                             System.out.println("Fuera de rango.");
                         }
                     } while (opcion < 1 || opcion > 20);
                     System.out.println("Cantidad aceptada: " + opcion);
              
                	
                	
                    // TODO 4: pedir la cantidad (> 0). Si hay stock suficiente,
                    //         sumarla a carrito[] y restarla de stock[];
                    //         si no, mostrar "Stock insuficiente (disponible: N)"
                }
                
                case 3 -> {
                    // TODO 5: recorrer el carrito, mostrar las filas con
                    //         cantidad > 0 y acumular el subtotal (Parte V)
                    // TODO 6: descuento por monto (Parte III), IVA 15 % sobre
                    //         (subtotal - descuento) y resumen con printf
                }
                case 0 -> System.out.println("Gracias por su compra.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
