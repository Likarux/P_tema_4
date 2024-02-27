package app;
/**
 * Clase donde se establecen los metodos para mostrar los mensaje y se usan metodos para 
 * la elecion de opcion en el menu.
 *@see leer.Leer
 *@version 1.0
 *@sice :04/02/2024
 *@param Metodo de la clase Leer datoInt()
 *@retun mensajes de texto
 *
 * Importa la clase Leer desde el paquete leer.
 */


public class Aplicacion {

	/*
	 * Metodo estatico para mostrar una mensaje por consola.
	 */
	public static void Mensaje_Inicial() {

		System.out.println("Bienvenido a la tienda virtual\n\n"
				+ "El programa simula una tienda que vende juegos, música y cine\n"
				+ "Solamente se pueden vender productos si aparecen disponibles en la tienda\n"
		);
	}
	/*
	 * Metodo estatico para mostrar una mensaje a forma de menu apra interactuar con el programa.
	 */
	
	public static void Opciones_Menu() {

		System.out.println("\nSeleccione que desea realizar:\n"
				+ "\n" 
				+ "\t1. Mostrar productos. (Listar productos)\n"
				+ "\t2. Comprar productos\n" 
				+ "\t3. Mostrar caja. (Importe total de la compra actual)\n"
				+ "\tSALIR --> Pulse cualquier otro número\n");
	}
	/*
	 * Metodo estatico para mostrar el pie de mensaje en consola.
	 */
	public static void Mensaje_Fin() {

		System.out.println("---- Gracias por usar este software. ----");
	}

	


}

