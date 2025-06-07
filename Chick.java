
public class Chick {

    // se setea al inicio
    private String nameString = "Fluffy";

    // 1
    {System.out.println("setting field");}

    public Chick() {
        // se reemplaza.
        nameString = "Tinny";
        System.out.println("setting constructor");
    }

    // java comienza su ejecucion desde el main 
    public static void main(String[] args) {        
        // primero entra al bloque main
        // se ejecuta el constructor y se setea el campo nameString con "Fluffy"
        // luego se ejecuta el bloque inicializador de instancia "setting field"
        // vuelve el contol al constructor y se setea Tinny y luego se imprime setting constructor.
        // finalmente se imprime el valor de nameString que es "Tinny"
        Chick chick = new Chick();
        System.out.println(chick.nameString);
    }

    /** orden que aparecen en codigo.
     * setting field
     * setting constructor
     * Tiny
     */


}