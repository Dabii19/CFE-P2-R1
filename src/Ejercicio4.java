import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el largo del rectángulo");
        int largo = leer.nextInt();

        System.out.println("Ingrese el ancho del rectángulo");
        int ancho = leer.nextInt();

        System.out.println(("El área del rectángulo es: " + (largo * ancho)));

    }
}
