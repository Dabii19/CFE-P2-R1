import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer valor de compra");
        int valor1 = leer.nextInt();

        System.out.println("Ingrese el segundo valor");
        int valor2 = leer.nextInt();

        System.out.println("Ingrese el tercer valor");
        int valor3 = leer.nextInt();

        int total = valor1 + valor2 + valor3;

        System.out.println("El valor total con el IVA incluído es: " + ((total * 0.22) + total));
    }
}
