import java.util.Scanner;

public class Ejercicio5 {public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese la temperatura en Celsius");
    double grados = leer.nextDouble();



    System.out.println(("La temperatura en grados Fahrenheit es: " + ((grados * 9/5) + 32)));


    }
}
