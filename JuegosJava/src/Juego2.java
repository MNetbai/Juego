import java.util.Scanner;

public class Juego2 {
	
	public Juego2() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int aleatorio = (int) (Math.random()*2);
		int eleccion= -1;
		do {
			System.out.println("Escoge, Cara (0) o Cruz (1)");
			eleccion = sc.nextInt();
		}while(eleccion<0 && eleccion>1);
		
		System.out.println("............. Tirando la moneda .....................");
		String resultado = (aleatorio == 0) ? "Cara":"Cruz";
		if(eleccion == aleatorio) {
			System.out.println("Has tenido mucha suerte ,ha salido " + resultado);
		}else {
			System.out.printf("No es lo tuyo esto de tirar monedas, ha salido " + resultado);
		}
		
		
	}

}
