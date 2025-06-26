
public class Chick {

    private String name="Fluffy"; // variable de instancia

    { System.out.println("settigns field");  }

    public Chick() {
        name = "Tiny";  // constructor inicializador
        System.out.println("setting constructor");
    }
    
    // Este es el punto de entrada de la aplicacion, el  metodo main.

    public static void main(String[] args) {
        Chick chick = new Chick(); // crea un objeto Chick
        System.out.println(chick.name); // imprime el nombre del Chick
    }

    /*
     Primero se ejecuta main,
     Luego se crea objeto Chick, inicializando el constructor, 
        se setea el nombre fluffy,
        Luego se ejecuta el bloque de inicializacion, "settigns field",
        Se inicializa el constructor, 
            se setea el nombre tiny,
            luego "setting constructor",

    */


}