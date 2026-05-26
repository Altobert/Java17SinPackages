package operator;
// Ejemplo utilizando operador binario * y cast automatico de short hacia int
// El resultado de multiplicar dos shorts es un int, por lo que se realiza un cast automático a int
public class Operator {
    public static void main(String [] args) {
        short x = 3;
	    short y  = 10;
	    var result = (int)(x * y);        
        System.out.println("***************: " + result);
        System.out.println("Ejemplo utilizando operador binario * y cast automatico de short hacia int: " + result);
    }
}
