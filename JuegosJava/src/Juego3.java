
	/**
	 * Esto es un ejemplo de documentaci�n
	 *
	 * @see java.lang.Object
	 * @author Mar�a
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
	 * @param a -> primer par�metro
	 * @param b -> segundo par�metro
	 * @exception NumberFormatException en caso de que sea una String en vez de un n�mero
	 */
	
 Scanner sc = new Scanner(System.in);

 int a1 = (int) ((Math.random() * 100)+1);
 int b1; 
 int i; 
 


 System.out.println("El juego consiste en averiguar un n�mero secreto de 100 posibles.");

 System.out.print("Tienes 5 intentos. Escribe un n�mero entre 1 y 100: ");
 b1 = sc.nextInt();

 for (i=0; i<=4; i++) { 

    // Primero se eval�a si se ha acertado.
    
    if (a1 == b1) {  
      System.out.println("�Has acertado!"); 
      break; } 
    
    // Luego da la partida por perdida si ya has gastado 5 intentos.     
    
    else if (i == 4) { 
      System.out.println("Lo siento: �has perdido!. El n�mero era el: " + a1); 
      break; } 
    
    // Si no es ninguno de los casos anteriores, comparamos n�meros.
    
    else if (a1 > b1) 
      System.out.println("El n�mero secreto es MAYOR que " + b1);
    else if (a1 < b1)
      System.out.println("El n�mero secreto es MENOR que " + b1);

    // Por �ltimo un bucle if que sirve para dar una pista y avisarte de la �ltima oportunidad.
    
    if (i <=1) { 
     System.out.print("Otro intento: "); 
     b1 = sc.nextInt(); } 
    else if (i ==2) { 
    int x = (int) (a1/10);
    System.out.println("Una pista, la primera cifra es " + x);
    System.out.print("Int�ntalo de nuevo: ");
    b1 = sc.nextInt(); } 
   else if (i >= 3) {
   System.out.print("Oh, oh... �LTIMO intento: ");
   b1 = sc.nextInt(); }
    }
  }

	@Deprecated
	public float devolverFloat() {
	    return this.devolverFloat();
	}
	/**
	 * @deprecated Este m�todo ya no se utiliza debido a la reciente versi�n
     * @return nada
	 */
	
}