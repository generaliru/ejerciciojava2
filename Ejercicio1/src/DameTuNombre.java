import java.util.Scanner;

public class DameTuNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Cual es tu nombre? ");
		Scanner in = new Scanner(System.in);
		String nombre = in.nextLine();
		System.out.println("Hola " + nombre + ", ¡mucho gusto!.");
	}

}
	