import java.util.Scanner;

public class Juego1 {
	
	public static void main(String[] args) {
	
		System.out.println("'SUMA DOS N�MEROS'");
	
	    Scanner sc = new Scanner(System.in);
	
	    int n1 = 0;
	    int n2 = 0;
	    int resultado;
	
	    System.out.println("Introduce un n�mero entero: ");
	    if (sc.hasNextInt()) {
	        n1 = sc.nextInt();
	        sc.nextLine();
	    }
	
	    System.out.println("Introduce otro n�mero entero: ");
	    if (sc.hasNextInt()) {
	        n2 = sc.nextInt();
	        sc.nextLine();
	    }
	    resultado = n1 + n2;
	
	    System.out.println("Tu resultado es: " + resultado);
    
	}

}
