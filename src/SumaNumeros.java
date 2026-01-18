import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = obtenerEntero(sc, "Ingresa un número entero positivo:");
        int resultado = calcularSuma(numero);

        System.out.println("Resultado: " + resultado);
    }

    public static int obtenerEntero(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    public static int calcularSuma(int numero) {
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        return suma;
    }
}
