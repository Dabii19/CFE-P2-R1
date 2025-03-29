import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();

        System.out.println(("Ingrese su edad"));
        int edad = leer.nextInt();

        leer.nextLine();
        System.out.println("Ingrese la ciudad en la que vive");
        String ciudad = leer.nextLine();

        System.out.println("Hola, tu nombre es " + nombre + " tenés " + edad + " años y vivis en " + ciudad);

    }
}
