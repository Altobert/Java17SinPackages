public class Egg {

    //3)
    public Egg() {
        number = 5;
    }

    public static void main(String [] args) {
        Egg egg = new Egg(); // Crea un objeto Egg
        //4)
        System.out.println(egg.number); // Imprime el número del huevo
    }

    //1)
    private int number = 3; // variable de instancia
    //2)
    {
        number = 4; // bloque de inicialización
    }
}
