import java.util.Scanner;

/*Escribir un programa que pida el nombre y la edad de un participante
	 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
	 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
	 el programa de generation Java Full Stack".
	 En caso de no cumplirse la condición, mostrar un mensaje que diga
	 "No cumples lo requisitos para el bootcamp Java Full Stack"*/

public class ControlDeFlujo { //Declaramos una clase

	public static void main(String[] args) { //Default
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("¿Cual es tu nombre?"); // Pedimos nombre
		String nombre = leer.nextLine(); // Leemos el texto ingresado
		System.out.println(saludo(nombre)); 

		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Por favor ingresa tu edad:"); // Ingresamos la edad
		int edad = leerEdad.nextInt();
		String mensaje = bootcamp(edad,nombre);
		System.out.println(mensaje);
	}

	public static String bootcamp(int edad, String nombre) {
		String mensaje = "";
		if (edad >= 18 && edad <= 29) {
			mensaje = "¡Felicidades "+ nombre + ", estás aceptado en el programa de generation Java Full Stack!";
		} else {
			mensaje = "¡Lo siento "+ nombre + ", no cumples con los requisitos para el bootcamp Java Full Stack!";
		}

		return mensaje;

	}

	public static String saludo(String saludo) { // Creamos un metodo "saludo"

		return "¡Hola " + saludo + "!";
		
	}
}
