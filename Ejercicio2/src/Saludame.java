import java.util.Scanner;


public class Saludame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saluda();
	}
	
	public static void saluda() {
		System.out.println("¿Cual es tu nombre? ");
		Scanner in = new Scanner(System.in);
		String nombre = in.nextLine();
		System.out.println("Hola " + nombre + ", ¡mucho gusto!.");
	}
}
