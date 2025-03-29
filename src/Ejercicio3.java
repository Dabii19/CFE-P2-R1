import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el año en el que nos encontramos");
        int anio = leer.nextInt();

        System.out.println("Ingrese su año de nacimiento");
        int anioNacimiento = leer.nextInt();

        System.out.println(("Tu edad es: " + (anio - anioNacimiento)));
    }
}
