
public class Chick {

    private String name="Fluffy"; // variable de instancia
    {
        System.out.println("settigns field");
    }
    public Chick() {
        name = "Tiny";  // constructor inicializador
        System.out.println("Setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick(); // crea un objeto Chick
        System.out.println(chick.name); // imprime el nombre del Chick
    }


}