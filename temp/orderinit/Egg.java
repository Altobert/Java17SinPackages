package orderinit;

public class Egg {


    public Egg() {
        number = 5;
    }

	// desde aca se inicia el programa
    public static void main(String [] args) {
  		//al inicializar el objeto, se setea number con 3, despues 4, y luego lo del constructor, 5, resultado final
  		//5
  		Egg egg = new Egg(); // Crea un objeto Egg

        System.out.println(egg.number); // Imprime el número del huevo
    }


    private int number = 3; // variable de instancia

    {
        number = 4; // bloque de inicialización
    }
}
