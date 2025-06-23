
public class Chick {

    private String name="Fluffy"; // variable de instancia
    {
        System.out.println("settigns field");
    }
    public Chick() {
        name = "Tiny";  // constructor inicializador
        System.out.println("setting constructor");
    }
    // Este es el punto de entrada de la aplicacion, el  metodo main.
    public static void main(String[] args) {
        Chick chick = new Chick(); // crea un objeto Chick
        System.out.println(chick.name); // imprime el nombre del Chick
    }


}