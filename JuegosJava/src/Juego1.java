import java.util.Scanner;

public class Juego1 {
	
	public Juego1() {
	
	    System.out.println("'ACIERTA EL RESULTADO'");
	
	    Scanner sc = new Scanner(System.in);
	
	    int n1 = (int) (Math.random() * 100);
	    int n2 = (int) (Math.random() * 100);
	    int resultado = 0;
	    int miResultado = 0;
	    
	    resultado = n1 + n2;
	
	    System.out.println(n1 + " + " + n2 + " = ?");
	    
	    System.out.println("Introduce el resultado: ");
	    if (sc.hasNextInt()) {
	        miResultado = sc.nextInt();
	        sc.nextLine();
	    }
	    
	    if (miResultado == resultado) {
	    	System.out.println("¡Acierto!, el resultado es " + resultado);
	    } else {
	    	System.out.println("¡Error!, el resultado es " + resultado);
	    }
    
	}

}
