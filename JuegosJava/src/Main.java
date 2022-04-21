import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("Elige uno de los siguientes juegos: ");
		System.out.println("1) Acierta el resultado");
		System.out.println("2) Juego de Jaime");
		System.out.println("3) Adivina un número entre 1 y 100");
		
		do {
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
				sc.nextLine();
			}
			switch (opcion) {
			case 1:
				Juego1 juego1 = new Juego1();
				break;
			case 2:
				Juego2 juego2 = new Juego2();
				break;
			case 3:
				Juego3 juego3 = new Juego3();
				break;
			default:
				System.out.println("Elige una opción válida");
				break;
			}
		} while (opcion < 1 || opcion > 3);
			
	}

}
