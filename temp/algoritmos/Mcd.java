package algoritmos;

public class Mcd {

    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int mcd = calcularMCD(a, b);
        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
    }
}
