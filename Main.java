import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número (-99999 a 99999): ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número (-99999 a 99999): ");
        int num2 = sc.nextInt();

        if (num1 < -99999 || num1 > 99999 ||
            num2 < -99999 || num2 > 99999) {

            System.out.println("Error: número fuera del rango permitido.");
            sc.close();
            return;
        }

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("Potencia: " + (int) Math.pow(num1, num2));

        sc.close();
    }
}