package firstclasses;
public class Chicken {
    int numEggs=12; //variable de instancia
    String name;
    public Chicken() {
        name="Ducke";//constructor inicializador
        System.out.println("Dentro del constructor de Chicken");        
    }
    public static void main(String[] args) {
        Chicken ch=new Chicken();//crea un objeto de tipo Chicken
        System.out.println("Nombre de la gallina: "+ch.name);
        System.out.println("Numero de huevos: "+ch.numEggs);
    }

}
