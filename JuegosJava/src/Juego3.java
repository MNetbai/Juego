
	/**
	 * Esto es un ejemplo de documentación
	 *
	 * @see java.lang.Object
	 * @author María
	 * @version 1.0
	 */
import java.util.Scanner;

public class Juego3 {
	/**
	 *
	 * @throws Exception 
	 */

public Juego3(int a, int b, int c) throws Exception {
	/**
	 * @param a -> primer parámetro
	 * @param b -> segundo parámetro
	 * @exception NumberFormatException en caso de que sea una String en vez de un número
	 */
	
 Scanner sc = new Scanner(System.in);

 int a1 = (int) ((Math.random() * 100)+1);
 int b1; 
 int i; 
 


 System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.");

 System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 100: ");
 b1 = sc.nextInt();

 for (i=0; i<=4; i++) { 

    // Primero se evalúa si se ha acertado.
    
    if (a1 == b1) {  
      System.out.println("¡Has acertado!"); 
      break; } 
    
    // Luego da la partida por perdida si ya has gastado 5 intentos.     
    
    else if (i == 4) { 
      System.out.println("Lo siento: ¡has perdido!. El número era el: " + a1); 
      break; } 
    
    // Si no es ninguno de los casos anteriores, comparamos números.
    
    else if (a1 > b1) 
      System.out.println("El número secreto es MAYOR que " + b1);
    else if (a1 < b1)
      System.out.println("El número secreto es MENOR que " + b1);

    // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.
    
    if (i <=1) { 
     System.out.print("Otro intento: "); 
     b1 = sc.nextInt(); } 
    else if (i ==2) { 
    int x = (int) (a1/10);
    System.out.println("Una pista, la primera cifra es " + x);
    System.out.print("Inténtalo de nuevo: ");
    b1 = sc.nextInt(); } 
   else if (i >= 3) {
   System.out.print("Oh, oh... ÚLTIMO intento: ");
   b1 = sc.nextInt(); }
    }
  }

	@Deprecated
	public float devolverFloat() {
	    return this.devolverFloat();
	}
	/**
	 * @deprecated Este método ya no se utiliza debido a la reciente versión
     * @return nada
	 */
	
}