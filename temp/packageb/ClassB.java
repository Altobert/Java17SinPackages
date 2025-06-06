package packageb;

import packagea.ClassA;
import packagec.ClassC;
import structure.Meerkat;

public class ClassB {
    public void methodB() {
        System.out.println("methodB en la clase ClassB");
    }
    
    public static void main(String[] args) {
        ClassA a = new ClassA();        
        a.methodA();    
        ClassB b = new ClassB();
        b.methodB();
        ClassC c = new ClassC(); // Asegúrate de importar ClassC si está en otro paquete
        c.methodC(); // Llama al método methodC de ClassC
        Meerkat meerkat = new Meerkat();
        meerkat.setWeight(9.5);
        meerkat.setHeight(30.0);        
        meerkat.getWeight();
        meerkat.getHeight();                
    }
}