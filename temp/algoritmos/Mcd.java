package algoritmos;

import java.util.Scanner;

public class Mcd {

    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }

    public static void main(String[] args) {
        // entrada por teclado estandar        
        System.out.print("Ingrese el primer numero: ");
        int a = Integer.parseInt(args[0]);
        System.out.print("Ingrese el segundo numero: ");
        int b = Integer.parseInt(args[1]);
        int mcd = calcularMCD(a, b);
        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
    }
}
